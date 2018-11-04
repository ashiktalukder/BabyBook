package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dog extends AppCompatActivity {

    private Button home5 ;
    private Button previousanimal5;
    private Button nextfanimal5;
    private ImageView imagedog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dog );
        nextfanimal5 = (Button) findViewById ( R.id.nextanimal5);
        nextfanimal5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Dog.this,Tiger.class );
                startActivity ( intent );
            }
        } );
        home5 = (Button) findViewById ( R.id.home5 );
        home5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Dog.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousanimal5 = (Button) findViewById ( R.id.previousanimal5 );
        previousanimal5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Dog.this,Goat.class );
                startActivity ( intent );
            }
        } );

        imagedog = (ImageView) findViewById ( R.id.imagedog );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.dog );
        imagedog.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
