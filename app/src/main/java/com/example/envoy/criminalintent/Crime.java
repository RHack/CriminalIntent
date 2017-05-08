package com.example.envoy.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Envoy on 5/8/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
