package com.rudigo.android.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Module1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        Button btnContinue = (Button) findViewById(R.id.module1Button);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Module1Activity.this, FoundationProgramModules.class);
                intent.putExtra("module1", "module1");
                startActivity(intent);
            }
        });
    }

}
