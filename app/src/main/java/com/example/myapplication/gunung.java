package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class gunung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunung);


        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);
        Button but3=(Button) findViewById(R.id.button3);
        Button but4=(Button) findViewById(R.id.button4);
        Button but5=(Button) findViewById(R.id.button5);
        Button but6=(Button) findViewById(R.id.button6);
        Button but7=(Button) findViewById(R.id.button7);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(gunung.this, kerinci.class);
                startActivity(intent);
            }

        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(gunung.this, tujuh.class);
                startActivity(intent);
            }

        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(gunung.this, gentala.class);
                startActivity(intent);
            }

        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(gunung.this, masurai.class);
                startActivity(intent);
            }

        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(gunung.this, terjun.class);
                startActivity(intent);
            }

        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(gunung.this, candi.class);
                startActivity(intent);
            }

        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(gunung.this, kaco.class);
                startActivity(intent);
            }

        });


    }
}