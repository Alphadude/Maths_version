package com.rudigo.android.maths;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by user on 9/4/2017.
 */

public class AlcLessonAFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public AlcLessonAFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.alc_fragment, container, false);

        Button previousButton = rootView.findViewById(R.id.alcPreviousButton);
        Button continueButton = rootView.findViewById(R.id.alcContinueButton);

        previousButton.setVisibility(View.GONE);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);

                frag = new AlcLessonBFragment();
                fragTransaction.replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        return rootView;
    }


}
