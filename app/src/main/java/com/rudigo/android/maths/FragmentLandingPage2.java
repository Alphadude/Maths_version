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

public class FragmentLandingPage2 extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;

    public FragmentLandingPage2() {

    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.fragment_landing_page, container, false);

        Button startBtn = rootView.findViewById(R.id.nextbutton);
        Button prevBtn = rootView.findViewById(R.id.previousbutton);
        TextView tv = rootView.findViewById(R.id.textView);
        tv.setText(R.string.home_page_text_2);
        startBtn.setText(R.string.start);
        prevBtn.setVisibility(View.VISIBLE);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);

                frag = new ProgramOptionFragment();
                fragTransaction.replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();
               }
        });
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                frag = new FragmentLandingPage1();
                fragTransaction.replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        return rootView;
    }


}
