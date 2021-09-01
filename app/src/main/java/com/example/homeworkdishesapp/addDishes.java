package com.example.homeworkdishesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addDishes extends AppCompatActivity {
    private DishesDAO dishesDAO;
    private dishDataBase dataBase;
    private EditText name;
    private EditText price;
    private EditText ingredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dishes);

        name = findViewById(R.id.input1);
        price = findViewById(R.id.input2);
        ingredient = findViewById(R.id.input3);

        Button submitted = findViewById(R.id.submit);

        dataBase = Room.databaseBuilder(this , dishDataBase.class , "dish_table")
                .allowMainThreadQueries().build();
        dishesDAO = dataBase.dishDao();

        submitted.setOnClickListener(View -> {
            Toast toast = Toast.makeText(addDishes.this , "Task has been added" , Toast.LENGTH_LONG);
            toast.show();
            dishesDAO.insertAll(new Dish(name.getText().toString() ,
                    price.getText().toString(), ingredient.getText().toString()
            ));
        });

    }

}