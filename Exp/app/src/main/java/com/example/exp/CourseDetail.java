package com.example.exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseDetail extends AppCompatActivity {
    ImageView courseImg;
    TextView coursename,courseDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        courseImg=findViewById(R.id.course_detail_image);
        coursename=findViewById(R.id.course_detail_name);
        courseDesc=findViewById(R.id.course_detail_desc);

        courseImg.setImageResource(getIntent().getExtras().getInt("Image_id"));
        coursename.setText(getIntent().getExtras().getString("course_name"));
        courseDesc.setText(getIntent().getExtras().getString("course_desc"));


    }
}