package com.example.homeworkdishesapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DishesDAO {

    @Query("SELECT * FROM dish_table ORDER BY id ASC")
    List<Dish> getAllDish();

    @Insert
    void insertAll(Dish dish);

}
