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

public class IlcTest1Fragment extends Fragment {

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

    public IlcTest1Fragment() {
    }


    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);

         Button repeatButton = rootView.findViewById(R.id.repeatLesson1Btn);
         Button continueButton = rootView.findViewById(R.id.blcTestContinueBtn);

        if (getArguments() != null) {
            continueButton.setText("Start a New lesson");
        }
        repeatButton.setText("Repeat Lesson 1A");

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
        for (int i = 91; i <= 200; ++i) {
            numbers.add(i);
        }

        numberText = new ArrayList<>();
        numberText.add("ninety-one");
        numberText.add("ninety-two");
        numberText.add("ninety-three");
        numberText.add("ninety-four");
        numberText.add("ninety-five");
        numberText.add("ninety-six");
        numberText.add("ninety-seven");
        numberText.add("ninety-eight");
        numberText.add("ninety-nine");
        numberText.add("hundred");
        numberText.add("hundred and one");
        numberText.add("hundred and two");
        numberText.add("hundred and three");
        numberText.add("hundred and four");
        numberText.add("hundred and five");
        numberText.add("hundred and six");
        numberText.add("hundred and seven");
        numberText.add("hundred and eight");
        numberText.add("hundred and nine");
        numberText.add("hundred and ten");
        numberText.add("hundred and eleven");
        numberText.add("hundred and twelve");
        numberText.add("hundred and thirteen");
        numberText.add("hundred and fourteen");
        numberText.add("hundred and fifteen");
        numberText.add("hundred and sixteen");
        numberText.add("hundred and seventeen");
        numberText.add("hundred and eighteen");
        numberText.add("hundred and nineteen");
        numberText.add("hundred and twenty");
        numberText.add("hundred and twenty-one");
        numberText.add("hundred and twenty-two");
        numberText.add("hundred and twenty-three");
        numberText.add("hundred and twenty-four");
        numberText.add("hundred and twenty-five");
        numberText.add("hundred and twenty-six");
        numberText.add("hundred and twenty-seven");
        numberText.add("hundred and twenty-eight");
        numberText.add("hundred and twenty-nine");
        numberText.add("hundred and thirty");
        numberText.add("hundred and thirty-one");
        numberText.add("hundred and thirty-two");
        numberText.add("hundred and thirty-three");
        numberText.add("hundred and thirty-four");
        numberText.add("hundred and thirty-five");
        numberText.add("hundred and thirty-six");
        numberText.add("hundred and thirty-seven");
        numberText.add("hundred and thirty-eight");
        numberText.add("hundred and thirty-nine");

        numberText.add("hundred and forty");
        numberText.add("hundred and forty-one");
        numberText.add("hundred and forty-two");
        numberText.add("hundred and forty-three");
        numberText.add("hundred and forty-four");
        numberText.add("hundred and forty-five");
        numberText.add("hundred and forty-six");
        numberText.add("hundred and forty-seven");
        numberText.add("hundred and forty-eight");
        numberText.add("hundred and forty-nine");
        numberText.add("hundred and fifty");
        numberText.add("hundred and fifty-one");
        numberText.add("hundred and fifty-two");
        numberText.add("hundred and fifty-three");
        numberText.add("hundred and fifty-four");
        numberText.add("hundred and fifty-five");
        numberText.add("hundred and fifty-six");
        numberText.add("hundred and fifty-seven");
        numberText.add("hundred and fifty-eight");
        numberText.add("hundred and fifty-nine");
        numberText.add("hundred and sixty");
        numberText.add("hundred and sixty-one");
        numberText.add("hundred and sixty-two");
        numberText.add("hundred and sixty-three");
        numberText.add("hundred and sixty-four");
        numberText.add("hundred and sixty-five");
        numberText.add("hundred and sixty-six");
        numberText.add("hundred and sixty-seven");
        numberText.add("hundred and sixty-eight");
        numberText.add("hundred and sixty-nine");
        numberText.add("hundred and seventy");
        numberText.add("hundred and seventy-one");
        numberText.add("hundred and seventy-two");
        numberText.add("hundred and seventy-three");
        numberText.add("hundred and seventy-four");
        numberText.add("hundred and seventy-five");
        numberText.add("hundred and seventy-six");
        numberText.add("hundred and seventy-seven");
        numberText.add("hundred and seventy-eight");
        numberText.add("hundred and seventy-nine");
        numberText.add("hundred and eighty");
        numberText.add("hundred and eighty-one");
        numberText.add("hundred and eighty-two");
        numberText.add("hundred and eighty-three");
        numberText.add("hundred and eighty-four");
        numberText.add("hundred and eighty-five");
        numberText.add("hundred and eighty-six");
        numberText.add("hundred and eighty-seven");
        numberText.add("hundred and eighty-eight");
        numberText.add("hundred and eighty-nine");
        numberText.add("hundred and ninety");

        numberText.add("hundred and ninety-one");
        numberText.add("hundred and ninety-two");
        numberText.add("hundred and ninety-three");
        numberText.add("hundred and ninety-four");
        numberText.add("hundred and ninety-five");
        numberText.add("hundred and ninety-six");
        numberText.add("hundred and ninety-seven");
        numberText.add("hundred and ninety-eight");
        numberText.add("hundred and ninety-nine");
        numberText.add("two hundred");


        numberAdapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_list_item_1, numbers);
        gridView = rootView.findViewById(R.id.test_gridView);
        gridView.setAdapter(numberAdapter);


        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go back to lesson IlcLesson1Fragment
                frag = new IlcLesson1Fragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();
            }
        });

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getArguments() != null){
                    //go to Lesson 3A
                    frag = new IlcLesson3AFragment();
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();
                    Toast.makeText(getActivity(), "in lesson 3a", Toast.LENGTH_SHORT).show();
                }else{
                    //go to Lesson 2
                    frag = new IlcLesson2AFragment();
                    fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                    fragTransaction.addToBackStack(null);
                    fragTransaction.commit();
                }

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
