package com.example.javaexamples;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get text entered by user...
        TextView textView = findViewById(R.id.counterText);
        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int currentCountText =  textView.getText().toString().isEmpty() ? 0 : (Integer.parseInt(textView.getText().toString()));
                currentCountText++;
                textView.setText(""+currentCountText);
            }
        });

    }
}
