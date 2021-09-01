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

    private dishAdapter adapter;
    private  dishDataBase db;
    private DishesDAO dishesDAO;
    private List<Dish> dishes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        db = Room.databaseBuilder(getApplicationContext(),
                dishDataBase.class, "dish_table").allowMainThreadQueries().build();

        dishesDAO = db.dishDao();
        dishes = dishesDAO.getAllDish();



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        RecyclerView allTasksRecuclerView = findViewById(R.id.recyclerViewMenu);
        allTasksRecuclerView.setAdapter(adapter);
        allTasksRecuclerView.setLayoutManager(linearLayoutManager);



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