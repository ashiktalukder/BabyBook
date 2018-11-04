package com.example.ashikcal.babybook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Kathal extends AppCompatActivity {

    private Button homefruit2 ;
    private Button previousfruit2;
    private Button nextfruit2;
    private ImageView imageakathal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kathal );

        nextfruit2 = (Button) findViewById ( R.id.nextfruit2);
        nextfruit2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Kathal.this,Mango.class );
                startActivity ( intent );
            }
        } );
        homefruit2 = (Button) findViewById ( R.id.homefruit2 );
        homefruit2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Kathal.this,MainActivity.class );
                startActivity ( intent );
            }
        } );

        previousfruit2 = (Button) findViewById ( R.id.previousfruit2 );
        previousfruit2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Kathal.this,Bannena.class);
                startActivity ( intent );
            }
        } );

        imageakathal = (ImageView) findViewById ( R.id.imagekathal );
        final MediaPlayer mediaPlayer = MediaPlayer.create ( this,R.raw.kathal );
        imageakathal.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                mediaPlayer.start ();
            }
        } );

    }
}
