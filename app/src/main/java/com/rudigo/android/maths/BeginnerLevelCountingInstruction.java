package com.rudigo.android.maths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeginnerLevelCountingInstruction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_level_counting_instruction);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.blc_mainContainer, new BlcInstruction1Fragment()).commit();
        }
    }
}
