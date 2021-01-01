package com.neuronerdz.www;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Toolbar toolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(toolbar);

    }
    public void home(View view){
        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void test(View view){
        Intent i =new Intent(this,Test.class);
        startActivity(i);
    }
}