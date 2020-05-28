package com.example.fragmentbestpractice;

import android.media.Image;
import android.widget.ImageView;

public class News {
    private ImageView image;
    private String title;

    private String content;
    public ImageView getImage(){return image;}
    public void setImage(ImageView image){this.image=image;}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}