package com.ebnesina.mohammad.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class numberActivity extends AppCompatActivity {
    ListView numberS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        numberS =findViewById(R.id.ls_number);
        ArrayList<String>number =new ArrayList<>();
        number.add(getString(R.string.one));
        number.add(getString(R.string.two));
        number.add(getString(R.string.three));
        number.add(getString(R.string.four));
        number.add(getString(R.string.five));
        number.add(getString(R.string.six));
        number.add(getString(R.string.seven));
        number.add(getString(R.string.eight));
        number.add(getString(R.string.nine));
        number.add(getString(R.string.ten));
        number.add(getString(R.string.eleven));
        number.add(getString(R.string.towelve));
        number.add(getString(R.string.thrteen));
        number.add(getString(R.string.fourteen));
        number.add(getString(R.string.fifteen));
        number.add(getString(R.string.sixteen));
        number.add(getString(R.string.seventeen));
        number.add("18");
        number.add(getString(R.string.ninteen));
        number.add(getString(R.string.tweny));


        ItemAdapter adapter = new ItemAdapter(this, number);

        numberS.setAdapter(adapter);
    }
}
