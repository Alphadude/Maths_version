package com.rudigo.android.maths;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 9/4/2017.
 */

public class Module1InstructionFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public Module1InstructionFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.fragment_landing_page, container, false);

      //  final Button nextButton = rootView.findViewById(R.id.nextbutton);

//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                frag = new FragmentLandingPage2();
//                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
//
//                fragTransaction.addToBackStack(null);
//        fragTransaction.setTransition()
//        fragTransaction.commit();

//            }
//        });
        return rootView;
    }


}
