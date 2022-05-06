package com.example.noactivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editext;
    Button button;
    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hi);

        editext = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et = editext.getText().toString();
                displayandsavetext(et);

            }
        });


    }
    private void displayandsavetext(String enText){
        textView.setText(enText);
        SharedPreferences sharedPreferences = getSharedPreferences("mysharedpreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",enText);
        editor.commit();

    }

}
