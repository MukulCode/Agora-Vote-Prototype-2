package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Election2 extends AppCompatActivity {
Button nextbtn1;
ImageButton prev_screen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election2);
        nextbtn1=(Button)findViewById(R.id.button7);
        prev_screen1=(ImageButton)findViewById(R.id.imageButton9);
        prev_screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previntent= new Intent(Election2.this,Election1.class);
                startActivity(previntent);
            }
        });
        nextbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(Election2.this,Election3.class);
                startActivity(newintent);
            }
        });
    }
}
