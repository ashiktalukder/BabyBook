package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tiger extends AppCompatActivity {
    private Button home2 ;
    private Button previousanimal2;
    private Button nextfanimal2;
    private ImageView imagetiger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_tiger );
        nextfanimal2 = (Button) findViewById ( R.id.nextanimal2);
        nextfanimal2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Tiger.this,Elephent.class );
                startActivity ( intent );
            }
        } );
        home2 = (Button) findViewById ( R.id.home2 );
        home2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Tiger.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousanimal2 = (Button) findViewById ( R.id.previousanimal2 );
        previousanimal2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Tiger.this,Animal.class );
                startActivity ( intent );
            }
        } );

        imagetiger = (ImageView) findViewById ( R.id.imagetiger );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.tiger );
        imagetiger.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
