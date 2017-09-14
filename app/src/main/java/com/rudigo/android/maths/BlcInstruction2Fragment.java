package com.rudigo.android.maths;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by user on 9/4/2017.
 */

public class BlcInstruction2Fragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public BlcInstruction2Fragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test1_rules, container, false);

        final Button submitButton = rootView.findViewById(R.id.blcRules_submitBtn);
        RadioButton radioBtn1 = rootView.findViewById(R.id.radioBtn1);
        final RadioButton radioBtn2 = rootView.findViewById(R.id.radioBtn2);
        RadioButton radioBtn3 = rootView.findViewById(R.id.radioBtn3);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioBtn2.isChecked()) {
                    //go to next fragment
                    fragTransaction = getFragmentManager().beginTransaction();
                    fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                    frag = new BlcTest1Fragment();
                    fragTransaction.replace(R.id.blc_mainContainer, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();
                } else {
                    Toast.makeText(getContext(), "You failed! Answer again", Toast.LENGTH_SHORT).show();
                    //recreate fragment
                    fragTransaction = getFragmentManager().beginTransaction();
                    fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);

                    frag = new BlcInstruction2Fragment();
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.blc_mainContainer, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();

                }
            }
        });
        return rootView;
    }


}
