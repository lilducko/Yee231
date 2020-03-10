package com.example.yee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button pressButton;
    TextView textView;
    Random random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressButton = findViewById(R.id.pressButton);
        textView = findViewById(R.id.text);

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {


showNewFact();

            }
        });
    }
    public void showNewFact(){
        String[] facts = {"im over 6ft",
                "I get girls easily",
                "my lambo is at home",
                "I am the best",
                " I love icecream",
                "phones are fun to me",
                "home",
                "not school",
                "dogs",
                "car"};
        random = new Random();
        int randomNumber = random.nextInt(facts.length);
        textView.setText (facts[randomNumber]);

    }
}
