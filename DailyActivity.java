package com.example.openweatherapp;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DailyActivity extends AppCompatActivity {
    private ArrayList<Daily> dailyList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DailyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_weather);
        recyclerView = findViewById(R.id.dailyWeather);

        if (getIntent().hasExtra("weather")) {
            Weather weather = (Weather) getIntent().getSerializableExtra("weather");
            String unit = getIntent().getStringExtra("unit");
            String locale = getIntent().getStringExtra("locale");

            setAppBarTitle(locale);

            dailyList.addAll(weather.getDaily());

            adapter = new DailyAdapter(dailyList, this, unit, weather);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        }
    }

    private void setAppBarTitle(String appBarTitle) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(appBarTitle);
        }
    }
}
