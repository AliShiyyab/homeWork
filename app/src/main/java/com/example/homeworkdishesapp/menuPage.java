package com.example.homeworkdishesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class menuPage extends AppCompatActivity {
    //create an object of database dishes and object of the Data Access Object interfaces
    private  dishDataBase db;
    private DishesDAO dishesDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        db = Room.databaseBuilder(getApplicationContext(),
                dishDataBase.class, "dish_table").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

        //used the query to returned all data
        List<Dish> dishes = db.dishDao().getAllDish();

        RecyclerView allTasksRecuclerView = findViewById(R.id.recyclerViewMenu);
        allTasksRecuclerView.setLayoutManager(new LinearLayoutManager(this));
        allTasksRecuclerView.setAdapter(new dishAdapter(dishes));



        //this button used to sending me a home page
        Button btn3 = findViewById(R.id.homePage);
        btn3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , "Welcome Sir!" , Toast.LENGTH_LONG).show();
                Intent toMainActivity = new Intent(menuPage.this , MainActivity.class);
                startActivity(toMainActivity);
            }
        }));
    }
}