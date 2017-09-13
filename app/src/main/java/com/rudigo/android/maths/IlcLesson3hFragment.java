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

public class IlcLesson3hFragment extends Fragment {
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


    public IlcLesson3hFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);


        intent = new Intent(getActivity(), IlcLesson3hFragment.class);
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
        for (int i = 401; i <= 500; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();

        numberText.add("four hundred and one");
        numberText.add("four hundred and two");
        numberText.add("four hundred and three");
        numberText.add("four hundred and four");
        numberText.add("four hundred and five");
        numberText.add("four hundred and six");
        numberText.add("four hundred and seven");
        numberText.add("four hundred and eight");
        numberText.add("four hundred and nine");
        numberText.add("four hundred and ten");
        numberText.add("four hundred and eleven");
        numberText.add("four hundred and twelve");
        numberText.add("four hundred and thirteen");
        numberText.add("four hundred and fourteen");
        numberText.add("four hundred and fifteen");
        numberText.add("four hundred and sixteen");
        numberText.add("four hundred and seventeen");
        numberText.add("four hundred and eighteen");
        numberText.add("four hundred and nineteen");
        numberText.add("four hundred and twenty");
        numberText.add("four hundred and twenty-one");
        numberText.add("four hundred and twenty-two");
        numberText.add("four hundred and twenty-three");
        numberText.add("four hundred and twenty-four");
        numberText.add("four hundred and twenty-five");
        numberText.add("four hundred and twenty-six");
        numberText.add("four hundred and twenty-seven");
        numberText.add("four hundred and twenty-eight");
        numberText.add("four hundred and twenty-nine");
        numberText.add("four hundred and thirty");
        numberText.add("four hundred and thirty-one");
        numberText.add("four hundred and thirty-two");
        numberText.add("four hundred and thirty-three");
        numberText.add("four hundred and thirty-four");
        numberText.add("four hundred and thirty-five");
        numberText.add("four hundred and thirty-six");
        numberText.add("four hundred and thirty-seven");
        numberText.add("four hundred and thirty-eight");
        numberText.add("four hundred and thirty-nine");

        numberText.add("four hundred and forty");
        numberText.add("four hundred and forty-one");
        numberText.add("four hundred and forty-two");
        numberText.add("four hundred and forty-three");
        numberText.add("four hundred and forty-four");
        numberText.add("four hundred and forty-five");
        numberText.add("four hundred and forty-six");
        numberText.add("four hundred and forty-seven");
        numberText.add("four hundred and forty-eight");
        numberText.add("four hundred and forty-nine");
        numberText.add("four hundred and fifty");
        numberText.add("four hundred and fifty-one");
        numberText.add("four hundred and fifty-two");
        numberText.add("four hundred and fifty-three");
        numberText.add("four hundred and fifty-four");
        numberText.add("four hundred and fifty-five");
        numberText.add("four hundred and fifty-six");
        numberText.add("four hundred and fifty-seven");
        numberText.add("four hundred and fifty-eight");
        numberText.add("four hundred and fifty-nine");
        numberText.add("four hundred and sixty");
        numberText.add("four hundred and sixty-one");
        numberText.add("four hundred and sixty-two");
        numberText.add("four hundred and sixty-three");
        numberText.add("four hundred and sixty-four");
        numberText.add("four hundred and sixty-five");
        numberText.add("four hundred and sixty-six");
        numberText.add("four hundred and sixty-seven");
        numberText.add("four hundred and sixty-eight");
        numberText.add("four hundred and sixty-nine");
        numberText.add("four hundred and seventy");
        numberText.add("four hundred and seventy-one");
        numberText.add("four hundred and seventy-two");
        numberText.add("four hundred and seventy-three");
        numberText.add("four hundred and seventy-four");
        numberText.add("four hundred and seventy-five");
        numberText.add("four hundred and seventy-six");
        numberText.add("four hundred and seventy-seven");
        numberText.add("four hundred and seventy-eight");
        numberText.add("four hundred and seventy-nine");
        numberText.add("four hundred and eighty");
        numberText.add("four hundred and eighty-one");
        numberText.add("four hundred and eighty-two");
        numberText.add("four hundred and eighty-three");
        numberText.add("four hundred and eighty-four");
        numberText.add("four hundred and eighty-five");
        numberText.add("four hundred and eighty-six");
        numberText.add("four hundred and eighty-seven");
        numberText.add("four hundred and eighty-eight");
        numberText.add("four hundred and eighty-nine");
        numberText.add("four hundred and ninety");

        numberText.add("four hundred and ninety-one");
        numberText.add("four hundred and ninety-two");
        numberText.add("four hundred and ninety-three");
        numberText.add("four hundred and ninety-four");
        numberText.add("four hundred and ninety-five");
        numberText.add("four hundred and ninety-six");
        numberText.add("four hundred and ninety-seven");
        numberText.add("four hundred and ninety-eight");
        numberText.add("four hundred and ninety-nine");
        numberText.add("five hundred");


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

                    frag = new IlcLesson3iFragment();
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
