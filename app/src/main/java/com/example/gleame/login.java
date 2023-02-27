package com.example.gleame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
TextView signup_fun;
ImageButton log_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup_fun=findViewById(R.id.signup_fun);
        log_btn=findViewById(R.id.log_btn);
        log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login.this,basic_page.class);
                startActivity(intent);
                Toast.makeText(login.this, "You logged in successfully", Toast.LENGTH_SHORT).show();
            }
        });
        signup_fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(login.this,signup.class);
                startActivity(intent2);
                Toast.makeText(login.this, "You can create account", Toast.LENGTH_SHORT).show();
            }
        });
    }
}