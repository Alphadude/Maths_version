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

public class IlcLesson3gFragment extends Fragment {
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


    public IlcLesson3gFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);


        intent = new Intent(getActivity(), IlcLesson3gFragment.class);
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
        for (int i = 301; i <= 400; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();


        numberText.add("three hundred and one");
        numberText.add("three hundred and two");
        numberText.add("three hundred and three");
        numberText.add("three hundred and four");
        numberText.add("three hundred and five");
        numberText.add("three hundred and six");
        numberText.add("three hundred and seven");
        numberText.add("three hundred and eight");
        numberText.add("three hundred and nine");
        numberText.add("three hundred and ten");
        numberText.add("three hundred and eleven");
        numberText.add("three hundred and twelve");
        numberText.add("three hundred and thirteen");
        numberText.add("three hundred and fourteen");
        numberText.add("three hundred and fifteen");
        numberText.add("three hundred and sixteen");
        numberText.add("three hundred and seventeen");
        numberText.add("three hundred and eighteen");
        numberText.add("three hundred and nineteen");
        numberText.add("three hundred and twenty");
        numberText.add("three hundred and twenty-one");
        numberText.add("three hundred and twenty-two");
        numberText.add("three hundred and twenty-three");
        numberText.add("three hundred and twenty-four");
        numberText.add("three hundred and twenty-five");
        numberText.add("three hundred and twenty-six");
        numberText.add("three hundred and twenty-seven");
        numberText.add("three hundred and twenty-eight");
        numberText.add("three hundred and twenty-nine");
        numberText.add("three hundred and thirty");
        numberText.add("three hundred and thirty-one");
        numberText.add("three hundred and thirty-two");
        numberText.add("three hundred and thirty-three");
        numberText.add("three hundred and thirty-four");
        numberText.add("three hundred and thirty-five");
        numberText.add("three hundred and thirty-six");
        numberText.add("three hundred and thirty-seven");
        numberText.add("three hundred and thirty-eight");
        numberText.add("three hundred and thirty-nine");

        numberText.add("three hundred and forty");
        numberText.add("three hundred and forty-one");
        numberText.add("three hundred and forty-two");
        numberText.add("three hundred and forty-three");
        numberText.add("three hundred and forty-four");
        numberText.add("three hundred and forty-five");
        numberText.add("three hundred and forty-six");
        numberText.add("three hundred and forty-seven");
        numberText.add("three hundred and forty-eight");
        numberText.add("three hundred and forty-nine");
        numberText.add("three hundred and fifty");
        numberText.add("three hundred and fifty-one");
        numberText.add("three hundred and fifty-two");
        numberText.add("three hundred and fifty-three");
        numberText.add("three hundred and fifty-four");
        numberText.add("three hundred and fifty-five");
        numberText.add("three hundred and fifty-six");
        numberText.add("three hundred and fifty-seven");
        numberText.add("three hundred and fifty-eight");
        numberText.add("three hundred and fifty-nine");
        numberText.add("three hundred and sixty");
        numberText.add("three hundred and sixty-one");
        numberText.add("three hundred and sixty-two");
        numberText.add("three hundred and sixty-three");
        numberText.add("three hundred and sixty-four");
        numberText.add("three hundred and sixty-five");
        numberText.add("three hundred and sixty-six");
        numberText.add("three hundred and sixty-seven");
        numberText.add("three hundred and sixty-eight");
        numberText.add("three hundred and sixty-nine");
        numberText.add("three hundred and seventy");
        numberText.add("three hundred and seventy-one");
        numberText.add("three hundred and seventy-two");
        numberText.add("three hundred and seventy-three");
        numberText.add("three hundred and seventy-four");
        numberText.add("three hundred and seventy-five");
        numberText.add("three hundred and seventy-six");
        numberText.add("three hundred and seventy-seven");
        numberText.add("three hundred and seventy-eight");
        numberText.add("three hundred and seventy-nine");
        numberText.add("three hundred and eighty");
        numberText.add("three hundred and eighty-one");
        numberText.add("three hundred and eighty-two");
        numberText.add("three hundred and eighty-three");
        numberText.add("three hundred and eighty-four");
        numberText.add("three hundred and eighty-five");
        numberText.add("three hundred and eighty-six");
        numberText.add("three hundred and eighty-seven");
        numberText.add("three hundred and eighty-eight");
        numberText.add("three three hundred and eighty-nine");
        numberText.add("three hundred and ninety");

        numberText.add("three hundred and ninety-one");
        numberText.add("three hundred and ninety-two");
        numberText.add("three hundred and ninety-three");
        numberText.add("three hundred and ninety-four");
        numberText.add("three hundred and ninety-five");
        numberText.add("three hundred and ninety-six");
        numberText.add("three hundred and ninety-seven");
        numberText.add("three hundred and ninety-eight");
        numberText.add("three hundred and ninety-nine");
        numberText.add("four hundred");


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

                    frag = new IlcLesson3hFragment();
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
