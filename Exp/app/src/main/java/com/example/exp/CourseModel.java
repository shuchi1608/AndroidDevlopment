package com.example.exp;

public class CourseModel {

    int image_id;
    String name;
    String description;

    public CourseModel(int image_id, String name, String description) {
        this.image_id = image_id;
        this.name = name;
        this.description = description;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
