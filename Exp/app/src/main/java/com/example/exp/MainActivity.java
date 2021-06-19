package com.example.exp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<CourseModel> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycle);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        courseList=new ArrayList<>();
        courseList.add(new CourseModel(R.drawable.java,"Java","Best Course of Java"));
        courseList.add(new CourseModel(R.drawable.c1,"C++","Best Course of C++"));
        courseList.add(new CourseModel(R.drawable.php,"PHP","Best Course of PHP"));
        courseList.add(new CourseModel(R.drawable.ruby,"Ruby","Best Course of Ruby"));
        courseList.add(new CourseModel(R.drawable.js,"Javascript","Best Course of Javascript"));
        courseList.add(new CourseModel(R.drawable.html,"HTML","Best Course of HTML"));
        courseList.add(new CourseModel(R.drawable.css,"CSS","Best Course of CSS"));
        courseList.add(new CourseModel(R.drawable.python,"Python","Best Course of Python"));
        courseList.add(new CourseModel(R.drawable.c,"C","Best Course of C"));
        courseList.add(new CourseModel(R.drawable.react,"React","Best Course of React"));
        courseList.add(new CourseModel(R.drawable.dart,"Dart","Best Course of Dart"));
        courseList.add(new CourseModel(R.drawable.kotlin,"Kotlin","Best Course of Kotlin"));
        courseList.add(new CourseModel(R.drawable.git,"Git","Best Course of Git"));
        courseList.add(new CourseModel(R.drawable.android,"Android","Best Course of Android"));
        courseList.add(new CourseModel(R.drawable.f,"Flutter","Best Course of Flutter"));
        courseList.add(new CourseModel(R.drawable.go,"Golang","Best Course of Golang"));


        CourseAdapter adapter=new CourseAdapter(courseList,this);
        recyclerView.setAdapter(adapter);



    }
}