package com.rudigo.android.maths;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on 9/4/2017.
 */

public class AlcLessonEFragment extends Fragment {
    //These variables are used to display the fragments
    Fragment frag;
    FragmentTransaction fragTransaction;
    private GridView inputGridView;
    private GridView resultGridView;
    private EditText inputNumber;
    private Button addButton;
    private Button showResultButton;
    private Button continueButton;

    private ArrayList<Integer> addNumbersArray = new ArrayList<>();
    private ArrayList<Integer> numbersArray = new ArrayList<>();

    public AlcLessonEFragment() {
    }

    //This method is used to inflate the fragment layout when it's called
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        final View rootView = inflater.inflate(R.layout.alc_step1_fragment, container, false);

        inputGridView = rootView.findViewById(R.id.inputGridView);
        resultGridView = rootView.findViewById(R.id.resultGridView);
        inputNumber = rootView.findViewById(R.id.editText);
        addButton = rootView.findViewById(R.id.addButton);
        showResultButton = rootView.findViewById(R.id.showCorrectAnswer);
        continueButton = rootView.findViewById(R.id.continueBtn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getInput = inputNumber.getText().toString();

                try {
                    int num = Integer.parseInt(getInput);
                    if (addNumbersArray.contains(num)) {
                        Toast.makeText(getContext(), "Number already in the list", Toast.LENGTH_SHORT).show();

                    } else if (addNumbersArray.size() >= 100) {
                        Toast.makeText(getContext(), "Limit exceeded", Toast.LENGTH_SHORT).show();

                    } else {
                        addNumbersArray.add(num);

                        ArrayAdapter<Integer> numberAdapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_list_item_1, addNumbersArray);

                        inputGridView.setAdapter(numberAdapter);
                       EditText eText = rootView.findViewById(R.id.editText);
                        eText.setText("");

                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getContext(), "input field is empty", Toast.LENGTH_SHORT).show();
                }

            }
        });


        for (int i = 1; i <= 100; ++i) {
            numbersArray.add(i);
        }
        final ArrayAdapter<Integer> resultAdapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_list_item_1, numbersArray);

        showResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultGridView.setVisibility(View.VISIBLE);
                continueButton.setVisibility(View.VISIBLE);
                resultGridView.setAdapter(resultAdapter);
                showResultButton.setEnabled(false);
            }
        });

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag = new AlcStep2Fragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.main_container, frag);
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();
            }
        });
        return rootView;
    }


}
