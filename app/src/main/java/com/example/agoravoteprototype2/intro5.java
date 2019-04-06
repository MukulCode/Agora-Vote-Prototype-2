package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class intro5 extends AppCompatActivity {
    ImageButton nextbtn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro5);
        nextbtn5=(ImageButton)findViewById(R.id.imageButton5);
        nextbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstintent= new Intent(intro5.this,intro6.class);
                startActivity(firstintent);
            }
        });



    }
}
