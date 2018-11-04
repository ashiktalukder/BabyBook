package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Golap extends AppCompatActivity {

    private Button home12;
    private Button previousflower2;
    private Button nextflower2;
    private ImageView imagegolap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_golap );

        nextflower2 = (Button) findViewById ( R.id.nextflower2);
        nextflower2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Golap.this,Kodom.class );
                startActivity ( intent );
            }
        } );
        home12 = (Button) findViewById ( R.id.home12 );
        home12.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Golap.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousflower2 = (Button) findViewById ( R.id.previousflower2 );
        previousflower2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Golap.this,Flower.class );
                startActivity ( intent );
            }
        } );

        imagegolap = (ImageView) findViewById ( R.id.imagegolap );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.golap );
        imagegolap.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
