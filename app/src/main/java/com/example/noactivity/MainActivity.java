package com.example.noactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editext;
    Button button,button2;
    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hi);

        editext = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textview);
        retrieve(); /// calling if theres any save data



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et = editext.getText().toString();
                displayandsavetext(et); // showing the data which was written in edittext

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),second.class);
                startActivity(i);
            }
        });


    }
    private void retrieve(){
        SharedPreferences sp = getSharedPreferences("mysharedpreferences",MODE_PRIVATE);//String & Int
        String s1 = sp.getString("name"," ");
        textView.setText(s1);
    }
    private void displayandsavetext(String enText){
        textView.setText(enText);
        SharedPreferences sharedPreferences = getSharedPreferences("mysharedpreferences",MODE_PRIVATE);//String & Int
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",enText);
        editor.commit();

    }


}
