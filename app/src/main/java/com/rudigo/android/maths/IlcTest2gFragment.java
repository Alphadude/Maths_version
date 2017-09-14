package com.rudigo.android.maths;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import static android.app.Activity.RESULT_OK;

/**
 * Created by user on 9/4/2017.
 */

public class IlcTest2gFragment extends Fragment {

    //connectivity manager instance
    private ConnectivityManager mConnMgr;


    private boolean isNetworkAvailable;


    private NetworkInfo activeNetwork;

    //Broadcast Receiver instance
    public NetworkReceiver mReceiver;

    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;

    private final int REQUEST_SPEECH_CODE = 143;


    private ArrayAdapter<Integer> numberAdapter;

    private GridView gridView;
    private ArrayList<Integer> numbers;

    private ArrayList<String> numberText;

    public IlcTest2gFragment() {
    }


    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);

        Button repeatButton = rootView.findViewById(R.id.repeatLesson1Btn);
        Button continueButton = rootView.findViewById(R.id.blcTestContinueBtn);

        repeatButton.setText("Repeat Lesson 1LC 3A");

        continueButton.setText("Start a New Lesson");

        mConnMgr = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);

        activeNetwork = mConnMgr.getActiveNetworkInfo();
//        isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        //instantiates the Network Events Broadcast Receiver
        mReceiver = new NetworkReceiver();
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        //Register the broadcast receiver with Intent action CONNECTIVITY_ACTION
        //Broadcast receiver's onReceive will be called once a network happens
        getActivity().registerReceiver(mReceiver, filter);


        numbers = new ArrayList<>();
        for (int i = 910; i <= 1000; ++i) {
            numbers.add(i);
        }

        numberText = new ArrayList<>();

        numberText.add("nine hundred and ten");
        numberText.add("nine hundred and eleven");
        numberText.add("nine hundred and twelve");
        numberText.add("nine hundred and thirteen");
        numberText.add("nine hundred and fourteen");
        numberText.add("nine hundred and fifteen");
        numberText.add("nine hundred and sixteen");
        numberText.add("nine hundred and seventeen");
        numberText.add("nine hundred and eighteen");
        numberText.add("nine hundred and nineteen");
        numberText.add("nine hundred and twenty");
        numberText.add("nine hundred and twenty-one");
        numberText.add("nine hundred and twenty-two");
        numberText.add("nine hundred and twenty-three");
        numberText.add("nine hundred and twenty-four");
        numberText.add("nine hundred and twenty-five");
        numberText.add("nine hundred and twenty-six");
        numberText.add("nine hundred and twenty-seven");
        numberText.add("nine hundred and twenty-eight");
        numberText.add("nine hundred and twenty-nine");
        numberText.add("nine hundred and thirty");
        numberText.add("nine hundred and thirty-one");
        numberText.add("nine hundred and thirty-two");
        numberText.add("nine hundred and thirty-three");
        numberText.add("nine hundred and thirty-four");
        numberText.add("nine hundred and thirty-five");
        numberText.add("nine hundred and thirty-six");
        numberText.add("nine hundred and thirty-seven");
        numberText.add("nine hundred and thirty-eight");
        numberText.add("nine hundred and thirty-nine");

        numberText.add("nine hundred and forty");
        numberText.add("nine hundred and forty-one");
        numberText.add("nine hundred and forty-two");
        numberText.add("nine hundred and forty-three");
        numberText.add("nine hundred and forty-four");
        numberText.add("nine hundred and forty-five");
        numberText.add("nine hundred and forty-six");
        numberText.add("nine hundred and forty-seven");
        numberText.add("nine hundred and forty-eight");
        numberText.add("nine hundred and forty-nine");
        numberText.add("nine hundred and fifty");
        numberText.add("nine hundred and fifty-one");
        numberText.add("nine hundred and fifty-two");
        numberText.add("nine hundred and fifty-three");
        numberText.add("nine hundred and fifty-four");
        numberText.add("nine hundred and fifty-five");
        numberText.add("nine hundred and fifty-six");
        numberText.add("nine hundred and fifty-seven");
        numberText.add("nine hundred and fifty-eight");
        numberText.add("nine hundred and fifty-nine");
        numberText.add("nine hundred and sixty");
        numberText.add("nine hundred and sixty-one");
        numberText.add("nine hundred and sixty-two");
        numberText.add("nine hundred and sixty-three");
        numberText.add("nine hundred and sixty-four");
        numberText.add("nine hundred and sixty-five");
        numberText.add("nine hundred and sixty-six");
        numberText.add("nine hundred and sixty-seven");
        numberText.add("nine hundred and sixty-eight");
        numberText.add("nine hundred and sixty-nine");
        numberText.add("nine hundred and seventy");
        numberText.add("nine hundred and seventy-one");
        numberText.add("nine hundred and seventy-two");
        numberText.add("nine hundred and seventy-three");
        numberText.add("nine hundred and seventy-four");
        numberText.add("nine hundred and seventy-five");
        numberText.add("nine hundred and seventy-six");
        numberText.add("nine hundred and seventy-seven");
        numberText.add("nine hundred and seventy-eight");
        numberText.add("nine hundred and seventy-nine");
        numberText.add("nine hundred and eighty");
        numberText.add("nine hundred and eighty-one");
        numberText.add("nine hundred and eighty-two");
        numberText.add("nine hundred and eighty-three");
        numberText.add("nine hundred and eighty-four");
        numberText.add("nine hundred and eighty-five");
        numberText.add("nine hundred and eighty-six");
        numberText.add("nine hundred and eighty-seven");
        numberText.add("nine hundred and eighty-eight");
        numberText.add("nine hundred and eighty-nine");
        numberText.add("nine hundred and ninety");

        numberText.add("nine hundred and ninety-one");
        numberText.add("nine hundred and ninety-two");
        numberText.add("nine hundred and ninety-three");
        numberText.add("nine hundred and ninety-four");
        numberText.add("nine hundred and ninety-five");
        numberText.add("nine hundred and ninety-six");
        numberText.add("nine hundred and ninety-seven");
        numberText.add("nine hundred and ninety-eight");
        numberText.add("nine hundred and ninety-nine");
        numberText.add("one thousand");


        numberAdapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_list_item_1, numbers);
        gridView = rootView.findViewById(R.id.test_gridView);
        gridView.setAdapter(numberAdapter);


        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go back to lesson IlcLesson1Fragment
                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                frag = new IlcLesson3AFragment();
                fragTransaction.replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();
            }
        });


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to Lesson 2
                fragTransaction = getFragmentManager().beginTransaction();
                fragTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                frag = new AlcIntroductionFragment();
                fragTransaction.replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();
            }

        });


        return rootView;
    }

    private void recordSpeech() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak the number clicked");

        try {

            startActivityForResult(intent, REQUEST_SPEECH_CODE);

        } catch (ActivityNotFoundException tim) {
            Toast.makeText(getContext(), "You device does not support speech to text", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQUEST_SPEECH_CODE:
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> voiceInText = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    Toast.makeText(getContext(), voiceInText.get(0), Toast.LENGTH_SHORT).show();

                }
                break;

        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //unRegisters the broadcast receiver whent the activity goes to the background
        if (mReceiver != null) {
            getActivity().unregisterReceiver(mReceiver);
        }
    }

    //Broadcast receiver whose onReceive will be called whenever a network event such as
    //network disconnected or network connected takes place
    //The Broadcast Receiver is registered in the onCreate with Intent action CONNECTIVITY_ACTION
    public class NetworkReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            //get active network info structure

            isNetworkAvailable = activeNetwork != null && (
                    mConnMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting() ||
                            mConnMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnectedOrConnecting());

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (isNetworkAvailable) {
                        Toast.makeText(getContext(), "Network Available", Toast.LENGTH_SHORT).show();

                        recordSpeech();
                        //speech to text
                        Toast.makeText(getContext(), numberText.get(position), Toast.LENGTH_SHORT).show();
                        //increment if text matches

                    } else {
                        Toast.makeText(getContext(), "Network not available", Toast.LENGTH_SHORT).show();

                    }

                }
            });

        }
    }
}
