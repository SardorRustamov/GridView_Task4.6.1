package com.example.gridview_task461;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView= findViewById(R.id.gridView);


        int logo[] ={R.drawable.ic_baseline_mood_bad_24,
                R.drawable.ic_baseline_hourglass_empty,
                R.drawable.ic_baseline_mood_bad_24,
                R.drawable.ic_baseline_insert_emoticon_24,
                R.drawable.ic_baseline_run_circle_24,
                R.drawable.ic_baseline_self_improvement_24,
                R.drawable.ic_baseline_person_24,
                R.drawable.ic_baseline_hourglass_empty,
                R.drawable.ic_baseline_insert_emoticon_24
        };

        ImageAdapter imageAdapter = new ImageAdapter(getApplicationContext(), logo);
        gridView.setAdapter(imageAdapter);
    }
}