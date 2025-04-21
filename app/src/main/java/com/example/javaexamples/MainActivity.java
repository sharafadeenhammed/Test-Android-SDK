package com.example.javaexamples;

import android.content.Intent;
import android.net.Uri;
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
        Toast.makeText(this, "ON CREATE TOAST MESSAGE", Toast.LENGTH_LONG).show();
        final Button button = findViewById(R.id.button);
        final Button googleBtn = findViewById(R.id.google);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSecondActivity();
            }
        });

        googleBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                gotoWebpage();
            }
        });
    }

    void gotoSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    void gotoWebpage (){
        final Uri uri =  Uri.parse("https://www.google.com");
        final Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        // runs once when activity is loaded and can be interacted with by user
        super.onStart();
        final long time = 5;
        Toast.makeText(this, "ON START TOAST MESSAGE", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        // runs when activity loses focus
        super.onPause();
        Toast.makeText(this, "ON PAUSE TOAST MESSAGE", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        // runs when activity regains focus
        super.onResume();
        Toast.makeText(this, "ON RESUME TOAST MESSAGE", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        // runs when activity is removed i.e no longer visible to the user
        super.onStop();
        Toast.makeText(this, "ON STOP TOAST MESSAGE", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        // this method runs when activity is restarted(an activity previously stopped and now started)
        // and and followed by start method i.e onStart method runs right after the onRestart method is called
        super.onRestart();
        Toast.makeText(this, "ON RESTART TOAST MESSAGE", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "ON DESTROY TOAST MESSAGE", Toast.LENGTH_LONG).show();
    }

}
