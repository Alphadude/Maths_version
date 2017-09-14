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

public class BlcTestFragment extends Fragment {

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

    public BlcTestFragment() {
    }


    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);

        final Button repeatButton = rootView.findViewById(R.id.repeatLesson1Btn);
        final Button continueButton = rootView.findViewById(R.id.blcTestContinueBtn);

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
        for (int i = 1; i <= 50; ++i) {
            numbers.add(i);
        }

        numberText = new ArrayList<>();
        numberText.add("one");
        numberText.add("two");
        numberText.add("three");
        numberText.add("four");
        numberText.add("five");
        numberText.add("six");
        numberText.add("seven");
        numberText.add("eight");
        numberText.add("nine");
        numberText.add("ten");
        numberText.add("eleven");
        numberText.add("twelve");
        numberText.add("thirteen");
        numberText.add("fourteen");
        numberText.add("fifteen");
        numberText.add("sixteen");
        numberText.add("seventeen");
        numberText.add("eighteen");
        numberText.add("nineteen");
        numberText.add("twenty");
        numberText.add("twenty-one");
        numberText.add("twenty-two");
        numberText.add("twenty-three");
        numberText.add("twenty-four");
        numberText.add("twenty-five");
        numberText.add("twenty-six");
        numberText.add("twenty-seven");
        numberText.add("twenty-eight");
        numberText.add("twenty-nine");
        numberText.add("thirty");
        numberText.add("thirty-one");
        numberText.add("thirty-two");
        numberText.add("thirty-three");
        numberText.add("thirty-four");
        numberText.add("thirty-five");
        numberText.add("thirty-six");
        numberText.add("thirty-seven");
        numberText.add("thirty-eight");
        numberText.add("thirty-nine");
        numberText.add("forty");
        numberText.add("forty-one");
        numberText.add("forty-two");
        numberText.add("forty-three");
        numberText.add("forty-four");
        numberText.add("forty-five");
        numberText.add("forty-six");
        numberText.add("forty-seven");
        numberText.add("forty-eight");
        numberText.add("forty-nine");
        numberText.add("fifty");
        numberText.add("one");
        numberText.add("two");
        numberText.add("three");
        numberText.add("four");
        numberText.add("five");
        numberText.add("six");
        numberText.add("seven");
        numberText.add("eight");
        numberText.add("nine");
        numberText.add("ten");
        numberText.add("eleven");
        numberText.add("twelve");
        numberText.add("thirteen");
        numberText.add("fourteen");
        numberText.add("fifteen");
        numberText.add("sixteen");
        numberText.add("seventeen");
        numberText.add("eighteen");
        numberText.add("nineteen");
        numberText.add("twenty");
        numberText.add("twenty-one");
        numberText.add("twenty-two");
        numberText.add("twenty-three");
        numberText.add("twenty-four");
        numberText.add("twenty-five");
        numberText.add("twenty-six");
        numberText.add("twenty-seven");
        numberText.add("twenty-eight");
        numberText.add("twenty-nine");
        numberText.add("thirty");
        numberText.add("thirty-one");
        numberText.add("thirty-two");
        numberText.add("thirty-three");
        numberText.add("thirty-four");
        numberText.add("thirty-five");
        numberText.add("thirty-six");
        numberText.add("thirty-seven");
        numberText.add("thirty-eight");
        numberText.add("thirty-nine");
        numberText.add("forty");
        numberText.add("forty-one");
        numberText.add("forty-two");
        numberText.add("forty-three");
        numberText.add("forty-four");
        numberText.add("forty-five");
        numberText.add("forty-six");
        numberText.add("forty-seven");
        numberText.add("forty-eight");
        numberText.add("forty-nine");
        numberText.add("fifty");

        numberAdapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_list_item_1, numbers);
        gridView = rootView.findViewById(R.id.test_gridView);
        gridView.setAdapter(numberAdapter);

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go back to lesson 1
                Intent intent = new Intent(getActivity(), BeginnerLevelCounting.class);
                startActivity(intent);

            }
        });

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to Lesson 2
                Intent intent = new Intent(getActivity(), BlcLesson2Activity.class);
                startActivity(intent);
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

                isNetworkAvailable =activeNetwork != null &&(
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
