package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fruit extends AppCompatActivity {
     private Button homefruit ;
     private Button previousfruit;
     private Button nextfruit;
     private ImageView imageapple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_fruit );

        nextfruit = (Button) findViewById ( R.id.nextfruit);
        nextfruit.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent ( Fruit.this,Bannena.class );
                startActivity ( intent );
            }
        } );
        homefruit = (Button) findViewById ( R.id.homefruit );
       homefruit.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Fruit.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousfruit = (Button) findViewById ( R.id.previousfruit );
            previousfruit.setOnClickListener ( new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent ( Fruit.this,MainActivity.class );
                    startActivity ( intent );
                }
            } );

        imageapple = (ImageView) findViewById ( R.id.imageapple );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.apple2 );
        imageapple.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );
    }
}
