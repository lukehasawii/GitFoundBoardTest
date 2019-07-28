package com.eoenesapps.foundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.eoenesapps.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playSound(View v) {
        //Place music files in file called raw, then after that the name of the file
        MediaPlayer mp = MediaPlayer.create(this, R.raw.heavyrain); //Placeholder file, change heavyrain to change what sound file it's playing
        mp.start();
    }
}
