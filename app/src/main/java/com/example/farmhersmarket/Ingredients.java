package com.example.farmhersmarket;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Ingredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setSeasonality();
        setImage();
        setName();

        populateRecipes();

    }
    private void setSeasonality(){

        TextView name = (TextView) findViewById(R.id.seasonality);
        name.setText("Not in season :("); //insert name here
    }

    private void setName(){
        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Apple"); //insert name here

    }

    private void setImage(){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.apple);
    }

    private void populateRecipes(){
        String[] myRecipes = {"Apple Pie", "Apple Bottom Jeans"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (
            this,
            R.layout.recipetxt,
            myRecipes);

            ListView list = (ListView) findViewById(R.id.listOfRecipes);
            list.setAdapter(adapter);
    }
}

