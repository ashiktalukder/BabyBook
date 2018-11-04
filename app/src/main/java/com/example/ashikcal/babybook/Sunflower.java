package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sunflower extends AppCompatActivity {

    private Button home14;
    private Button previousflower4;
    private Button nextflower4;
    private ImageView imagesunflower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sunflower );

        nextflower4 = (Button) findViewById ( R.id.nextflower4);
        nextflower4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Sunflower.this,Rogoni.class );
                startActivity ( intent );
            }
        } );
        home14 = (Button) findViewById ( R.id.home14 );
        home14.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Sunflower.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousflower4 = (Button) findViewById ( R.id.previousflower4 );
        previousflower4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Sunflower.this,Kodom.class );
                startActivity ( intent );
            }
        } );

        imagesunflower = (ImageView) findViewById ( R.id.imagesunflower );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.sunflower );
        imagesunflower.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
