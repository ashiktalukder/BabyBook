package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Birds extends AppCompatActivity {

    private Button home6 ;
    private Button previousbirds1;
    private Button nextbirds1;
    private ImageView imagedoyel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_birds );

        nextbirds1 = (Button) findViewById ( R.id.nextbirds1);
        nextbirds1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Birds.this,Tiya.class );
                startActivity ( intent );
            }
        } );
        home6 = (Button) findViewById ( R.id.home6 );
        home6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Birds.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousbirds1 = (Button) findViewById ( R.id.previousbirds1 );
        previousbirds1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Birds.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        imagedoyel = (ImageView) findViewById ( R.id.imagedoyel );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.doyel );
        imagedoyel.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
