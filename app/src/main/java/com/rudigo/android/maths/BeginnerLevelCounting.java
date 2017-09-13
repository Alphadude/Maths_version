package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import static com.rudigo.android.maths.R.id.blcTestBtn;

public class BeginnerLevelCounting extends AppCompatActivity {
    Intent intent;

    TextView numberText;
    int i;

    TextToSpeech ttsObject;
    int result;
    String text;

     ArrayList<String> numberTextList;
     ArrayList<String> testNumbers;
   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_level_counting);

        int i = 0;

        numberText = (TextView) findViewById(R.id.blcNumberText);

        intent = new Intent(this, BeginnerLevelCounting.class);

        ttsObject = new TextToSpeech(BeginnerLevelCounting.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    //set Language
                    result = ttsObject.setLanguage(Locale.UK);
                } else {
                    Toast.makeText(getApplicationContext(), "Feature not supported in your device", Toast.LENGTH_SHORT).show();
                }

            }
        });


        Button repeatBtn = (Button) findViewById(R.id.repeatButton);
        Button testBtn = (Button) findViewById(blcTestBtn);


        repeatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(intent);

            }
        });

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BeginnerLevelCountingInstruction.class);
                startActivity(intent);

            }
        });


        testNumbers = new ArrayList<>();
        testNumbers.add("0");
        testNumbers.add("1");
        testNumbers.add("2");
        testNumbers.add("3");
        testNumbers.add("4");
        testNumbers.add("5");
        testNumbers.add("6");
        testNumbers.add("7");
        testNumbers.add("8");
        testNumbers.add("9");
        testNumbers.add("10");



//        numberText.setText("0");


        numberTextList = new ArrayList<>();
        numberTextList.add("zero");
        numberTextList.add("one");
        numberTextList.add("two");
        numberTextList.add("three");
        numberTextList.add("four");
        numberTextList.add("five");
        numberTextList.add("six");
        numberTextList.add("seven");
        numberTextList.add("eight");
        numberTextList.add("nine");
        numberTextList.add("ten");
    }

    public void changeText() {
        if (i < testNumbers.size()) {
            numberText.setText(testNumbers.get(i));

        } else {
            Toast.makeText(getApplicationContext(), "Whoo! you've reached the end", Toast.LENGTH_SHORT).show();
        }
    }

    public void textOnclick(View view) {
        changeText();
        //play sound
        playSound();
        i= i+1;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (ttsObject != null) {
            ttsObject.stop();
            ttsObject.shutdown();
        }

    }

    private void playSound() {
        if(i < numberTextList.size()){
            text = numberTextList.get(i);


            //play text..text to speech
            if (result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA) {
                Toast.makeText(getApplicationContext(), "Feature not supported in your device", Toast.LENGTH_SHORT).show();

            } else {
                ttsObject.speak(text, TextToSpeech.QUEUE_FLUSH, null);

            }
        }else{
            Toast.makeText(getApplicationContext(), "Whoo! you've reached the end", Toast.LENGTH_SHORT).show();
        }

    }


}
