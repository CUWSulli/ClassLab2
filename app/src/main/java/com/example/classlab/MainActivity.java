package com.example.classlab;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.view.View;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static Button Button1;
    private static EditText input1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Scanner = new Scanner((Readable) input1);
        setContentView(R.layout.activity_main);
        Button1 = (Button1) findViewById(MainActivity.Button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, com.example.application.myapplication.Activity2.class);
        startActivity(intent);
    }
}