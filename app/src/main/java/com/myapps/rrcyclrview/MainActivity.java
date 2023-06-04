package com.myapps.rrcyclrview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView) findViewById(R.id.rclView);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr[] = {"bheem","Chutki","Raju","jaggu","kaliya","dholu","bolu","tun tun","bheem","Chutki","Raju","jaggu","kaliya","dholu","bolu","tun tun"};
        myAdapter praveen = new myAdapter(arr);
        rcv.setAdapter(praveen);
        //rcv.setAdapter(new myAdapter(arr));
    }
}