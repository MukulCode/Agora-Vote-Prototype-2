package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class intro2 extends AppCompatActivity {
    ImageButton nextbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);
        nextbtn2=(ImageButton)findViewById(R.id.imageButton2);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstintent= new Intent(intro2.this,intro3.class);
                startActivity(firstintent);
            }
        });


    }
}
