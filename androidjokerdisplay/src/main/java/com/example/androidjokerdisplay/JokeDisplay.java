package com.example.androidjokerdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeDisplay extends AppCompatActivity {

    public static String key="JOKE_TELLING_KEY";
    TextView jokeDisplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        String str=getIntent().getExtras().getString(key);
        if(str!=null){
            jokeDisplayer= (TextView) findViewById(R.id.jokeDisplayTv);

            jokeDisplayer.setText(str);

        }
    }
}
