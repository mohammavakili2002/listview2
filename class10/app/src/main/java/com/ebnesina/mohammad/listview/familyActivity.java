package com.ebnesina.mohammad.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class familyActivity extends AppCompatActivity {

    ListView family;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        family=findViewById(R.id.family);

        ArrayList<String> familys= new ArrayList<>();

        familys.add(getString(R.string.father));
        familys.add(getString(R.string.mother));
        familys.add(getString(R.string.boy));
        familys.add(getString(R.string.boyaunt));
        familys.add(getString(R.string.boybrother));
        familys.add(getString(R.string.boysister));
        familys.add(getString(R.string.boyuncle));
        familys.add(getString(R.string.ghazanfar));
        familys.add(getString(R.string.girl));
        familys.add(getString(R.string.girlaunt));
        familys.add(getString(R.string.girlbrother));
        familys.add(getString(R.string.girlsister));
        familys.add(getString(R.string.girluncle));
        familys.add(getString(R.string.grandfather));
        familys.add(getString(R.string.grandmother));
        familys.add(getString(R.string.wife));
        familys.add(getString(R.string.aunt));
        familys.add(getString(R.string.uncle));
        familys.add(getString(R.string.sister));
        familys.add(getString(R.string.brother));
        familys.add(getString(R.string.parent));
        familys.add(getString(R.string.child));
        familys.add(getString(R.string.boy));
        familys.add(getString(R.string.boyaunt));

        ItemAdapter adapter = new ItemAdapter(this, familys);

        family.setAdapter(adapter);

    }
}
