package com.izol.caripom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IZOL on 3/10/2019.
 */

public class Spbu extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        ArrayList<Objek> objects = new ArrayList<Objek>();
        objects.add(new Objek("Jl Siliwangi", "SPBU", R.drawable.spbu_unsil));
        objects.add(new Objek("Jl Mayor SL Tobing", "SPBU", R.drawable.spbu_tobing));
        objects.add(new Objek("Jl Sutisna Senjaya", "SPBU", R.drawable.spbu_sutsen));
        objects.add(new Objek("Jl Perintis Kemerdekaan", "SPBU", R.drawable.spbu_perintis));

        ObjekAdapter adapter = new ObjekAdapter(this, objects);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(Spbu.this, spbu_unsil_Activity.class));
                }
                else if (position == 1) {
                    startActivity(new Intent(Spbu.this, spbu_tobing_Activity.class));
                }
                else if (position == 2) {
                    startActivity(new Intent(Spbu.this, spbu_sutsen_Activity.class));
                }
                else if (position == 3) {
                    startActivity(new Intent(Spbu.this, spbu_perintis_Activity.class));
                }
            }
        });
    }
}
