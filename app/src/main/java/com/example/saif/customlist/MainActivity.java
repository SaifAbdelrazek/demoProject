package com.example.saif.customlist;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int []images ={R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h};
    String [] names = {"a","b","c","d","e","f","g","h"};
    String  [] jobs = {"eng","dr","pr","hr","sales","design","developer","manger"};

    ListView mlistView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlistView  =(ListView)findViewById(R.id.mListView);
        MyAdaptor mAdaptor= new MyAdaptor(MainActivity.this,names,jobs,images);
        mlistView.setAdapter(mAdaptor);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,names[position]+"__"+jobs[position],Toast.LENGTH_LONG).show();
            }
        });





    }

}
