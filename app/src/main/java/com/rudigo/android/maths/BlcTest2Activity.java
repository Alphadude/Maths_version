package com.rudigo.android.maths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BlcTest2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.main_container, new BlcTest2Fragment()).commit();
        }
    }
}
