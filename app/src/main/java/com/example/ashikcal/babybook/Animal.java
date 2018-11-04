package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Animal extends AppCompatActivity {
    private Button home1 ;
    private Button previousanimal1;
    private Button nextanimal1;
    private ImageView imagecow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_animal );

        nextanimal1 = (Button) findViewById ( R.id.nextanimal1);
        nextanimal1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Animal.this,Tiger.class );
                startActivity ( intent );
            }
        } );
        home1 = (Button) findViewById ( R.id.home1 );
        home1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Animal.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousanimal1 = (Button) findViewById ( R.id.previousanimal1 );
        previousanimal1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Animal.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        imagecow = (ImageView) findViewById ( R.id.imagecow );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.cow );
        imagecow.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
