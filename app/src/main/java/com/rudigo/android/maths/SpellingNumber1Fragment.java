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

public class SpellingNumber1Fragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public SpellingNumber1Fragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.spelling_fragment1, container, false);


        Button continueButton = rootView.findViewById(R.id.spelling_continueButton);




        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new SpellingNumber2Fragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        return rootView;
    }


}
