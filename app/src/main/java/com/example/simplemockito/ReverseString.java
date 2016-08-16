package com.example.simplemockito;

/**
 * Created by admin on 8/16/2016.
 */
public class ReverseString {
    public String doReverseString(String original){
        String reverseText = "";
        for (int i = original.length()-1; i >= 0; i--) {
            reverseText = reverseText +original.charAt(i) ;
        }
        return reverseText;
    }
}
