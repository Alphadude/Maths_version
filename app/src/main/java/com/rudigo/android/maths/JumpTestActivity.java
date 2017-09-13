package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 9/4/2017.
 */

public class JumpTestActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jump_test);
        Button testSubmitBtn = (Button) findViewById(R.id.jumpTestSubmitBtn);
        final EditText editText = (EditText)findViewById(R.id.jump_test_editText);

        testSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().trim().equalsIgnoreCase("ten")) {
                    Intent intent = new Intent(getApplicationContext(), FoundationProgramModules.class);
                    intent.putExtra("count", "count");
                    startActivity(intent);

                } else {
                    Intent intent = new Intent(JumpTestActivity.this, InstructionActivity.class);
                    startActivity(intent);
                }

            }
        });

    }


}
