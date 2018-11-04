package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Kak extends AppCompatActivity {

    private Button home9 ;
    private Button previousbirds4;
    private Button nextbirds4;
    private ImageView imagekak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kak );

        nextbirds4 = (Button) findViewById ( R.id.nextbirds4);
        nextbirds4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Kak.this,Kobithor.class );
                startActivity ( intent );
            }
        } );
        home9 = (Button) findViewById ( R.id.home9 );
        home9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Kak.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousbirds4 = (Button) findViewById ( R.id.previousbirds4 );
        previousbirds4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Kak.this,Masranga.class );
                startActivity ( intent );
            }
        } );

        imagekak = (ImageView) findViewById ( R.id.imagekak );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.kak );
        imagekak.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
