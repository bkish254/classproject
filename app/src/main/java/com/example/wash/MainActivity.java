package com.example.wash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
Button client;
LinearLayout linearLayout;
Animation frombottom, fromtop;
ImageView laundry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint);

        client=findViewById(R.id.btnClient);
        linearLayout=findViewById(R.id.linearLayout);
        laundry=findViewById(R.id.laundry);

        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        frombottom.setDuration(1200);
        //frombottom.setStartTime(100);
        linearLayout.setAnimation(frombottom);
        linearLayout.startAnimation(frombottom);

        fromtop= AnimationUtils.loadAnimation(this,R.anim.fromtop);
        fromtop.setDuration(1200);
        //frombottom.setStartTime(100);
        laundry.setAnimation(fromtop);
        laundry.startAnimation(fromtop);

        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ClientRegistration.class);
                startActivity(intent);
            }
        });
    }
}
