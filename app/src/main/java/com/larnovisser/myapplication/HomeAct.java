package com.larnovisser.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HomeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        final TextView tvLog =findViewById(R.id.tvLog);
        Context context = getApplicationContext();
        String fileData =readFromFile(context, "config2.txt");
        //Here we need to put fileData in an array, separated by comma, and then transform that array such that it is useful
        String[] test = fileData.split(",");
        tvLog.setText("");
        //tvLog.setText(test[6]);
        //tvLog.setText("");
        //tvLog.setText(test[0]);
    }

    private String readFromFile(Context context, String fileName) {
        String ret = "";
        try {
            InputStream inputStream = context.openFileInput(fileName);

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();
                //read one by one the lines in the file
                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    Log.v("check", "file data: " + receiveString);
                    stringBuilder.append(receiveString + "\n");
                }
                inputStream.close();
                ret = stringBuilder.toString();
            }
        } catch (FileNotFoundException e) {
            Log.e("Exception", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("Exception", "Can not read file: " + e.toString());
        }
        return ret;
    }
}
