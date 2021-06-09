package com.example.recyclerviewdemo;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class ModelNew {
    private int type; //0- text, 1- image, 2- audio
    private String message,photoUrl;
    private int doesSrNoVisible;

    public ModelNew(int type, String message, int visibility) {
        this.type = type;
        this.message = message;
        this.doesSrNoVisible = visibility;
    }

    public ModelNew(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int isDoesSrNoVisible() {
        return doesSrNoVisible;
    }

    public void setDoesSrNoVisible(int doesSrNoVisible) {
        this.doesSrNoVisible = doesSrNoVisible;
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

    @BindingAdapter("android:onLoad")
    public static void onLoad(ImageView imageView , String url){
        Log.i("TAG", "onLoad: "+url);
        // Load Image using Glide/Picasso
    }
}
