package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<RecycleViewItem> recycleViewItems = new ArrayList<>();
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,"Hello ", "life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,"Sad ", "life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,"Neutral ", "life is life!"));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        adapter = new RecycleViewAdapter(recycleViewItems);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}