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


public class FoundationProgramTestFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;
    Bundle bundle;


    public FoundationProgramTestFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.foundation_program_test_fragment, container, false);

        final EditText editText = rootView.findViewById(R.id.foundation_program_test_editText);
        Button submitButton = rootView.findViewById(R.id.foundationProgramSubmitButton);
        bundle = new Bundle();


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.getText().toString().trim().equalsIgnoreCase("ten")) {
                    Toast.makeText(getActivity(), "You passed, Main Program Option unlocked!", Toast.LENGTH_SHORT).show();
                    bundle.putString("loya", "loya");
                    frag = new ProgramOptionFragment();
                    frag.setArguments(bundle);
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();

                } else {
                    Toast.makeText(getActivity(), "You failed, Continue with Foundation Program", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getActivity(), FoundationProgramModules.class);
                    startActivity(intent);
                }

            }
        });
        return rootView;


    }
}

