package com.example.tyitproject2020.HomePage.CourseContent.FYITfrags.Sub5Unit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tyitproject2020.R;

public class Classes_and_Objects_in_python extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_and__objects_in_python);
        Intent intent = getIntent();
        String title = intent.getStringExtra("TITLE");
        getSupportActionBar().setTitle(title);
    }
}