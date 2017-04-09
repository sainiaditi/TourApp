package com.example.android.tourguideapp;

import android.content.res.Resources;

/**
 * Created by Dell on 2/21/2017.
 */

public class word {
    private String mNames;
    //image resoutrce id for the word
    private int mImages = NO_IMAGE_PROVIDED;
    //constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;

    public word(String Names) {
        mNames = Names;
    }

    public word(int Images,String Names) {
        mImages = Images;
        mNames = Names;
    }

    public String getmNames() {
        return mNames;
    }

    public int getmImages(){
        return mImages;
    }

    public boolean hasImages(){
        return mImages != NO_IMAGE_PROVIDED;
    }


}
