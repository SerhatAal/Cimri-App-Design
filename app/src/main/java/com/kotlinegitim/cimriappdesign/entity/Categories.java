package com.kotlinegitim.cimriappdesign.entity;

import java.io.Serializable;

public class Categories implements Serializable {
    private int category_id;
    private String category_name;
    private String category_image;

    public Categories() {
    }

    public Categories(int category_id, String category_name, String category_image) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_image = category_image;
    }


    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_image() {
        return category_image;
    }

    public void setCategory_image(String category_image) {
        this.category_image = category_image;
    }
}