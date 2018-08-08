package com.ebnesina.mohammad.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class colorActivity extends AppCompatActivity {
    ListView colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        colors=findViewById(R.id.lv_color);

        ArrayList<String> color = new ArrayList<>();
        color.add(getString(R.string.white));
        color.add(getString(R.string.yellow));
        color.add(getString(R.string.red));
        color.add(getString(R.string.black));
        color.add(getString(R.string.blue));
        color.add(getString(R.string.brown));
        color.add(getString(R.string.orange));
        color.add(getString(R.string.pink));
        color.add(getString(R.string.gray));
        color.add(getString(R.string.green));





        ItemAdapter adbtor=new ItemAdapter(this,color);
        colors.setAdapter(adbtor);


    }
}
