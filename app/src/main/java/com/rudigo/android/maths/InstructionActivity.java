package com.rudigo.android.maths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InstructionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.module2Container, new Module2InstructionFragment()).commit();
        }

    }
}
