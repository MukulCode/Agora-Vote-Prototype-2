package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class intro6 extends AppCompatActivity {
    ImageButton nextbtn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro6);
        nextbtn6=(ImageButton)findViewById(R.id.imageButton6);
        nextbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstintent= new Intent(intro6.this,before_signup.class);
                startActivity(firstintent);
            }
        });



    }
}
