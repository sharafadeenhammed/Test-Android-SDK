package com.example.javaexamples;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get text entered by user...
        //EditText textInput = findViewById(R.id.editText);
        //textInput.setText("hello friends how are you doing today...");
        //String textEntered = textInput.getText().toString();

        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked!!", Toast.LENGTH_LONG ).show();
            }
        });

    }
}
