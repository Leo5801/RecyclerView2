package com.example.recyclerview;

public class RecycleViewItem {

    private int imageRecourse;
    private String text1;
    private String text2;


    public RecycleViewItem(int imageRecourse, String text1, String text2) {
        this.imageRecourse = imageRecourse;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImageRecourse() {
        return imageRecourse;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
