package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Kodom extends AppCompatActivity {

    private Button home13;
    private Button previousflower3;
    private Button nextflower3;
    private ImageView imagekodom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kodom );

        nextflower3 = (Button) findViewById ( R.id.nextflower3);
        nextflower3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Kodom.this,Sunflower.class );
                startActivity ( intent );
            }
        } );
        home13 = (Button) findViewById ( R.id.home13 );
        home13.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Kodom.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousflower3 = (Button) findViewById ( R.id.previousflower3 );
        previousflower3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Kodom.this,Golap.class );
                startActivity ( intent );
            }
        } );

        imagekodom = (ImageView) findViewById ( R.id.imagekodom );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.kodom );
        imagekodom.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
