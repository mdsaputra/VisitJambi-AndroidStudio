package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class kaco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaco);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Button btn7=(Button) findViewById(R.id.button7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent intent = new Intent(kaco.this, MapsKaco.class);
                startActivity(intent);
            }

        });
    }
}