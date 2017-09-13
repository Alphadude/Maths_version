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

public class BlcLesson4bActivity extends AppCompatActivity {
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

        intent = new Intent(this, BlcLesson4bActivity.class);
        TextView tv = (TextView) findViewById(R.id.blc_lesson2_text1);

        ttsObject = new TextToSpeech(BlcLesson4bActivity.this, new TextToSpeech.OnInitListener() {
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


        tv.setText("Lesson 4");
        numbers = new ArrayList<>();
        for (int i = 51; i <= 100; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();
        numberText.add("fifty-one");
        numberText.add("fifty-two");
        numberText.add("fifty-three");
        numberText.add("fifty-four");
        numberText.add("fifty-five");
        numberText.add("fifty-six");
        numberText.add("fifty-seven");
        numberText.add("fifty-eight");
        numberText.add("fifty-nine");
        numberText.add("sixty");
        numberText.add("sixty-one"); //"\"sixty-one\""
        numberText.add("sixty-two");
        numberText.add("sixty-three");
        numberText.add("sixty-four");
        numberText.add("sixty-five");
        numberText.add("sixty-six");
        numberText.add("sixty-seven");
        numberText.add("sixty-eigth");
        numberText.add("sixty-nine");
        numberText.add("seventy");
        numberText.add("seventy-one");
        numberText.add("seventy-two");
        numberText.add("seventy-three");
        numberText.add("seventy-four");
        numberText.add("seventy-five");
        numberText.add("seventy-six");
        numberText.add("seventy-seven");
        numberText.add("seventy-eight");
        numberText.add("seventy-nine");
        numberText.add("eighty");
        numberText.add("eighty-one");
        numberText.add("eighty-two");
        numberText.add("eighty-three");
        numberText.add("eighty-four");
        numberText.add("eighty-five");
        numberText.add("eighty-six");
        numberText.add("eighty-seven");
        numberText.add("eighty-eight");
        numberText.add("eighty-nine");
        numberText.add("ninety");
        numberText.add("ninety-one");
        numberText.add("ninety-two");
        numberText.add("ninety-three");
        numberText.add("ninety-four");
        numberText.add("ninety-five");
        numberText.add("ninety-six");
        numberText.add("ninety-seven");
        numberText.add("ninety-eight");
        numberText.add("ninety-nine");
        numberText.add("hundred");


        numberAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numbers);
        gridView = (GridView)

                findViewById(R.id.gridView);

        gridView.setAdapter(numberAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                numbers.get(position);
                text = numberText.get(position);
                playSound(text);
            }
        });

        testButton = (Button) findViewById(R.id.blc_lesson2_testButton);

        repeatButton = (Button) findViewById(R.id.blc_lesson2_repeatButton);

        testButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
//                if (getIntent().hasExtra("changeButton")) {
//                    Intent intent = new Intent(BlcLesson4bActivity.this, BlcTest2Activity.class);
//                    intent.putExtra("changeBtn", "changeBtn");
//                    startActivity(intent);
//                } else {
//                    Intent intent = new Intent(BlcLesson4bActivity.this, BlcTest2Activity.class);
//                    startActivity(intent);
//                }
                Intent intent = new Intent(getApplicationContext(), BlcLesson4Test.class);
                startActivity(intent);
            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener()

        {
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
