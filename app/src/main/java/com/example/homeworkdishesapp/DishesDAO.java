package com.example.homeworkdishesapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DishesDAO {

    //srite a query to returned all data in the table and needed to shown in the menu page
    @Query("SELECT * FROM dish_table ORDER BY id ASC")
    List<Dish> getAllDish();

    //used to isert the data in the entity
    @Insert
    void insertAll(Dish dish);

}
