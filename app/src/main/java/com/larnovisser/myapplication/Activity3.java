package com.larnovisser.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Activity3 extends AppCompatActivity {

    private Button button4;//yes
    private Button button5;//no

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        final String dato = getIntent().getStringExtra("Dato");
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    openActivity4(dato + "1,-1,");
                }
                else if (num == 1) {
                    openActivityFeel(dato + "1,");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    openActivity4(dato + "0,-1,");
                }
                else if (num == 1) {
                    openActivityFeel(dato + "0,");
                }
            }
        });
    }
    public void openActivityFeel(String btnvalue){
        Intent i = new Intent(this, ActivityFeel.class);
        i.putExtra("Data", btnvalue);
        startActivity(i);
    }
    public void openActivity4(String btnvalue){
        Intent intent = new Intent(this, Activity4.class);
        intent.putExtra("Data", btnvalue);
        startActivity(intent);
    }
}
