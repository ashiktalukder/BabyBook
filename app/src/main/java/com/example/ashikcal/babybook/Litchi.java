package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Litchi extends AppCompatActivity {
    private Button homefruit4 ;
    private Button previousfruit4;
    private Button nextfruit4;
    private ImageView imagelitchi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_litchi );

        nextfruit4 = (Button) findViewById ( R.id.nextfruit4);
        nextfruit4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Litchi.this,Bannena.class );
                startActivity ( intent );
            }
        } );
        homefruit4 = (Button) findViewById ( R.id.homefruit4 );
        homefruit4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Litchi.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousfruit4 = (Button) findViewById ( R.id.previousfruit4 );
        previousfruit4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Litchi.this,Mango.class );
                startActivity ( intent );
            }
        } );

        imagelitchi = (ImageView) findViewById ( R.id.imagelitchi );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.litchi );
        imagelitchi.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
