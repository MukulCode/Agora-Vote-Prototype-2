package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Election4 extends AppCompatActivity {
Button next_btn1;
ImageButton prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election4);
        next_btn1=(Button)findViewById(R.id.button10);
        prev=(ImageButton)findViewById(R.id.imageButton7);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp=new Intent(Election4.this,Election3.class);
                startActivity(temp);
            }
        });
        next_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(Election4.this,Election5.class);
                startActivity(newintent);
            }
        });


    }
}
