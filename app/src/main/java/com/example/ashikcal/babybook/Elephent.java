package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Elephent extends AppCompatActivity {

    private Button home3 ;
    private Button previousanimal3;
    private Button nextfanimal3;
    private ImageView imagehati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_elephent );

        nextfanimal3 = (Button) findViewById ( R.id.nextanimal3);
        nextfanimal3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Elephent.this,Goat.class );
                startActivity ( intent );
            }
        } );
        home3 = (Button) findViewById ( R.id.home3 );
        home3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Elephent.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousanimal3 = (Button) findViewById ( R.id.previousanimal3 );
        previousanimal3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Elephent.this,Tiger.class );
                startActivity ( intent );
            }
        } );

        imagehati = (ImageView) findViewById ( R.id.imagehati );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.elifent );
        imagehati.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );
    }
}
