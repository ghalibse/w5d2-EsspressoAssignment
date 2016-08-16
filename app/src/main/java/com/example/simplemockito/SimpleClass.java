package com.example.simplemockito;

import android.content.Context;

/**
 * Created by evin on 4/29/16.
 */
public class SimpleClass {

    Context mContext;

    SimpleClass(Context context) {
        mContext = context;
    }

    public String getHelloWorldString() {
        return mContext.getString(R.string.hello_word);
    }
}
