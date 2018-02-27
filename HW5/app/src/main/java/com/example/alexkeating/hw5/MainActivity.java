package com.example.alexkeating.hw5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    TextView time;
    Button start;
    SeekBar timeBar;
    static int seconds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideShow();
    }
    protected void slideShow(){
        timeBar = (SeekBar)findViewById(R.id.timeBar);
        start = (Button)findViewById(R.id.startButton);
        time = (TextView)findViewById(R.id.timeDisplay);

        timeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                time.setText(String.valueOf(i) + " Seconds");
                seconds = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            });
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentPic = new Intent(getApplicationContext(), startPhotos.class);
                startActivity(intentPic);

            }});
    }

}

