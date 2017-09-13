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

public class IlcLesson3dFragment extends Fragment {
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


    public IlcLesson3dFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);


        intent = new Intent(getActivity(), IlcLesson3dFragment.class);
        TextView tv = rootView.findViewById(R.id.foundationFrag_textView);

        Button repeatButton = rootView.findViewById(R.id.repeatLesson1Btn);
        Button continueButton = rootView.findViewById(R.id.blcTestContinueBtn);



        repeatButton.setVisibility(View.GONE);

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


       tv.setText("Activity ");
        numbers = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
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




        numberAdapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_list_item_1, numbers);
        gridView = rootView.findViewById(R.id.test_gridView);

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





        continueButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                    frag = new IlcLesson3eFragment();
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();
            }
        });

        return rootView;
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
