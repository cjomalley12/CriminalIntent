package com.example.internmacbook.criminalintent;

import java.util.UUID;

/**
 * Created by internmacbook on 6/29/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
    }

    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title){
        mTitle = title;
    }
}
