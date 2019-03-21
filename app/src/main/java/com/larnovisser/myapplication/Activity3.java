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

public class Activity3 extends AppCompatActivity {

    private Button button4;//yes
    private Button button5;//no

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context =getApplicationContext();
                writeToFile("1,", context, "config.txt");
                openActivity4("1");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context =getApplicationContext();
                writeToFile("0,", context, "config.txt");
                openActivity4("0");
            }
        });
    }
    public void openActivity4(String btnvalue){
        Intent intent = new Intent(this, Activity4.class);
        intent.putExtra("BF", btnvalue);
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
