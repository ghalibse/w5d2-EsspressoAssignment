package com.example.simplemockito;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.a_main_edittext);
    }

    public void doMagic(View view) {


        String str = mEditText.getText().toString();
        ReverseHelper reverseHelper = new ReverseHelper();

        Intent intent = new Intent(this, ActivityDetails.class);
        intent.putExtra(Intent.EXTRA_TEXT, reverseHelper.doReverse(str));
        startActivity(intent);
    }
}
