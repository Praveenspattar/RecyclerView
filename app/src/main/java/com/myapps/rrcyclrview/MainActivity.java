package com.myapps.rrcyclrview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and card view demo");

        rcv = (RecyclerView) findViewById(R.id.rclView);
        //rcv.setLayoutManager(new LinearLayoutManager(this));


        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        rcv.setLayoutManager(layoutManager);
    }

    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setHeader("Alpha");
        obj1.setDesc("asdfgh45");
        obj1.setImgname(R.drawable.men2);
        holder.add(obj1);

        Model obj2 = new Model();
        obj2.setHeader("Will");
        obj2.setDesc("asdfgh45");
        obj2.setImgname(R.drawable.men);
        holder.add(obj2);

        Model obj3 = new Model();
        obj3.setHeader("kitten");
        obj3.setDesc("asdfgh45");
        obj3.setImgname(R.drawable.cat);
        holder.add(obj3);

        Model obj4 = new Model();
        obj4.setHeader("Chitty");
        obj4.setDesc("asdfgh45");
        obj4.setImgname(R.drawable.chitty);
        holder.add(obj4);

        Model obj5 = new Model();
        obj5.setHeader("Skull");
        obj5.setDesc("asdfgh45");
        obj5.setImgname(R.drawable.face);
        holder.add(obj5);

        Model obj6 = new Model();
        obj6.setHeader("100 Pipers");
        obj6.setDesc("asdfgh45");
        obj6.setImgname(R.drawable.wiskey);
        holder.add(obj6);

        Model obj7 = new Model();
        obj7.setHeader("Joe");
        obj7.setDesc("asdfgh45");
        obj7.setImgname(R.drawable.women);
        holder.add(obj7);

        Model obj8 = new Model();
        obj8.setHeader("Alpha");
        obj8.setDesc("asdfgh45");
        obj8.setImgname(R.drawable.men2);
        holder.add(obj8);

        Model obj9 = new Model();
        obj9.setHeader("Will");
        obj9.setDesc("asdfgh45");
        obj9.setImgname(R.drawable.men);
        holder.add(obj9);

        Model obj10 = new Model();
        obj10.setHeader("kitten");
        obj10.setDesc("asdfgh45");
        obj10.setImgname(R.drawable.cat);
        holder.add(obj10);

        Model obj11 = new Model();
        obj11.setHeader("Joe");
        obj11.setDesc("asdfgh45");
        obj11.setImgname(R.drawable.women);
        holder.add(obj11);


        return holder;
    }
}