package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> module;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");

        module = new ArrayList<Module>();

        if (year.equals("Year 1") ){

        }else if(year.equals("Year 2")){
            module.add(new Module("C208", true));
            module.add(new Module("C200", false));
            module.add(new Module("C346", true));
        }

        tvYear.setText(year);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Module selectedModule = module.get(position);

                Toast.makeText(SecondActivity.this, selectedModule.getModuleCode()
                + selectedModule.getClass(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }

}
