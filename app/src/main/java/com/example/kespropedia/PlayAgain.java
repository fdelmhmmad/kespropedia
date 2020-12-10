package com.example.kespropedia;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.widget.Button;
import android.widget.TextView;

import info.hoang8f.widget.FButton;


public class PlayAgain extends Activity {

    Button playAgain;
    TextView wrongAnsText;
    FButton homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_again);
       //Initialize
        playAgain = (Button) findViewById(R.id.playAgainButton);
        wrongAnsText = (TextView)findViewById(R.id.wrongAns);
        homeButton = (FButton)findViewById(R.id.HomeButton);

        //play again button onclick listener
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.kespropedia.PlayAgain.this, Kuis1Fragment.class);
                startActivity(intent);
                finish();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(com.example.kespropedia.PlayAgain.this, HomeFragment.class);
                //startActivity(intent);
                finish();

            }
        });

        //Setting typefaces for textview and button - this will give stylish fonts on textview and button
//        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/shablagooital.ttf");
//        playAgain.setTypeface(typeface);
//        wrongAnsText.setTypeface(typeface);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
