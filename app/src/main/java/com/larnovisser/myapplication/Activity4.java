package com.larnovisser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    String data = getIntent().getStringExtra("data");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5("1");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5("2");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5("3");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5("4");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5("5");
            }
        });
    }
    public void openActivity5(String btnvalue){
        Intent intent = new Intent(this, Activity5.class);
        intent.putExtra("data", data+=btnvalue);
        startActivity(intent);
    }
}
