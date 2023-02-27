package com.example.gleame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Programs extends AppCompatActivity {
ListView coursesList;
CircleImageView arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
       coursesList=findViewById(R.id.coursesList);
        ArrayList<program>arr=new ArrayList<>();
        /*while (arr.size()<10){
            arr.add(new program(R.drawable.course1,10,"Course name","This course helps to:"));
        }*/
        List <String> coursename=new ArrayList<>();
        coursename.add("Course1");
        coursename.add("Course2");
        coursename.add("Course3");
        coursename.add("Course4");
        coursename.add("Course5");

        List <String> coursedesc=new ArrayList<>();
        coursename.add("This course is a help for");
        coursename.add("This course is a help for");
        coursename.add("This course is a help for");
        coursename.add("This course is a help for");
        coursename.add("This course is a help for");

        List <Integer> coursepic=new ArrayList<>();
        coursepic.add(R.drawable.course1);
        coursepic.add(R.drawable.course2);
        coursepic.add(R.drawable.course3);
        coursepic.add(R.drawable.course4);
        coursepic.add(R.drawable.course5);

        programadapter adapter=new programadapter(this,0,arr);
        coursesList.setAdapter(adapter);

        coursesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){}
                else if(position==1){
                    Intent i1=new Intent(Programs.this,video_page.class);
                    startActivity(i1);
                }
                else if(position==2){
                    Intent i=new Intent(Programs.this,video_page.class);
                    startActivity(i);
                }
                else if(position==3){
                    Intent i=new Intent(Programs.this,video_page.class);
                    startActivity(i);
                }
                else if(position==4){
                    Intent i=new Intent(Programs.this,video_page.class);
                    startActivity(i);
                }
                else if(position==5){
                    Intent i=new Intent(Programs.this,video_page.class);
                    startActivity(i);
                }
            }
        });
    }
}