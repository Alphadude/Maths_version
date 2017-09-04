package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 9/4/2017.
 */

public class HomePage2 extends Fragment {
    public HomePage2() {

    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.activity_fragment, container, false);

        Button startBtn = rootView.findViewById(R.id.button);
        TextView tv = rootView.findViewById(R.id.textView);
        tv.setText(R.string.home_page_text_2);
        startBtn.setText(R.string.start);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ProgramActivity.class);

                startActivity(intent);

            }
        });

        return rootView;
    }


}
