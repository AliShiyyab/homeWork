package com.example.homeworkdishesapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Dish.class}, version = 1)
public abstract class dishDataBase extends RoomDatabase {
    private static final String DB_NAME = "dish_db";
    private static dishDataBase instance;

    public static synchronized dishDataBase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), dishDataBase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
    public abstract DishesDAO dishDao();
}
