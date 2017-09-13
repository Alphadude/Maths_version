package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class BlcLesson2Activity extends AppCompatActivity {
    private TextToSpeech ttsObject;
    private int result;
    private String text;

    private Button testButton;
    private Button repeatButton;
    private Intent intent;

    private ArrayList<Integer> numbers;
    private ArrayList<String> numberText;

    private ArrayAdapter<Integer> numberAdapter;

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blc_lesson2);

        intent = new Intent(this, BlcLesson2Activity.class);
        TextView tv = (TextView)findViewById(R.id.blc_lesson2_text1);

        ttsObject = new TextToSpeech(BlcLesson2Activity.this, new TextToSpeech.OnInitListener() {
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



            numbers = new ArrayList<>();
            for (int i = 1; i <= 50; ++i) {
                numbers.add(i);
            }

            numberText = new ArrayList<>();
            numberText.add("one");
            numberText.add("two");
            numberText.add("three");
            numberText.add("four");
            numberText.add("five");
            numberText.add("six");
            numberText.add("seven");
            numberText.add("eight");
            numberText.add("nine");
            numberText.add("ten");
            numberText.add("eleven");
            numberText.add("twelve");
            numberText.add("thirteen");
            numberText.add("fourteen");
            numberText.add("fifteen");
            numberText.add("sixteen");
            numberText.add("seventeen");
            numberText.add("eighteen");
            numberText.add("nineteen");
            numberText.add("twenty");
            numberText.add("twenty-one");
            numberText.add("twenty-two");
            numberText.add("twenty-three");
            numberText.add("twenty-four");
            numberText.add("twenty-five");
            numberText.add("twenty-six");
            numberText.add("twenty-seven");
            numberText.add("twenty-eight");
            numberText.add("twenty-nine");
            numberText.add("thirty");
            numberText.add("thirty-one");
            numberText.add("thirty-two");
            numberText.add("thirty-three");
            numberText.add("thirty-four");
            numberText.add("thirty-five");
            numberText.add("thirty-six");
            numberText.add("thirty-seven");
            numberText.add("thirty-eight");
            numberText.add("thirty-nine");
            numberText.add("forty");
            numberText.add("forty-one");
            numberText.add("forty-two");
            numberText.add("forty-three");
            numberText.add("forty-four");
            numberText.add("forty-five");
            numberText.add("forty-six");
            numberText.add("forty-seven");
            numberText.add("forty-eight");
            numberText.add("forty-nine");
            numberText.add("fifty");



        numberAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numbers);
        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(numberAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                numbers.get(position);
                text = numberText.get(position);
                playSound(text);
            }
        });

        testButton = (Button) findViewById(R.id.blc_lesson2_testButton);
        repeatButton = (Button) findViewById(R.id.blc_lesson2_repeatButton);

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getIntent().hasExtra("changeButton")) {
                    Intent intent = new Intent(BlcLesson2Activity.this, BlcTest2Activity.class);
                    intent.putExtra("changeBtn", "changeBtn");
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(BlcLesson2Activity.this, BlcTest2Activity.class);
                    startActivity(intent);
                }
            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (ttsObject != null) {
            ttsObject.stop();
            ttsObject.shutdown();
        }

    }

    private void playSound(String tt) {
        //play text..text to speech
        if (result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA) {
            Toast.makeText(getApplicationContext(), "Feature not supported in your device", Toast.LENGTH_SHORT).show();

        } else {
            ttsObject.speak(tt, TextToSpeech.QUEUE_FLUSH, null);

        }
    }
}
