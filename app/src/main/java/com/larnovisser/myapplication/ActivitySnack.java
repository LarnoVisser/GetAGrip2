package com.larnovisser.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class ActivitySnack extends AppCompatActivity {
    private Button button13;//yes
    private Button button14;//no

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        final String dato = getIntent().getStringExtra("Data");
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    openActivity4(dato + "1,-1,-1,");
                }
                else if (num == 1) {
                    openActivityFeel(dato + "1,-1,");
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    openActivity4(dato + "0,-1,-1,");
                }
                else if (num == 1) {
                    openActivityFeel(dato + "0,-1,");
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
