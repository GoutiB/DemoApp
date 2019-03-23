package com.example.goutib.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Define Button and Text

    TextView demoText;
    Button demoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign IDs to the variables

        demoButton = findViewById(R.id.demobutton);

        //OnClickListener for listening for Button Clicks

        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                demoText.setText("This is my First App!!");
            }
        });



    }
}
