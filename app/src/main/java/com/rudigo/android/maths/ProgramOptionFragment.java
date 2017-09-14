package com.rudigo.android.maths;

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



    public class ProgramOptionFragment extends Fragment {
    Button foundationProgramBtn;
    Button mainProgramBtn;

        //These variables are used to display the fragments
        Fragment frag;
        FragmentTransaction fragTransaction;

        public ProgramOptionFragment() {
        }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.activity_program_option_fragment, container, false);

        foundationProgramBtn = rootView.findViewById(R.id.btnFoundation);
        mainProgramBtn = rootView.findViewById(R.id.btnMain);

        foundationProgramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                frag = new FoundationProgramInstructionFragment();
                fragTransaction.replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

//                Intent intent = new Intent(getContext(), FoundationProgramInstructionFragment.class);
//                startActivity(intent);
            }
        });

     //   String key =getArguments().getString("loya");
        if(getArguments()!= null) {
            mainProgramBtn.setEnabled(true);
            mainProgramBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getContext(), "Main Program Unlocked", Toast.LENGTH_SHORT).show();
                }
            });
        }
//        }else{
//            mainProgramBtn.setEnabled(false);
//        }
//        if (getActivity().getIntent().hasExtra("loya")) {
//            mainProgramBtn.setEnabled(true);
//            mainProgramBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(getContext(), "Main Program Unlocked", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }
        return rootView;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_program_option);
//        foundationProgramBtn = (Button) findViewById(R.id.btnFoundation);
//        mainProgramBtn = (Button) findViewById(R.id.btnMain);
//
//        foundationProgramBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ProgramOptionFragment.this, FoundationProgramInstructionFragment.class);
//                startActivity(intent);
//            }
//        });
//
//        if (getIntent().hasExtra("loya")) {
//            mainProgramBtn.setEnabled(true);
//            mainProgramBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(ProgramOptionFragment.this, "Main Program Unlocked", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }

}
