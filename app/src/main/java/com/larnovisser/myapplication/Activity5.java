package com.larnovisser.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Activity5 extends AppCompatActivity {

//    private String data = "1";
    private TextView Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        final String dato = getIntent().getStringExtra("Data");
        TextView Home=(TextView) findViewById(R.id.home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
        Context context =getApplicationContext();
        writeToFile(dato, context, "config.txt");
    }
    public void openActivity6(){
        Intent intent = new Intent(this, HomeAct.class);
        startActivity(intent);
    }
    private void writeToFile(String data, Context context, String fileName) {
        try {
            data +="\n"; //add a new line character to incoming data
            //the command below will also create a new file
            OutputStreamWriter outputStreamWriter =new OutputStreamWriter(context.openFileOutput(fileName, Context.MODE_APPEND));
            outputStreamWriter.append(data);//instead of deleting all previous data we will add to the existing ones (append)
            outputStreamWriter.close();
            Log.v("Success", "Successfully written to file: "+data); //log Verbose
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());//log Error
        }
    }
}
