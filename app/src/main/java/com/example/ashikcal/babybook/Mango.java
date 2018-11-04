package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mango extends AppCompatActivity {
    private Button homefruit3 ;
    private Button previousfruit3;
    private Button nextfruit3;
    private ImageView imagemango;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_mango );
        nextfruit3 = (Button) findViewById ( R.id.nextfruit3);
        nextfruit3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Mango.this,Litchi.class );
                startActivity ( intent );
            }
        } );
        homefruit3 = (Button) findViewById ( R.id.homefruit3 );
        homefruit3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Mango.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousfruit3 = (Button) findViewById ( R.id.previousfruit3 );
        previousfruit3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Mango.this,Kathal.class );
                startActivity ( intent );
            }
        } );

        imagemango = (ImageView) findViewById ( R.id.imagemango );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.mango );
        imagemango.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );
    }
}
