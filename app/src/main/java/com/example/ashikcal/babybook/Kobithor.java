package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Kobithor extends AppCompatActivity {

    private Button home10 ;
    private Button previousbirds5;
    private Button nextbirds5;
    private ImageView imagekobithor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kobithor );

        nextbirds5 = (Button) findViewById ( R.id.nextbirds5);
        nextbirds5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Kobithor.this,Tiya.class );
                startActivity ( intent );
            }
        } );
        home10 = (Button) findViewById ( R.id.home10 );
        home10.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Kobithor.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousbirds5 = (Button) findViewById ( R.id.previousbirds5 );
        previousbirds5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Kobithor.this,Kak.class );
                startActivity ( intent );
            }
        } );

        imagekobithor = (ImageView) findViewById ( R.id.imagekobithor );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.kak );
        imagekobithor.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
