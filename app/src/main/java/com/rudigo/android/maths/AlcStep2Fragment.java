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

public class AlcStep2Fragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public AlcStep2Fragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.alc_step3_fragment, container, false);

        TextView stepText = rootView.findViewById(R.id.step);
        TextView text1 = rootView.findViewById(R.id.step_text_body1);
        TextView text2 = rootView.findViewById(R.id.step_text_body2);
        TextView text3 = rootView.findViewById(R.id.step_text_body3);

        Button continueButton = rootView.findViewById(R.id.alc_step_continueButton);

        stepText.setText("Step 2");

        text1.setText(R.string.alc_step2_text);

        text2.setVisibility(View.GONE);
        text3.setVisibility(View.GONE);




        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //   Toast.makeText(getContext(), "ALC", Toast.LENGTH_SHORT).show();
                frag = new AlcStep3Fragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        return rootView;
    }


}
