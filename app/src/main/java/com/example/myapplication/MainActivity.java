package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);
        img.setOnClickListener(this);
    }
    static boolean ch =true;
    @Override
    public void onClick(View view) {
        if (ch) {
            img = (ImageView) findViewById(R.id.imageView);
            img.setImageDrawable(getResources().getDrawable(R.drawable.second, null));
        } else {
            img = (ImageView) findViewById(R.id.imageView);
            img.setImageDrawable(getResources().getDrawable(R.drawable.first, null));
        }
        ch = !ch;
    }
}
