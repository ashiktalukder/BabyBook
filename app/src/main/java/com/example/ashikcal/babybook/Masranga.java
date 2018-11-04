package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Masranga extends AppCompatActivity {

    private Button home8 ;
    private Button previousbirds3;
    private Button nextbirds3;
    private ImageView imagemasranga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_masranga );

        nextbirds3 = (Button) findViewById ( R.id.nextbirds3);
        nextbirds3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Masranga.this,Kak.class );
                startActivity ( intent );
            }
        } );
        home8 = (Button) findViewById ( R.id.home8 );
        home8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Masranga.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousbirds3 = (Button) findViewById ( R.id.previousbirds3 );
        previousbirds3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Masranga.this,Tiya.class );
                startActivity ( intent );
            }
        } );

        imagemasranga = (ImageView) findViewById ( R.id.imagemasranga );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.masranga );
        imagemasranga.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
