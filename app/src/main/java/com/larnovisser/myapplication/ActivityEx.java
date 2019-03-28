package com.larnovisser.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class ActivityEx extends AppCompatActivity {

    private Button ex1;
    private Button ex2;
    private Button ex3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex);
        final String data = getIntent().getStringExtra("Dato");
        ex1 = (Button) findViewById(R.id.ex1);
        ex2 = (Button) findViewById(R.id.ex2);
        ex3 = (Button) findViewById(R.id.ex3);

        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    openActivity3(data + "1,-1,");
                }
                else if (num == 1) {
                    openActivitySnack(data + "1,");
                }
            }
        });
        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    openActivity3(data + "2,-1,");
                }
                else if (num == 1) {
                    openActivitySnack(data + "2,");
                }
                //openActivity3(data + "2,");
            }
        });
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    openActivity3(data + "3,-1,");
                }
                else if (num == 1) {
                    openActivitySnack(data + "3,");
                }
            }
        });

    }

    public  void openActivity3(String btnvalue){
        Intent i = new Intent(this, Activity3.class);
        i.putExtra("Data", btnvalue);
        startActivity(i);
    }

    public void openActivitySnack(String btnvalue){
        Intent intent = new Intent ( this, ActivitySnack.class);
        intent.putExtra("Data", btnvalue);
        startActivity(intent);
    }
}