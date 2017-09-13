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

public class IlcLesson3kFragment extends Fragment {
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


    public IlcLesson3kFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);


        intent = new Intent(getActivity(), IlcLesson3kFragment.class);
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
        for (int i = 701; i <= 800; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();


        numberText.add("seven hundred and one");
        numberText.add("seven hundred and two");
        numberText.add("seven hundred and three");
        numberText.add("seven hundred and four");
        numberText.add("seven hundred and five");
        numberText.add("seven hundred and six");
        numberText.add("seven hundred and seven");
        numberText.add("seven hundred and eight");
        numberText.add("seven hundred and nine");
        numberText.add("seven hundred and ten");
        numberText.add("seven hundred and eleven");
        numberText.add("seven hundred and twelve");
        numberText.add("seven hundred and thirteen");
        numberText.add("seven hundred and fourteen");
        numberText.add("seven hundred and fifteen");
        numberText.add("seven hundred and sixteen");
        numberText.add("seven hundred and seventeen");
        numberText.add("seven hundred and eighteen");
        numberText.add("seven hundred and nineteen");
        numberText.add("seven hundred and twenty");
        numberText.add("seven hundred and twenty-one");
        numberText.add("seven hundred and twenty-two");
        numberText.add("seven hundred and twenty-three");
        numberText.add("seven hundred and twenty-four");
        numberText.add("seven hundred and twenty-five");
        numberText.add("seven hundred and twenty-six");
        numberText.add("seven hundred and twenty-seven");
        numberText.add("seven hundred and twenty-eight");
        numberText.add("seven hundred and twenty-nine");
        numberText.add("seven hundred and thirty");
        numberText.add("seven hundred and thirty-one");
        numberText.add("seven hundred and thirty-two");
        numberText.add("seven hundred and thirty-three");
        numberText.add("seven hundred and thirty-four");
        numberText.add("seven hundred and thirty-five");
        numberText.add("seven hundred and thirty-six");
        numberText.add("seven hundred and thirty-seven");
        numberText.add("seven hundred and thirty-eight");
        numberText.add("seven hundred and thirty-nine");

        numberText.add("seven hundred and forty");
        numberText.add("seven hundred and forty-one");
        numberText.add("seven hundred and forty-two");
        numberText.add("seven hundred and forty-three");
        numberText.add("seven hundred and forty-four");
        numberText.add("seven hundred and forty-five");
        numberText.add("seven hundred and forty-six");
        numberText.add("seven hundred and forty-seven");
        numberText.add("seven hundred and forty-eight");
        numberText.add("seven hundred and forty-nine");
        numberText.add("seven hundred and fifty");
        numberText.add("seven hundred and fifty-one");
        numberText.add("seven hundred and fifty-two");
        numberText.add("seven hundred and fifty-three");
        numberText.add("seven hundred and fifty-four");
        numberText.add("seven hundred and fifty-five");
        numberText.add("seven hundred and fifty-six");
        numberText.add("seven hundred and fifty-seven");
        numberText.add("seven hundred and fifty-eight");
        numberText.add("seven hundred and fifty-nine");
        numberText.add("seven hundred and sixty");
        numberText.add("seven hundred and sixty-one");
        numberText.add("seven hundred and sixty-two");
        numberText.add("seven hundred and sixty-three");
        numberText.add("seven hundred and sixty-four");
        numberText.add("seven hundred and sixty-five");
        numberText.add("seven hundred and sixty-six");
        numberText.add("seven hundred and sixty-seven");
        numberText.add("seven hundred and sixty-eight");
        numberText.add("seven hundred and sixty-nine");
        numberText.add("seven hundred and seventy");
        numberText.add("seven hundred and seventy-one");
        numberText.add("seven hundred and seventy-two");
        numberText.add("seven hundred and seventy-three");
        numberText.add("seven hundred and seventy-four");
        numberText.add("seven hundred and seventy-five");
        numberText.add("seven hundred and seventy-six");
        numberText.add("seven hundred and seventy-seven");
        numberText.add("seven hundred and seventy-eight");
        numberText.add("seven hundred and seventy-nine");
        numberText.add("seven hundred and eighty");
        numberText.add("seven hundred and eighty-one");
        numberText.add("seven hundred and eighty-two");
        numberText.add("seven hundred and eighty-three");
        numberText.add("seven hundred and eighty-four");
        numberText.add("seven hundred and eighty-five");
        numberText.add("seven hundred and eighty-six");
        numberText.add("seven hundred and eighty-seven");
        numberText.add("seven hundred and eighty-eight");
        numberText.add("seven hundred and eighty-nine");
        numberText.add("seven hundred and ninety");

        numberText.add("seven hundred and ninety-one");
        numberText.add("seven hundred and ninety-two");
        numberText.add("seven hundred and ninety-three");
        numberText.add("seven hundred and ninety-four");
        numberText.add("seven hundred and ninety-five");
        numberText.add("seven hundred and ninety-six");
        numberText.add("seven hundred and ninety-seven");
        numberText.add("seven hundred and ninety-eight");
        numberText.add("seven hundred and ninety-nine");
        numberText.add("eight hundred");


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


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag = new IlcLesson3lFragment();
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
