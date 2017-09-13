package com.rudigo.android.maths;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 9/4/2017.
 */

public class AlcIntroductionFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public AlcIntroductionFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.activity_beginner_level_counting, container, false);

        Button repeatButton = rootView.findViewById(R.id.repeatButton);
        Button continueButton = rootView.findViewById(R.id.blcTestBtn);

        TextView titleText = rootView.findViewById(R.id.title_text);
        TextView textBody = rootView.findViewById(R.id.text_body);
        TextView scoreText = rootView.findViewById(R.id.blcNumberText);

        continueButton.setText(R.string.continue_text);
        repeatButton.setText("Repeat 1LC 3A lesson");

        titleText.setText("Advanced Level");

        textBody.setText(R.string.alc_congrats_text);

        scoreText.setVisibility(View.GONE);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new AlcLessonAFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });
        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag = new IlcLesson3AFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();
            }
        });
        return rootView;
    }


}
