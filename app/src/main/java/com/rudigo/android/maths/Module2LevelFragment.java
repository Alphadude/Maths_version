package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 9/4/2017.
 */

public class Module2LevelFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;


    public Module2LevelFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.module2_level_fragment, container, false);

        final Button beginnerButton = rootView.findViewById(R.id.btnBeginner);
        final Button intermediateButton = rootView.findViewById(R.id.btnIntermediate);
        final Button advancedButton = rootView.findViewById(R.id.btnAdvanced);


        beginnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BeginnerLevelCounting.class);
                startActivity(intent);
            }
        });


        intermediateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Intermediate clicked ", Toast.LENGTH_SHORT).show();

            }
        });

        advancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Advanced clicked", Toast.LENGTH_SHORT).show();

            }
        });

        return rootView;
    }


}
