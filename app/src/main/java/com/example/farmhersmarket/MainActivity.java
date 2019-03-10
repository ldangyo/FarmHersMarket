package com.example.farmhersmarket;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Integer images[] = {
            R.drawable.apple,
            R.drawable.cranberries,
            R.drawable.garlic
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.apple);
        imageView = (ImageView) findViewById(R.id.imageView4);
        imageView.setImageResource(R.drawable.apple);
        imageView = (ImageView) findViewById(R.id.imageView5);
        imageView.setImageResource(R.drawable.apple);
        imageView = (ImageView) findViewById(R.id.RecipePic);
        imageView.setImageResource(R.drawable.recipe);
        imageView = (ImageView) findViewById(R.id.IngriPic);
        imageView.setImageResource(R.drawable.food);


    }

    public void goToFood(View v){
        startActivity(new Intent(this, Ingredients.class));
    }

}
