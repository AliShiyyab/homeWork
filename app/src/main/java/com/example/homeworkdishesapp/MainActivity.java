package com.example.homeworkdishesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an object of Button to get button using ID
        Button btn1 = findViewById(R.id.addDish);
        Button btn2 = findViewById(R.id.menu);

        //setOnClickListner function
        btn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , "To add Dishes page!" , Toast.LENGTH_LONG).show();
                Intent toAddDish = new Intent(MainActivity.this , addDishes.class);
                startActivity(toAddDish);
            }
        }));

        btn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , "To the Menu page!" , Toast.LENGTH_LONG).show();
                Intent toMenu = new Intent(MainActivity.this , menuPage.class);
                startActivity(toMenu);
            }
        }));
    }
}