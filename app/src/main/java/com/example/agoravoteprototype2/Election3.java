package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Election3 extends AppCompatActivity {
Button next_btn;
ImageButton prev_screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election3);
        prev_screen=(ImageButton)findViewById(R.id.imageButton8);
        prev_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previntent= new Intent(Election3.this,Election2.class);
                startActivity(previntent);
            }
        });
        next_btn=(Button)findViewById(R.id.button8);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(Election3.this,Election4.class);
                startActivity(newintent);
            }
        });

    }
}
