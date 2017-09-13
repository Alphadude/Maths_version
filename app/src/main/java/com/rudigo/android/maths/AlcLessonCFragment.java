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

public class AlcLessonCFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public AlcLessonCFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.alc_fragment, container, false);

        Button previousButton = rootView.findViewById(R.id.alcPreviousButton);
        Button continueButton = rootView.findViewById(R.id.alcContinueButton);
        TextView textBody = rootView.findViewById(R.id.text_body);
        TextView textTitle = rootView.findViewById(R.id.title_text);

        textBody.setText(R.string.alclessonc_text);
        textTitle.setText("Writing Numbers to a Million");
        previousButton.setVisibility(View.GONE);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Toast.makeText(getContext(), "ALC", Toast.LENGTH_SHORT).show();
                frag = new AlcLessonDFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        return rootView;
    }


}
