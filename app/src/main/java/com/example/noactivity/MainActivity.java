package com.example.noactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        TextView txt = findViewById(R.id.text1);
        TextView txt2 = findViewById(R.id.text2);
        txt.setText("Hello World");
        txt2.setText("Bye World");


    }

}
