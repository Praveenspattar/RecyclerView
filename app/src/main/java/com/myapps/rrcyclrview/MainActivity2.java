package com.myapps.rrcyclrview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView img;
    TextView t1,t2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = (ImageView) findViewById(R.id.desc_img);
        t1 = (TextView) findViewById(R.id.desc_header);
        t2 = (TextView) findViewById(R.id.desc_desc);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        t1.setText(getIntent().getStringExtra("header"));
        t2.setText(getIntent().getStringExtra("desc"));
    }
}