package com.example.noactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class otherpage extends AppCompatActivity {
    TextView t1,t2;
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otherpage);
        t1 = findViewById(R.id.name69);
        t2 = findViewById(R.id.email69);
        btn5 =findViewById(R.id.button5);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("mysp",MODE_PRIVATE);
        String name = sp.getString("namee","");
        String email = sp.getString("emaile","");// here i typed wrong emailee that's why email didn't show up
        t1.setText(name);
        t2.setText(email);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(otherpage.this,database.class);
                startActivity(intent2);
            }
        });
    }

}
