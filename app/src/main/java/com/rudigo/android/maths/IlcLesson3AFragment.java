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

public class IlcLesson3AFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public IlcLesson3AFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.fragment_foundation_program_instruction, container, false);

        final Button continueButton = rootView.findViewById(R.id.test_button);
        continueButton.setText(getString(R.string.continue_text));

        TextView tv1 = rootView.findViewById(R.id.textView1);
        TextView tv2 = rootView.findViewById(R.id.textView2);
        TextView tv3 = rootView.findViewById(R.id.textView3);
        TextView tv4 = rootView.findViewById(R.id.textView4);
        TextView tv5 = rootView.findViewById(R.id.textView5);
        TextView tv6 = rootView.findViewById(R.id.textView6);

        tv1.setText("Lesson 3A");

        tv2.setText("Activity 1");

        tv3.setText(R.string.lesson_3a_text);

        tv4.setVisibility(View.GONE);
        tv5.setVisibility(View.GONE);
        tv6.setVisibility(View.GONE);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new IlcLesson3dFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });
        return rootView;
    }


}
