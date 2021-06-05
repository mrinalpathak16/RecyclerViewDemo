package com.example.recyclerviewdemo;

public class ModelNew {
    private int type; //0- text, 1- image, 2- audio
    private String message;

    public ModelNew(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
