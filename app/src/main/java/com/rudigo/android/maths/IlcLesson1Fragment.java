package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class IlcLesson1Fragment extends Fragment {
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

    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;

    Bundle bundle;


    public IlcLesson1Fragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.activity_blc_lesson2, container, false);


        intent = new Intent(getActivity(), IlcLesson1Fragment.class);
        TextView tv = rootView.findViewById(R.id.blc_lesson2_text1);

        ttsObject = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    //set Language
                    result = ttsObject.setLanguage(Locale.UK);
                } else {
                    Toast.makeText(getContext(), "Feature not supported in your device", Toast.LENGTH_SHORT).show();
                }

            }
        });


        tv.setText("Intermediate Lesson 1");
        numbers = new ArrayList<>();
        for (int i = 91; i <= 200; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();

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
        numberText.add("hundred and one");
        numberText.add("hundred and two");
        numberText.add("hundred and three");
        numberText.add("hundred and four");
        numberText.add("hundred and five");
        numberText.add("hundred and six");
        numberText.add("hundred and seven");
        numberText.add("hundred and eight");
        numberText.add("hundred and nine");
        numberText.add("hundred and ten");
        numberText.add("hundred and eleven");
        numberText.add("hundred and twelve");
        numberText.add("hundred and thirteen");
        numberText.add("hundred and fourteen");
        numberText.add("hundred and fifteen");
        numberText.add("hundred and sixteen");
        numberText.add("hundred and seventeen");
        numberText.add("hundred and eighteen");
        numberText.add("hundred and nineteen");
        numberText.add("hundred and twenty");
        numberText.add("hundred and twenty-one");
        numberText.add("hundred and twenty-two");
        numberText.add("hundred and twenty-three");
        numberText.add("hundred and twenty-four");
        numberText.add("hundred and twenty-five");
        numberText.add("hundred and twenty-six");
        numberText.add("hundred and twenty-seven");
        numberText.add("hundred and twenty-eight");
        numberText.add("hundred and twenty-nine");
        numberText.add("hundred and thirty");
        numberText.add("hundred and thirty-one");
        numberText.add("hundred and thirty-two");
        numberText.add("hundred and thirty-three");
        numberText.add("hundred and thirty-four");
        numberText.add("hundred and thirty-five");
        numberText.add("hundred and thirty-six");
        numberText.add("hundred and thirty-seven");
        numberText.add("hundred and thirty-eight");
        numberText.add("hundred and thirty-nine");

        numberText.add("hundred and forty");
        numberText.add("hundred and forty-one");
        numberText.add("hundred and forty-two");
        numberText.add("hundred and forty-three");
        numberText.add("hundred and forty-four");
        numberText.add("hundred and forty-five");
        numberText.add("hundred and forty-six");
        numberText.add("hundred and forty-seven");
        numberText.add("hundred and forty-eight");
        numberText.add("hundred and forty-nine");
        numberText.add("hundred and fifty");
        numberText.add("hundred and fifty-one");
        numberText.add("hundred and fifty-two");
        numberText.add("hundred and fifty-three");
        numberText.add("hundred and fifty-four");
        numberText.add("hundred and fifty-five");
        numberText.add("hundred and fifty-six");
        numberText.add("hundred and fifty-seven");
        numberText.add("hundred and fifty-eight");
        numberText.add("hundred and fifty-nine");
        numberText.add("hundred and sixty");
        numberText.add("hundred and sixty-one");
        numberText.add("hundred and sixty-two");
        numberText.add("hundred and sixty-three");
        numberText.add("hundred and sixty-four");
        numberText.add("hundred and sixty-five");
        numberText.add("hundred and sixty-six");
        numberText.add("hundred and sixty-seven");
        numberText.add("hundred and sixty-eight");
        numberText.add("hundred and sixty-nine");
        numberText.add("hundred and seventy");
        numberText.add("hundred and seventy-one");
        numberText.add("hundred and seventy-two");
        numberText.add("hundred and seventy-three");
        numberText.add("hundred and seventy-four");
        numberText.add("hundred and seventy-five");
        numberText.add("hundred and seventy-six");
        numberText.add("hundred and seventy-seven");
        numberText.add("hundred and seventy-eight");
        numberText.add("hundred and seventy-nine");
        numberText.add("hundred and eighty");
        numberText.add("hundred and eighty-one");
        numberText.add("hundred and eighty-two");
        numberText.add("hundred and eighty-three");
        numberText.add("hundred and eighty-four");
        numberText.add("hundred and eighty-five");
        numberText.add("hundred and eighty-six");
        numberText.add("hundred and eighty-seven");
        numberText.add("hundred and eighty-eight");
        numberText.add("hundred and eighty-nine");
        numberText.add("hundred and ninety");

        numberText.add("hundred and ninety-one");
        numberText.add("hundred and ninety-two");
        numberText.add("hundred and ninety-three");
        numberText.add("hundred and ninety-four");
        numberText.add("hundred and ninety-five");
        numberText.add("hundred and ninety-six");
        numberText.add("hundred and ninety-seven");
        numberText.add("hundred and ninety-eight");
        numberText.add("hundred and ninety-nine");
        numberText.add("two hundred");


        numberAdapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_list_item_1, numbers);
        gridView = rootView.findViewById(R.id.gridView);

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

        testButton = rootView.findViewById(R.id.blc_lesson2_testButton);

        repeatButton = rootView.findViewById(R.id.blc_lesson2_repeatButton);

       bundle = new Bundle();

        testButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                if(getArguments()!= null){
                    //has bundle extra, change button text

                    bundle.putString("val", "val");

                    fragTransaction = getFragmentManager().beginTransaction();
                    fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                    frag = new IlcTest1Fragment();
                    frag.setArguments(bundle);
                    fragTransaction.replace(R.id.main_container, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();
                }else{
                    fragTransaction = getFragmentManager().beginTransaction();
                    fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                    frag = new IlcTest1Fragment();
                    fragTransaction.replace(R.id.main_container, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();
                }


            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                repeat();
            }
        });
        return rootView;
    }

    private void repeat() {
        fragTransaction = getFragmentManager().beginTransaction();
        fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        frag = new IlcLesson1Fragment();
        fragTransaction.replace(R.id.main_container, frag);
        fragTransaction.addToBackStack(null);
        fragTransaction.commit();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (ttsObject != null) {
            ttsObject.stop();
            ttsObject.shutdown();
        }

    }

    private void playSound(String tt) {
        //play text..text to speech
        if (result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA) {
            Toast.makeText(getActivity(), "Feature not supported in your device", Toast.LENGTH_SHORT).show();

        } else {
            ttsObject.speak(tt, TextToSpeech.QUEUE_FLUSH, null);

        }
    }
}
