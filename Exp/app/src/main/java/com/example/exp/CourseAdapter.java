package com.example.exp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    List<CourseModel> course_List;
    private Context context;

    public CourseAdapter(List<CourseModel> courseList, Context context) {
        course_List=courseList;
        this.context=context;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem,parent,false);
        CourseViewHolder courseViewHolder=new CourseViewHolder(view);
        return courseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull CourseAdapter.CourseViewHolder holder, int position) {
    holder.courseImage.setImageResource(course_List.get(position).image_id);
    holder.course.setText(course_List.get(position).name);
    holder.courseDesc.setText(course_List.get(position).description);

    holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(context.getApplicationContext(),CourseDetail.class);
            intent.putExtra("Image_id",course_List.get(position).image_id);
            intent.putExtra("course_name",course_List.get(position).name);
            intent.putExtra("course_desc",course_List.get(position).description);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.getApplicationContext().startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return course_List.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView course,courseDesc;
        ImageView courseImage;
        RelativeLayout relativeLayout;
        public CourseViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            course=itemView.findViewById(R.id.courseName);
            courseDesc=itemView.findViewById(R.id.courseDesc);
            courseImage=itemView.findViewById(R.id.courseImg);
            relativeLayout=itemView.findViewById(R.id.layout_id);
        }
    }
}
