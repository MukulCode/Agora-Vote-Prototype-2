package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class intro3 extends AppCompatActivity {
    ImageButton nextbtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro3);
        nextbtn3=(ImageButton)findViewById(R.id.imageButton3);
        nextbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstintent= new Intent(intro3.this,intro4.class);
                startActivity(firstintent);
            }
        });

    }
}
