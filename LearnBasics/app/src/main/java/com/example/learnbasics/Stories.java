package com.example.learnbasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class Stories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        ImageButton little, jack,duck,cindy,hansel, rap,snow,ginger,mermaid,pig;

        little = (ImageButton)findViewById(R.id.little);
        little.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,RedBW.class));
            }
        });

        jack = (ImageButton)findViewById(R.id.jack);
        jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,JackBW.class));
            }
        });

        duck = (ImageButton)findViewById(R.id.duck);
        duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,DuckBW.class));
            }
        });

        cindy = (ImageButton)findViewById(R.id.cinderella);
        cindy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,CinderellaBW.class));
            }
        });

        hansel = (ImageButton)findViewById(R.id.hansel);
        hansel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,HanselBW.class));
            }
        });

        rap = (ImageButton)findViewById(R.id.rapunzel);
        rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,RapunzelBW.class));
            }
        });

        snow = (ImageButton)findViewById(R.id.snow);
        snow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,SnowBW.class));
            }
        });

        ginger = (ImageButton)findViewById(R.id.bread);
        ginger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,GingerBreadBW.class));
            }
        });

        mermaid = (ImageButton)findViewById(R.id.mermaid);
        mermaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,MermaidBW.class));
            }
        });

       pig = (ImageButton)findViewById(R.id.pigs);
        pig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stories.this,PigsBW.class));
            }
        });
    }

}
