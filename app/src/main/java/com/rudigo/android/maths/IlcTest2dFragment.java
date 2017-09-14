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

public class IlcTest2dFragment extends Fragment {

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

    public IlcTest2dFragment() {
    }


    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.blc_test_fragment, container, false);

         Button repeatButton = rootView.findViewById(R.id.repeatLesson1Btn);
         Button continueButton = rootView.findViewById(R.id.blcTestContinueBtn);

        repeatButton.setText("Repeat Lesson 1LC 3A");

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
        for (int i = 490; i <= 510; ++i) {
            numbers.add(i);
        }

        numberText = new ArrayList<>();

        numberText.add("four hundred and ninety");
        numberText.add("four hundred and ninety-one");
        numberText.add("four hundred and ninety-two");
        numberText.add("four hundred and ninety-three");
        numberText.add("four hundred and ninety-four");
        numberText.add("four hundred and ninety-five");
        numberText.add("four hundred and ninety-six");
        numberText.add("four hundred and ninety-seven");
        numberText.add("four hundred and ninety-eight");
        numberText.add("four hundred and ninety-nine");
        numberText.add("five hundred");
        numberText.add("five hundred and one");
        numberText.add("five hundred and two");
        numberText.add("five hundred and three");
        numberText.add("five hundred and four");
        numberText.add("five hundred and five");
        numberText.add("five hundred and six");
        numberText.add("five hundred and seven");
        numberText.add("five hundred and eight");
        numberText.add("five hundred and nine");
        numberText.add("five hundred and ten");



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
                   frag = new IlcTest2eFragment();
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
