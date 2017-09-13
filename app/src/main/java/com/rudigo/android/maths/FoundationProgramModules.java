package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 9/4/2017.
 */

public class FoundationProgramModules extends AppCompatActivity {
    Button btnModule1;
    Button btnModule2;
    Button btnModule3;
    Button btnModule4;
    Button btnModule5;
    Button btnModule6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foundation_program_modules);

        btnModule1 = (Button) findViewById(R.id.btnModule1);
        btnModule2 = (Button) findViewById(R.id.btnModule2);
        btnModule3 = (Button) findViewById(R.id.btnModule3);
        btnModule4 = (Button) findViewById(R.id.btnModule4);
        btnModule5 = (Button) findViewById(R.id.btnModule5);
        btnModule6 = (Button) findViewById(R.id.btnModule6);

        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoundationProgramModules.this, Module1Activity.class);
                startActivity(intent);
            }

        });

        if (getIntent().hasExtra("module1")) {
            btnModule2.setEnabled(true);
            btnModule2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Module 2 unlocked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Module2Activity.class);
                    startActivity(intent);
                }
            });
        }
        if (getIntent().hasExtra("count")) {
            btnModule3.setEnabled(true);
            btnModule3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Module 3 unlocked", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}