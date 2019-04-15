package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Election5 extends AppCompatActivity {
Button next_btn2;
ImageButton prev2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election5);

        next_btn2=(Button)findViewById(R.id.button11);
        prev2=(ImageButton)findViewById(R.id.imageButton9);
        prev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp=new Intent(Election5.this,Election4.class);
                startActivity(temp);
            }
        });
        next_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(Election5.this,Election6.class);
                startActivity(newintent);
            }
        });
    }
}
