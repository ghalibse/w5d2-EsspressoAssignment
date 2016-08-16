package com.example.simplemockito;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "reverse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doReverse(View view) {
        Intent intent = new Intent(this, ActivityDetails.class);
        EditText editText = (EditText) findViewById(R.id.a_main_edittext);
        String message = editText.getText().toString();
        ReverseString reverseString = new ReverseString();
        intent.putExtra(EXTRA_MESSAGE, reverseString.doReverseString(message));
        startActivity(intent);
    }
}
