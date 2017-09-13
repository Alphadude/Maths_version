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

public class Module2InstructionFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public Module2InstructionFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.instruction_fragment, container, false);

        final Button continueButton = rootView.findViewById(R.id.InstructionContinueButton);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new Module2LevelFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.module2Container, frag);
                fragTransaction.commit();
                fragTransaction.addToBackStack(null);
            }
        });
        return rootView;
    }


}
