package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by user on 9/4/2017.
 */

public class BlcLesson4aFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;

    String text1, text2, text3, text4, text5;


    public BlcLesson4aFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_lesson4a_fragment, container, false);

        final Button continueButton = rootView.findViewById(R.id.blc_lesson4_continueBtn);

         editText1 = rootView.findViewById(R.id.blc_lesson4_editText1);
       editText2 = rootView.findViewById(R.id.blc_lesson4_editText2);
         editText3 = rootView.findViewById(R.id.blc_lesson4_editText3);
         editText4 = rootView.findViewById(R.id.blc_lesson4_editText4);
        editText5 = rootView.findViewById(R.id.blc_lesson4_editText5);

        text1= editText1.getText().toString().trim();
        text2= editText2.getText().toString().trim();
        text3= editText3.getText().toString().trim();
        text4= editText4.getText().toString().trim();
        text5= editText5.getText().toString().trim();



        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( text1.equals("51") &&text2.equals("52") &&text3.equals("53") &&text4.equals("54") &&text5.equals("55")){
                    Toast.makeText(getContext(), "Yayy! you passed", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Oops! you didn't get it but continue anyways..", Toast.LENGTH_SHORT).show();

                }

                Intent intent = new Intent(getActivity(), BlcLesson4bActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }


}
