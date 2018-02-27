package com.example.alexkeating.hw5;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class startPhotos extends AppCompatActivity {
    TextView title, subtitle;
    ImageView mainPic;
    Handler myHandler = new Handler();

    int position = 0;

    String ListPicName[] = new String[]{"HearthStone", "Overwatch",
            "Destiny", "PUBG", "BF:One", "Zelda: BOTW", "Slay the Spire", "Mario Kart", "Starcraft"
            , "World Of Warcraft"};

    String picSubtext[] = new String[]{"Fun to play, but can get expensive.",
            "Talk about toxic playerbase",
            "Developers that ruined the sequel",
            "Oh hey, another hacker.",
            "The most Meh Battlefield",
            "Probably the best game ever",
            "RNG",
            "H8 your friends",
            "Im going to drop from diamond after this game.",
            "Addicted."
    };

    Integer imageNumber[] = new Integer[]{R.drawable.hearthstone, R.drawable.ow, R.drawable.destiny,
            R.drawable.pubg, R.drawable.bfone, R.drawable.wow, R.drawable.slaythespire, R.drawable.mariokart,
            R.drawable.sctwo, R.drawable.botw};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        position = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_photos);
        title = (TextView) findViewById(R.id.imageTitle);
        subtitle = (TextView) findViewById(R.id.imageSubtext);
        mainPic = (ImageView) findViewById(R.id.mainPic);
        title.setText(String.valueOf(position));


for(int i = 0; i < imageNumber.length; i++) {
    final int position = i;
    Runnable myRunnable = new Runnable() {
        @Override
        public void run() {
            int item = 0;
            mainPic.setImageResource(imageNumber[position]);
            myHandler.postDelayed(this, 5000);

        }
    };
    myHandler.postDelayed(myRunnable, 5000);
}





    }
}
