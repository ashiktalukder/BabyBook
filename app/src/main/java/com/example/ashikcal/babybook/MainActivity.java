package com.example.ashikcal.babybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        button1 = (Button) findViewById ( R.id.button1 );
        button1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this,Animal.class );
                startActivity ( intent );
            }
        } );

        button2 = (Button) findViewById ( R.id.button2 );
        button2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this,Birds.class );
                startActivity ( intent );
            }
        } );

        button3 = (Button) findViewById ( R.id.button3 );
        button3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this,Flower.class );
                startActivity ( intent );
            }
        } );
        button4 = (Button) findViewById ( R.id.button4 );
        button4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this,Fruit.class );
                startActivity ( intent );
            }
        } );


    }
}
