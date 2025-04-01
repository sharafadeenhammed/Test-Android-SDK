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
        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                updateValues();
            }
        });
    }

    void updateValues (){
        TextView poundTextView = findViewById(R.id.weightInPounds);
        EditText poundEditTextView = findViewById(R.id.weightInKilo);
        final String  enteredValue = poundEditTextView.getText().toString();
        final double kilos =  enteredValue.isEmpty() ? 0 : Double.parseDouble(enteredValue);
        final double valueInPound = convertKiloToPounds(kilos);
        poundTextView.setText(valueInPound > 0 ? valueInPound+" pounds": "");
    }

    double convertKiloToPounds(double kilos){
        // 1 kilo = 2.20462 pounds
        return kilos * 2.20462;
    }
}
