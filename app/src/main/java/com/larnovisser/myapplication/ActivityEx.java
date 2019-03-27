package com.larnovisser.myapplication;

import android.content.Intent;
import android.os.Binder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                openActivity3(data + "1,");
            }
        });
        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3(data + "2,");
            }
        });
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3(data + "3,");
            }
        });


    }
    public  void openActivity3(String btnvalue){
        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra("Dato", btnvalue);
        startActivity(intent);
    }
}