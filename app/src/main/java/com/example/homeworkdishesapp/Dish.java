package com.example.homeworkdishesapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//declare and entity(Table) and git the table name dish_table
@Entity(tableName = "dish_table")
public class Dish {

    //Declare a primary key as id name and long data Type
    @PrimaryKey(autoGenerate = true)
    private long id;

    //declare column head name as a name of parameter which i named in the Dish class
    @ColumnInfo(name = "name")
    private String dishName;

    @ColumnInfo(name = "price")
    private String dishPrice;

    @ColumnInfo(name = "ingredient")
    private String ingredient;


    //constructor and getter and setter functions for all arguments
    public Dish(String name , String dishPrice, String ingredient) {
        this.dishName = name;
        this.dishPrice = dishPrice;
        this.ingredient = ingredient;
    }

    public Dish(){}

    public void setId(long id) {
        this.id = id;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getDishPrice() {
        return dishPrice;
    }

    public long getId() {
        return id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishPrice(String dishPrice) {
        this.dishPrice = dishPrice;
    }
}
