package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;

    int[] colors={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1=MediaPlayer.create(MainActivity.this,R.raw.one);
        m2=MediaPlayer.create(MainActivity.this,R.raw.two);
        m3=MediaPlayer.create(MainActivity.this,R.raw.three);
        m4=MediaPlayer.create(MainActivity.this,R.raw.four);
        m5=MediaPlayer.create(MainActivity.this,R.raw.five);
        m6=MediaPlayer.create(MainActivity.this,R.raw.six);
        m7=MediaPlayer.create(MainActivity.this,R.raw.seven);
        m8=MediaPlayer.create(MainActivity.this,R.raw.eight);





    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        int rand=(int)Math.round(Math.random()*(colors.length-1));

        findViewById(v.getId()).setBackgroundResource(colors[rand]);
        switch (id)
        {
            case R.id.one:

                    m1.start();
                    // Toast.makeText(MainActivity.this, ""+rand, Toast.LENGTH_SHORT).show();
                    break;
            case R.id.two:
                //m2.start();

                try {
                    if (m2.isPlaying()) {
                        m2.stop();
                        m2.release();
                        m2 = MediaPlayer.create(MainActivity.this, R.raw.two);
                    }
                    m2.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.three:
                try {
                    if (m2.isPlaying()) {
                        m2.stop();
                        m2.release();
                        m2 = MediaPlayer.create(MainActivity.this, R.raw.three);
                    }
                    m2.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case R.id.four:
                try {
                    if (m4.isPlaying()) {
                        m4.stop();
                        m4.release();
                        m4 = MediaPlayer.create(MainActivity.this, R.raw.four);
                    }
                    m4.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case R.id.five:
                try {
                    if (m5.isPlaying()) {
                        m5.stop();
                        m5.release();
                        m5 = MediaPlayer.create(MainActivity.this, R.raw.five);
                    }
                    m5.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case R.id.six:
                try {
                    if (m6.isPlaying()) {
                        m6.stop();
                        m6.release();
                        m6 = MediaPlayer.create(MainActivity.this, R.raw.six);
                    }
                    m6.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case R.id.seven:
                try {
                    if (m7.isPlaying()) {
                        m7.stop();
                        m7.release();
                        m7 = MediaPlayer.create(MainActivity.this, R.raw.seven);
                    }
                    m7.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case R.id.eight:
                
                try {
                    if (m8.isPlaying()) {
                        m8.stop();
                        m8.release();
                        m8 = MediaPlayer.create(MainActivity.this, R.raw.eight);
                    }
                    m8.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                break;

        }
    }
}
