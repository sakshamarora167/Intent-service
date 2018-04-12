package com.example.orangerabbit.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle applesData = getIntent().getExtras();
        if(applesData==null){
            return;
        }
        String appleMessage = applesData.getString("appleMessage");
        final TextView baccontText = findViewById(R.id.baconText);
        baccontText.setText(appleMessage);
    }

    public void onClick(View view){
        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);
    }
}
