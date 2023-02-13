package com.touristiccentres.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.touristiccentres.R;
import com.touristiccentres.adapters.AdapterScreenMain;
import com.touristiccentres.data.ListData;

public class ScreenMainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ListData listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_main);

        init();

        AdapterScreenMain adapter = new AdapterScreenMain(listData.Touristic(), ScreenMainActivity.this);
        mRecyclerView.setAdapter(adapter);
    }

    private void init() {
        mRecyclerView = findViewById(R.id.recycler_touristic);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        listData = new ListData();
    }
}