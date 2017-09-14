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

public class IlcLesson3fFragment extends Fragment {
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


    public IlcLesson3fFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);


        intent = new Intent(getActivity(), IlcLesson3fFragment.class);
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
        for (int i = 201; i <= 300; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();


        numberText.add("two hundred and one");
        numberText.add("two hundred and two");
        numberText.add("two hundred and three");
        numberText.add("two hundred and four");
        numberText.add("two hundred and five");
        numberText.add("two hundred and six");
        numberText.add("two hundred and seven");
        numberText.add("two hundred and eight");
        numberText.add("two hundred and nine");
        numberText.add("two hundred and ten");
        numberText.add("two hundred and eleven");
        numberText.add("two hundred and twelve");
        numberText.add("two hundred and thirteen");
        numberText.add("two hundred and fourteen");
        numberText.add("two hundred and fifteen");
        numberText.add("two hundred and sixteen");
        numberText.add("two hundred and seventeen");
        numberText.add("two hundred and eighteen");
        numberText.add("two hundred and nineteen");
        numberText.add("two hundred and twenty");
        numberText.add("two hundred and twenty-one");
        numberText.add("two hundred and twenty-two");
        numberText.add("two hundred and twenty-three");
        numberText.add("two hundred and twenty-four");
        numberText.add("two hundred and twenty-five");
        numberText.add("two hundred and twenty-six");
        numberText.add("two hundred and twenty-seven");
        numberText.add("two hundred and twenty-eight");
        numberText.add("two hundred and twenty-nine");
        numberText.add("two hundred and thirty");
        numberText.add("two hundred and thirty-one");
        numberText.add("two hundred and thirty-two");
        numberText.add("two hundred and thirty-three");
        numberText.add("two hundred and thirty-four");
        numberText.add("two hundred and thirty-five");
        numberText.add("two hundred and thirty-six");
        numberText.add("two hundred and thirty-seven");
        numberText.add("two hundred and thirty-eight");
        numberText.add("two hundred and thirty-nine");

        numberText.add("two hundred and forty");
        numberText.add("two hundred and forty-one");
        numberText.add("two hundred and forty-two");
        numberText.add("two hundred and forty-three");
        numberText.add("two hundred and forty-four");
        numberText.add("two hundred and forty-five");
        numberText.add("two hundred and forty-six");
        numberText.add("two hundred and forty-seven");
        numberText.add("two hundred and forty-eight");
        numberText.add("two hundred and forty-nine");
        numberText.add("two hundred and fifty");
        numberText.add("two hundred and fifty-one");
        numberText.add("two hundred and fifty-two");
        numberText.add("two hundred and fifty-three");
        numberText.add("two hundred and fifty-four");
        numberText.add("two hundred and fifty-five");
        numberText.add("two hundred and fifty-six");
        numberText.add("two hundred and fifty-seven");
        numberText.add("two hundred and fifty-eight");
        numberText.add("two hundred and fifty-nine");
        numberText.add("two hundred and sixty");
        numberText.add("two hundred and sixty-one");
        numberText.add("two hundred and sixty-two");
        numberText.add("two hundred and sixty-three");
        numberText.add("two hundred and sixty-four");
        numberText.add("two hundred and sixty-five");
        numberText.add("two hundred and sixty-six");
        numberText.add("two hundred and sixty-seven");
        numberText.add("two hundred and sixty-eight");
        numberText.add("two hundred and sixty-nine");
        numberText.add("two hundred and seventy");
        numberText.add("two hundred and seventy-one");
        numberText.add("two hundred and seventy-two");
        numberText.add("two hundred and seventy-three");
        numberText.add("two hundred and seventy-four");
        numberText.add("two hundred and seventy-five");
        numberText.add("two hundred and seventy-six");
        numberText.add("two hundred and seventy-seven");
        numberText.add("two hundred and seventy-eight");
        numberText.add("two hundred and seventy-nine");
        numberText.add("two hundred and eighty");
        numberText.add("two hundred and eighty-one");
        numberText.add("two hundred and eighty-two");
        numberText.add("two hundred and eighty-three");
        numberText.add("two hundred and eighty-four");
        numberText.add("two hundred and eighty-five");
        numberText.add("two hundred and eighty-six");
        numberText.add("two hundred and eighty-seven");
        numberText.add("two hundred and eighty-eight");
        numberText.add("two hundred and eighty-nine");
        numberText.add("two hundred and ninety");

        numberText.add("two hundred and ninety-one");
        numberText.add("two hundred and ninety-two");
        numberText.add("two hundred and ninety-three");
        numberText.add("two hundred and ninety-four");
        numberText.add("two hundred and ninety-five");
        numberText.add("two hundred and ninety-six");
        numberText.add("two hundred and ninety-seven");
        numberText.add("two hundred and ninety-eight");
        numberText.add("two hundred and ninety-nine");
        numberText.add("three hundred");


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
                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);

                frag = new IlcLesson3gFragment();
                fragTransaction.replace(R.id.main_container, frag);
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
