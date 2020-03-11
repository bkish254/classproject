package com.example.wash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ClientRegistration extends AppCompatActivity {
Button signup;
LinearLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_registration);

        back=findViewById(R.id.back);
        signup=findViewById(R.id.btnSignUp);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClientRegistration.this, ClientProfile.class);
                startActivity(intent);
            }
        });

           back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClientRegistration.this, MainActivity.class);
                startActivity(intent);

        }
        });
}}
