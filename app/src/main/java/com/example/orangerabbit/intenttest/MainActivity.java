package com.example.orangerabbit.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, orangeIntentService.class);
        startActivity(intent);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Bacon.class);
        final EditText orangeInput = findViewById(R.id.orangeInput);
        String baconMessage = orangeInput.getText().toString();
        i.putExtra("appleMessage",baconMessage);
        startActivity(i);
    }

}
