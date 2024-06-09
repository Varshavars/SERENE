package com.example.serene;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class SecondPage  extends AppCompatActivity {
    private android.widget.ImageButton talk, recommendations, bot, therepy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        talk = findViewById(R.id.talk);
        bot = findViewById(R.id.bot);
        therepy = findViewById(R.id.therepy);
        recommendations = findViewById(R.id.recommendations);

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Set Up Permission activity
                Intent intent = new Intent(SecondPage.this, BotPage.class);
                startActivity(intent);
            }
        });

        // Edit contact list button click listener
        recommendations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Edit Contact List activity
                Intent intent = new Intent(SecondPage.this,Recommendations.class);
                startActivity(intent);
            }
        });

        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Edit Contact List activity
                Intent intent = new Intent(SecondPage.this,Talk.class);
                startActivity(intent);
            }
        });


        therepy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Edit Contact List activity
                Intent intent = new Intent(SecondPage.this,Therepy.class);
                startActivity(intent);
            }
        });
    }



    }
