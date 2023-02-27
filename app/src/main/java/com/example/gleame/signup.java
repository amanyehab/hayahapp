package com.example.gleame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {
TextView login_fun;
ImageButton sign_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        sign_btn=findViewById(R.id.sign_btn);
        login_fun=findViewById(R.id.login_fun);
        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup.this,basic_page.class);
                startActivity(intent);
                Toast.makeText(signup.this, "You have an account now", Toast.LENGTH_SHORT).show();
            }
        });
        login_fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(signup.this,login.class);
                startActivity(intent2);
                Toast.makeText(signup.this, "LogIn now", Toast.LENGTH_SHORT).show();
            }
        });
    }
}