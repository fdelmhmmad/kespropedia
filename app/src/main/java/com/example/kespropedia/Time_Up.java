package com.example.kespropedia;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class Time_Up extends AppCompatActivity {
    FButton playAgainButton;
    FButton homeButton;
    TextView timeUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time__up);
        //Initialize
        playAgainButton = (FButton)findViewById(R.id.playAgainButton);
        homeButton = (FButton)findViewById(R.id.HomeButton);
        timeUpText = (TextView)findViewById(R.id.timeUpText);

        //play again button onclick listener
        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.kespropedia.Time_Up.this, Kuis1Fragment.class);
                startActivity(intent);
                finish();

            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.kespropedia.Time_Up.this, HomeFragment.class);
                startActivity(intent);
                finish();

            }
        });


        //Setting typefaces for textview and button - this will give stylish fonts on textview and button
        //Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/shablagooital.ttf");
//        timeUpText.setTypeface(typeface);
//        playAgainButton.setTypeface(typeface);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
