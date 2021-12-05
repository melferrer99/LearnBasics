package com.example.learnbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PigsBW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pigs_bw);

        ImageView sun,moon;
        sun = (ImageView) findViewById(R.id.light);
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PigsBW.this,PigsW.class));
            }
        });
        moon = (ImageView) findViewById(R.id.dark);
        moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PigsBW.this,PigsB.class));
            }
        });


        TextView black,white;

        white = (TextView)findViewById(R.id.lm);
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PigsBW.this,PigsW.class));
            }
        });
        black = (TextView)findViewById(R.id.nm);
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PigsBW.this,PigsB.class));
            }
        });
    }
}
