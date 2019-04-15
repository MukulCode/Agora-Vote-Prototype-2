package com.example.agoravoteprototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VoteTypeOne extends AppCompatActivity {
Button preview_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_type_one);
        preview_list=(Button)findViewById(R.id.preview_list);
        preview_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent okintemt=new Intent(VoteTypeOne.this,OnePreview.class);
                startActivity(okintemt);
            }
        });
    }
}
