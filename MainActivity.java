package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextPersonName2);
        textView =findViewById(R.id.textView2);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//              String s = editText.getText().toString();
                    if (editText.length()!=0) {
                        double kg = Double.parseDouble(editText.getText().toString());
                        double pound = 2.205 * kg;
                        textView.setText("value is : " + pound);
                    }
                    else {
                        textView.setText("above filed is empty");

                    }

                }

            });





    }
}