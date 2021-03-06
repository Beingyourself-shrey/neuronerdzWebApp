package com.neuronerdz.www;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Explore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        Toolbar toolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(toolbar);

    }
    public void home(View view){
        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void explore(View view){
        Intent i =new Intent(this, Explore.class);
        startActivity(i);
    }
    public void about(View view){
        Intent i =new Intent(this, AboutActivity.class);
        startActivity(i);
    }
    public void clickedCategory(View v){
        String category=v.getTag().toString();
        Log.d(category, "clickedCategory: ");
        Intent i=new Intent(this,Catergory.class);
        i.putExtra("category", category);
        startActivity(i);
    }
}