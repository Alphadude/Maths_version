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

public class IlcLesson3iFragment extends Fragment {
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


    public IlcLesson3iFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);


        intent = new Intent(getActivity(), IlcLesson3iFragment.class);
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
        for (int i = 501; i <= 600; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();

        numberText.add("five hundred and one");
        numberText.add("five hundred and two");
        numberText.add("five hundred and three");
        numberText.add("five hundred and four");
        numberText.add("five hundred and five");
        numberText.add("five hundred and six");
        numberText.add("five hundred and seven");
        numberText.add("five hundred and eight");
        numberText.add("five hundred and nine");
        numberText.add("five hundred and ten");
        numberText.add("five hundred and eleven");
        numberText.add("five hundred and twelve");
        numberText.add("five hundred and thirteen");
        numberText.add("five hundred and fourteen");
        numberText.add("five hundred and fifteen");
        numberText.add("five hundred and sixteen");
        numberText.add("five hundred and seventeen");
        numberText.add("five hundred and eighteen");
        numberText.add("five hundred and nineteen");
        numberText.add("five hundred and twenty");
        numberText.add("five hundred and twenty-one");
        numberText.add("five hundred and twenty-two");
        numberText.add("five hundred and twenty-three");
        numberText.add("five hundred and twenty-four");
        numberText.add("five hundred and twenty-five");
        numberText.add("five hundred and twenty-six");
        numberText.add("five hundred and twenty-seven");
        numberText.add("five hundred and twenty-eight");
        numberText.add("five hundred and twenty-nine");
        numberText.add("five hundred and thirty");
        numberText.add("five hundred and thirty-one");
        numberText.add("five hundred and thirty-two");
        numberText.add("five hundred and thirty-three");
        numberText.add("five hundred and thirty-four");
        numberText.add("five hundred and thirty-five");
        numberText.add("five hundred and thirty-six");
        numberText.add("five hundred and thirty-seven");
        numberText.add("five hundred and thirty-eight");
        numberText.add("five hundred and thirty-nine");

        numberText.add("five hundred and forty");
        numberText.add("five hundred and forty-one");
        numberText.add("five hundred and forty-two");
        numberText.add("five hundred and forty-three");
        numberText.add("five hundred and forty-four");
        numberText.add("five hundred and forty-five");
        numberText.add("five hundred and forty-six");
        numberText.add("five hundred and forty-seven");
        numberText.add("five hundred and forty-eight");
        numberText.add("five hundred and forty-nine");
        numberText.add("five hundred and fifty");
        numberText.add("five hundred and fifty-one");
        numberText.add("five hundred and fifty-two");
        numberText.add("five hundred and fifty-three");
        numberText.add("five hundred and fifty-four");
        numberText.add("five hundred and fifty-five");
        numberText.add("five hundred and fifty-six");
        numberText.add("five hundred and fifty-seven");
        numberText.add("five hundred and fifty-eight");
        numberText.add("five hundred and fifty-nine");
        numberText.add("five hundred and sixty");
        numberText.add("five hundred and sixty-one");
        numberText.add("five hundred and sixty-two");
        numberText.add("five hundred and sixty-three");
        numberText.add("five hundred and sixty-four");
        numberText.add("five hundred and sixty-five");
        numberText.add("five hundred and sixty-six");
        numberText.add("five hundred and sixty-seven");
        numberText.add("five hundred and sixty-eight");
        numberText.add("five hundred and sixty-nine");
        numberText.add("five hundred and seventy");
        numberText.add("five hundred and seventy-one");
        numberText.add("five hundred and seventy-two");
        numberText.add("five hundred and seventy-three");
        numberText.add("five hundred and seventy-four");
        numberText.add("five hundred and seventy-five");
        numberText.add("five hundred and seventy-six");
        numberText.add("five hundred and seventy-seven");
        numberText.add("five hundred and seventy-eight");
        numberText.add("five hundred and seventy-nine");
        numberText.add("five hundred and eighty");
        numberText.add("five hundred and eighty-one");
        numberText.add("five hundred and eighty-two");
        numberText.add("five hundred and eighty-three");
        numberText.add("five hundred and eighty-four");
        numberText.add("five hundred and eighty-five");
        numberText.add("five hundred and eighty-six");
        numberText.add("five hundred and eighty-seven");
        numberText.add("five hundred and eighty-eight");
        numberText.add("five hundred and eighty-nine");
        numberText.add("five hundred and ninety");

        numberText.add("five hundred and ninety-one");
        numberText.add("five hundred and ninety-two");
        numberText.add("five hundred and ninety-three");
        numberText.add("five hundred and ninety-four");
        numberText.add("five hundred and ninety-five");
        numberText.add("five hundred and ninety-six");
        numberText.add("five hundred and ninety-seven");
        numberText.add("five hundred and ninety-eight");
        numberText.add("five hundred and ninety-nine");
        numberText.add("six hundred");


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

                frag = new IlcLesson3jFragment();
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
