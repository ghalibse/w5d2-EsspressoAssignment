package com.example.simplemockito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDetails extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_details);

        String aString = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        mTextView = (TextView) findViewById(R.id.some_text);
        mTextView.setText(aString);
    }
}
