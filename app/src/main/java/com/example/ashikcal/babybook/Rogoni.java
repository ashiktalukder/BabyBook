package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Rogoni extends AppCompatActivity {

    private Button home15;
    private Button previousflower5;
    private Button nextflower5;
    private ImageView imagerogoni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_rogoni );

        nextflower5 = (Button) findViewById ( R.id.nextflower5);
        nextflower5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Rogoni.this,Golap.class );
                startActivity ( intent );
            }
        } );
        home15 = (Button) findViewById ( R.id.home15 );
        home15.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Rogoni.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousflower5 = (Button) findViewById ( R.id.previousflower5 );
        previousflower5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Rogoni.this,Sunflower.class );
                startActivity ( intent );
            }
        } );

        imagerogoni = (ImageView) findViewById ( R.id.imagerogoni);
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.rogonigondha );
        imagerogoni.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
