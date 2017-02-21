package com.li.androidutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.li.androidutils.adapter.HomeAdapter;
import com.li.androidutils.constant.Constants;

import java.util.ArrayList;
import java.util.List;

public class  MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private ListView utils_lv;
    private void initView() {
        utils_lv = (ListView) findViewById(R.id.utils_lv);
        utils_lv.setOnItemClickListener(this);
        utils_lv.setAdapter(new HomeAdapter(MainActivity.this, getData()));
    }

    public List getData() {
        List data = new ArrayList();
        for (String name : Constants.homeName) {
            data.add(name);
        }
        return data;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, Constants.activityList[position]);
        startActivity(intent);
    }
}
