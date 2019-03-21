package com.larnovisser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    private TextView Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        TextView Home=(TextView)findViewById(R.id.home);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }
    public void openActivity6(){
        Intent intent = new Intent(this, HomeAct.class);
        startActivity(intent);
    }
}
