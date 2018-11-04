package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Bannena extends AppCompatActivity {

    private Button homefruit1 ;
    private Button previousfruit1;
    private Button nextfruit1;
    private ImageView imagebenena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_bannena );
        nextfruit1 = (Button) findViewById ( R.id.nextfruit1);
        nextfruit1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (Bannena.this,Kathal.class);
                startActivity ( intent );
            }
        } );
        homefruit1 = (Button) findViewById ( R.id.homefruit1 );
        homefruit1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Bannena.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousfruit1 = (Button) findViewById ( R.id.previousfruit1 );
        previousfruit1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Bannena.this,Fruit.class );
                startActivity ( intent );
            }
        } );

        imagebenena = (ImageView) findViewById ( R.id.imagebenena );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.benana);
        imagebenena.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );
    }

    }

