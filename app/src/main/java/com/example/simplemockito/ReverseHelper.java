package com.example.simplemockito;

/**
 * Created by admin on 8/16/2016.
 */
public class ReverseHelper {

    public String doReverse(String str){

        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
}
