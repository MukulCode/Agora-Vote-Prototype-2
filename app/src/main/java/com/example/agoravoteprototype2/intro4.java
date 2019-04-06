package com.example.agoravoteprototype2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class intro4 extends AppCompatActivity {
ImageButton nextbtn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro4);
        nextbtn4=(ImageButton)findViewById(R.id.imageButton4);
        nextbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstintent= new Intent(intro4.this,intro5.class);
                startActivity(firstintent);
            }
        });


    }
}
