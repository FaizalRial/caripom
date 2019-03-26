package com.izol.caripom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by IZOL on 3/10/2019.
 */

public class pomini extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        ArrayList<Objek> objects = new ArrayList<Objek>();
        objects.add(new Objek("Jalan Siliwangi (Toko Lestari)", "Pom Mini", R.drawable.spbu_perintis));
        objects.add(new Objek("Jalan Terusan BCA", "Pom Mini", R.drawable.spbu_sutsen));

        ObjekAdapter adapter = new ObjekAdapter(this, objects);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(pomini.this, pomini_lestari_Activity.class));
                }
                else if (position == 1) {
                    startActivity(new Intent(pomini.this, pomini_terusanBCA_Activity.class));
                }
            }
        });
    }
}
