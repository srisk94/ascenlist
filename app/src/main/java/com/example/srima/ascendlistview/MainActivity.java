package com.example.srima.ascendlistview;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.srima.ascendlistview.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button Ascend;
    Button Descend;
   List months=new ArrayList();
    public ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");
        setContentView(R.layout.activity_main);
        Ascend=(Button)findViewById(R.id.but1);
        Descend=(Button)findViewById(R.id.but2);
        list = (ListView) findViewById(R.id.list1);
        Ascend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Collections.sort(months);
                arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.list, months);
                list.setAdapter(arrayAdapter);
            }
        });
        Descend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Collections.sort(months,Collections.reverseOrder());
                arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.list, months);
                list.setAdapter(arrayAdapter);
            }
        });





    }
}
