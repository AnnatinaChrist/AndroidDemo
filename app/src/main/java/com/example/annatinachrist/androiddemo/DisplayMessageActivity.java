package com.example.annatinachrist.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(AndroidDemo.EXTRA_MESSAGE);

       //Create the text view
       TextView textView = new TextView(this);
       textView.setTextSize(40);
       textView.setText(message);

        //set the text view as the activity layout
       setContentView(textView);



    }
}
