package com.example.noactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class second extends AppCompatActivity {
    Button button3,button4;

    EditText name,email;
    SharedPreferences sp;
    String strname,stremail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        sp = getSharedPreferences("mysp",MODE_PRIVATE);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strname = name.getText().toString();
                stremail = email.getText().toString();
                SharedPreferences.Editor hiii  = sp.edit();
                hiii.putString("namee",strname);
                hiii.putString("emaile",stremail);
                hiii.commit();
                Toast.makeText(second.this,"Information svaed",Toast.LENGTH_LONG).show();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(second.this,otherpage.class);
                startActivity(intent);

            }
        });
    }
}