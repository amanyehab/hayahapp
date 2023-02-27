package com.example.gleame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class home extends AppCompatActivity {
ImageButton login_btn, signup_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        login_btn=findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,login.class);
                startActivity(intent);
                Toast.makeText(home.this, " log in", Toast.LENGTH_SHORT).show();
            }
        });
        signup_btn=findViewById(R.id.signup_btn);
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,signup.class);
                startActivity(intent);
                Toast.makeText(home.this, "sign up", Toast.LENGTH_SHORT).show();
            }
        });


    }
}