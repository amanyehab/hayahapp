package com.example.gleame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class basic_page extends AppCompatActivity {
CardView avoid_card,courses_card;
//
Spinner spinner;
String[] dia_type={"Diagnose with photo","Diagnose by questions","Diagnose by both"};
//

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_page);
        avoid_card = findViewById(R.id.avoid_card);
        avoid_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(basic_page.this, "See how to avoid", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(basic_page.this, avoid.class);
                startActivity(intent);
            }
        });
        courses_card = findViewById(R.id.courses_card);
        courses_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(basic_page.this, "Some courses to help", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(basic_page.this, Programs.class);
                startActivity(intent);
            }
        });

        spinner=findViewById(R.id.dia_type);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case(0):
                        Toast.makeText(basic_page.this, "Please select an option!", Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
//
        DrawerLayout drawerLayout=findViewById(R.id.drawerLayout);
        findViewById(R.id.nav_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView nav_view=findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case (R.id.contact):
                       Intent intent=new Intent(basic_page.this,contact.class);
                       startActivity(intent);
                       break;
                   case (R.id.logout):
                       Intent intent2=new Intent(basic_page.this,MainActivity.class);
                       startActivity(intent2);
                       break;
                   case (R.id.profile):
                       Intent intent3=new Intent(basic_page.this,children.class);
                       startActivity(intent3);
                       break;
               }
                return false;
            }

        });
//

    }
}