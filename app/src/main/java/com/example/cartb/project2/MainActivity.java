package com.example.cartb.project2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

// A program to roll a virual die
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void rollDie(View view) {
        TextView textElement = (TextView) findViewById(R.id.dieResult);
        Random ran = new Random();
        int rollResult = ran.nextInt(7 - 1)+1;
        if(rollResult == 6) {
            textElement.setText(R.string.Message1);
        }
        else if(rollResult == 5) {
            textElement.setText(R.string.Message2);
        }
        else if (rollResult == 4) {
            textElement.setText(R.string.Message3);
        }
        else if (rollResult == 3) {
            textElement.setText(R.string.Message4);
        }
        else if (rollResult == 2) {
            textElement.setText(R.string.Message5);
        }
        else {
            textElement.setText(R.string.Message6);
        }
    }

}

