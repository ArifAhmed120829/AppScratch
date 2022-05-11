package com.example.noactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class database extends AppCompatActivity {
    private EditText Cname,Ctrack,Cdescription,Cduration;
    private Button btn100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database);

        Cname = findViewById(R.id.Cname);
        Ctrack = findViewById(R.id.Ctracks);
        Cdescription = findViewById(R.id.Cdescription);
        Cduration = findViewById(R.id.Cduration);
        





    }

}
