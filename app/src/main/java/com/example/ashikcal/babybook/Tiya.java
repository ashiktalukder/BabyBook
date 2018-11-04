package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tiya extends AppCompatActivity {

    private Button home7 ;
    private Button previousbirds2;
    private Button nextbirds2;
    private ImageView imagetiya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_tiya );

        nextbirds2 = (Button) findViewById ( R.id.nextbirds2);
        nextbirds2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Tiya.this,Masranga.class );
                startActivity ( intent );
            }
        } );
        home7 = (Button) findViewById ( R.id.home7 );
        home7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Tiya.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousbirds2 = (Button) findViewById ( R.id.previousbirds2 );
        previousbirds2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Tiya.this,Birds.class );
                startActivity ( intent );
            }
        } );

        imagetiya = (ImageView) findViewById ( R.id.imagetiya );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.tiya );
        imagetiya.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
