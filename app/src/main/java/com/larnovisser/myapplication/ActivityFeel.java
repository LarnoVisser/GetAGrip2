package com.larnovisser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityFeel extends AppCompatActivity {
    private Button emoji1;
    private Button emoji2;
    private Button emoji3;
    private Button emoji4;
    private Button emoji5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feel);
        final String dato = getIntent().getStringExtra("Data");
        emoji1 = (Button) findViewById(R.id.emoji1);
        emoji2 = (Button) findViewById(R.id.emoji2);
        emoji3 = (Button) findViewById(R.id.emoji3);
        emoji4 = (Button) findViewById(R.id.emoji4);
        emoji5 = (Button) findViewById(R.id.emoji5);

        emoji1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5(dato+"1,-1,");
            }
        });
        emoji2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5(dato+"2,-1,");
            }
        });
        emoji3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5(dato+"3,-1,");
            }
        });
        emoji4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5(dato+"4,-1,");
            }
        });
        emoji5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5(dato+"5,-1,");
            }
        });
    }
    public void openActivity5(String btnvalue){
        Intent intent = new Intent(this, Activity5.class);
        intent.putExtra("Data", btnvalue);
        startActivity(intent);
    }
}
