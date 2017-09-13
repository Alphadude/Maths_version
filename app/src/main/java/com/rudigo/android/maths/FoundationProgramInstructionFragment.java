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

public class FoundationProgramInstructionFragment extends Fragment {

    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public FoundationProgramInstructionFragment() {
    }


    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.fragment_foundation_program_instruction, container, false);

        Button takeTestBtn = rootView.findViewById(R.id.test_button);
        takeTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag = new FoundationProgramTestFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });
        return rootView;


    }
}

