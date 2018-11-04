package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Goat extends AppCompatActivity {

    private Button home4 ;
    private Button previousanimal4;
    private Button nextfanimal4;
    private ImageView imagegoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_goat );


        nextfanimal4 = (Button) findViewById ( R.id.nextanimal4);
        nextfanimal4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Goat.this,Dog.class );
                startActivity ( intent );
            }
        } );
        home4 = (Button) findViewById ( R.id.home4 );
        home4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Goat.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousanimal4 = (Button) findViewById ( R.id.previousanimal4 );
        previousanimal4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Goat.this,Elephent.class );
                startActivity ( intent );
            }
        } );

        imagegoat = (ImageView) findViewById ( R.id.imagegoat );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.goat );
        imagegoat.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );
    }
}
