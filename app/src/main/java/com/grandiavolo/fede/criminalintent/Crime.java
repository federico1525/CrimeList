package com.grandiavolo.fede.criminalintent;

import java.util.UUID;

/**
 * Created by fede on 4/12/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        // generate a unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
