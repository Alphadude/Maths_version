package com.rudigo.android.maths;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 9/4/2017.
 */

public class SpellingNumber3Fragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public SpellingNumber3Fragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.spelling_fragment2, container, false);


        Button continueButton = rootView.findViewById(R.id.spellingContinueButton1);
        Button previousButton = rootView.findViewById(R.id.spellingPreviousButton1);

        TextView text = rootView.findViewById(R.id.spellingText);

        previousButton.setVisibility(View.GONE);

        text.setText(R.string.text);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "next one...", Toast.LENGTH_SHORT).show();
//                frag = new SpellingNumber3Fragment();
//                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
//                fragTransaction.addToBackStack(null);
//                fragTransaction.commit();

            }
        });

        return rootView;
    }


}
