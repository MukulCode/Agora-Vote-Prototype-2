package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Election6 extends AppCompatActivity {
ImageButton final_prev;
Button finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election6);
        finish=(Button)findViewById(R.id.finish);
        final_prev=(ImageButton)findViewById(R.id.final_prev);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kayintent=new Intent(Election6.this,Dashboard.class);
                startActivity(kayintent);
                Toast.makeText(Election6.this, "Election has been successfully created", Toast.LENGTH_SHORT).show();
            }
        });
        final_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent endintent=new Intent(Election6.this,Election5.class);
                startActivity(endintent);
            }
        });
    }
}
