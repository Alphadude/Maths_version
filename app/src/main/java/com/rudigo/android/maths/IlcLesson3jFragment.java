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

public class IlcLesson3jFragment extends Fragment {
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


    public IlcLesson3jFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);


        intent = new Intent(getActivity(), IlcLesson3jFragment.class);
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
        for (int i = 601; i <= 700; ++i) {
            numbers.add(i);
        }


        numberText = new ArrayList<>();


        numberText.add("six hundred and one");
        numberText.add("six hundred and two");
        numberText.add("six hundred and three");
        numberText.add("six hundred and four");
        numberText.add("six hundred and five");
        numberText.add("six hundred and six");
        numberText.add("six hundred and seven");
        numberText.add("six hundred and eight");
        numberText.add("six hundred and nine");
        numberText.add("six hundred and ten");
        numberText.add("six hundred and eleven");
        numberText.add("six hundred and twelve");
        numberText.add("six hundred and thirteen");
        numberText.add("six hundred and fourteen");
        numberText.add("six hundred and fifteen");
        numberText.add("six hundred and sixteen");
        numberText.add("six hundred and seventeen");
        numberText.add("six hundred and eighteen");
        numberText.add("six hundred and nineteen");
        numberText.add("six hundred and twenty");
        numberText.add("six hundred and twenty-one");
        numberText.add("six hundred and twenty-two");
        numberText.add("six hundred and twenty-three");
        numberText.add("six hundred and twenty-four");
        numberText.add("six hundred and twenty-five");
        numberText.add("six hundred and twenty-six");
        numberText.add("six hundred and twenty-seven");
        numberText.add("six hundred and twenty-eight");
        numberText.add("six hundred and twenty-nine");
        numberText.add("six hundred and thirty");
        numberText.add("six hundred and thirty-one");
        numberText.add("six hundred and thirty-two");
        numberText.add("six hundred and thirty-three");
        numberText.add("six hundred and thirty-four");
        numberText.add("six hundred and thirty-five");
        numberText.add("six hundred and thirty-six");
        numberText.add("six hundred and thirty-seven");
        numberText.add("six hundred and thirty-eight");
        numberText.add("six hundred and thirty-nine");

        numberText.add("six hundred and forty");
        numberText.add("six hundred and forty-one");
        numberText.add("six hundred and forty-two");
        numberText.add("six hundred and forty-three");
        numberText.add("six hundred and forty-four");
        numberText.add("six hundred and forty-five");
        numberText.add("six hundred and forty-six");
        numberText.add("six hundred and forty-seven");
        numberText.add("six hundred and forty-eight");
        numberText.add("six hundred and forty-nine");
        numberText.add("six hundred and fifty");
        numberText.add("six hundred and fifty-one");
        numberText.add("six hundred and fifty-two");
        numberText.add("six hundred and fifty-three");
        numberText.add("six hundred and fifty-four");
        numberText.add("six hundred and fifty-five");
        numberText.add("six hundred and fifty-six");
        numberText.add("six hundred and fifty-seven");
        numberText.add("six hundred and fifty-eight");
        numberText.add("six hundred and fifty-nine");
        numberText.add("six hundred and sixty");
        numberText.add("six hundred and sixty-one");
        numberText.add("six hundred and sixty-two");
        numberText.add("six hundred and sixty-three");
        numberText.add("six hundred and sixty-four");
        numberText.add("six hundred and sixty-five");
        numberText.add("six hundred and sixty-six");
        numberText.add("six hundred and sixty-seven");
        numberText.add("six hundred and sixty-eight");
        numberText.add("six hundred and sixty-nine");
        numberText.add("six hundred and seventy");
        numberText.add("six hundred and seventy-one");
        numberText.add("six hundred and seventy-two");
        numberText.add("six hundred and seventy-three");
        numberText.add("six hundred and seventy-four");
        numberText.add("six hundred and seventy-five");
        numberText.add("six hundred and seventy-six");
        numberText.add("six hundred and seventy-seven");
        numberText.add("six hundred and seventy-eight");
        numberText.add("six hundred and seventy-nine");
        numberText.add("six hundred and eighty");
        numberText.add("six hundred and eighty-one");
        numberText.add("six hundred and eighty-two");
        numberText.add("six hundred and eighty-three");
        numberText.add("six hundred and eighty-four");
        numberText.add("six hundred and eighty-five");
        numberText.add("six hundred and eighty-six");
        numberText.add("six hundred and eighty-seven");
        numberText.add("six hundred and eighty-eight");
        numberText.add("six hundred and eighty-nine");
        numberText.add("six hundred and ninety");

        numberText.add("six hundred and ninety-one");
        numberText.add("six hundred and ninety-two");
        numberText.add("six hundred and ninety-three");
        numberText.add("six hundred and ninety-four");
        numberText.add("six hundred and ninety-five");
        numberText.add("six hundred and ninety-six");
        numberText.add("six hundred and ninety-seven");
        numberText.add("six hundred and ninety-eight");
        numberText.add("six hundred and ninety-nine");
        numberText.add("seven hundred");


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
                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                frag = new IlcLesson3kFragment();
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
