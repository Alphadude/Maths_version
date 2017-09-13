package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Module2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        Button jumpBtn = (Button) findViewById(R.id.module2_jump_test_button);
        Button continueBtn = (Button) findViewById(R.id.module2_continue_button);

        jumpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JumpTestActivity.class);
                startActivity(intent);
            }
        });

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //module2InstrFg
                Intent intent = new Intent(Module2Activity.this, InstructionActivity.class);
                startActivity(intent);


            }
        });
    }
}
