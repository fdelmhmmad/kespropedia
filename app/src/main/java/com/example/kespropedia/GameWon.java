package com.example.kespropedia;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class GameWon extends Activity {

    //public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_won);
    }

    //This is onclick listener for button
    //it will navigate from this activity to MainGameActivity
    public void PlayAgain(View view) {
        Intent intent = new Intent(com.example.kespropedia.GameWon.this, Kuis1Fragment.class);
        startActivity(intent);
        finish();
    }
    public void Home(View view) {
        Intent intent = new Intent(com.example.kespropedia.GameWon.this, HomeFragment.class);
        startActivity(intent);
        finish();
    }
}
