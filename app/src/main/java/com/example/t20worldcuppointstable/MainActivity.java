package com.example.t20worldcuppointstable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton P1,N1,I1,A1,Nim1,S1;

        P1=findViewById(R.id.pakistan);
        N1=findViewById(R.id.newzeland);
        I1=findViewById(R.id.india);
        A1=findViewById(R.id.afghanistan);
        Nim1=findViewById(R.id.namibia);
        S1=findViewById(R.id.scotland);

        P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Pakistan.class);
                startActivity(intent);
            }
        });

        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Newzealand.class);
                startActivity(intent);
            }
        });

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,India.class);
                startActivity(intent);
            }
        });

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Afghanistan.class);
                startActivity(intent);
            }
        });

        Nim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Namibia.class);
                startActivity(intent);
            }
        });

        S1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Scotland.class);
                startActivity(intent);
            }
        });


    }
}