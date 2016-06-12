package com.mitchell.codehub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodeHubMainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.av_code_hub_main);
        initView();
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.listview_av_code_hub);
        getListData();
    }

    private List getListData() {
         List<HashMap<String,String>> datas = new ArrayList<>();
            HashMap<String,String> dataItem= new HashMap<>();
            dataItem.put("titleName",com.mitchell.codehub.contentprovider.ContentProviderActivity.class.getSimpleName());
            dataItem.put("packageName",com.mitchell.codehub.contentprovider.ContentProviderActivity.class.getName());
            datas.add(dataItem);
        return datas;
    }
}
