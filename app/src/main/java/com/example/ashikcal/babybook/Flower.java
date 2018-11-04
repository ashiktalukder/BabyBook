package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Flower extends AppCompatActivity {

    private Button home11;
    private Button previousflower1;
    private Button nextflower1;
    private ImageView imagesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_flower );

        nextflower1 = (Button) findViewById ( R.id.nextflower1);
        nextflower1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Flower.this,Golap.class );
                startActivity ( intent );
            }
        } );
        home11 = (Button) findViewById ( R.id.home11 );
        home11.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Flower.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousflower1 = (Button) findViewById ( R.id.previousflower1 );
        previousflower1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Flower.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        imagesapla = (ImageView) findViewById ( R.id.imagesapla );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.sapla );
        imagesapla.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
