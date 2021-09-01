package com.example.homeworkdishesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class dishAdapter extends RecyclerView.Adapter<dishAdapter.ViewHolder> {

    private List<Dish> dish;

    public dishAdapter(List<Dish> dish){
        this.dish=dish;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public Dish dishes;
        View itemView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            this.itemView = itemView;
        }
    }

    @NonNull
    @Override
    public dishAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_fragment_dishes , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dishAdapter.ViewHolder holder, int position) {
        holder.dishes = dish.get(position);

        TextView name = holder.itemView.findViewById(R.id.input1);
        TextView price = holder.itemView.findViewById(R.id.input2);
        TextView ingredient = holder.itemView.findViewById(R.id.input3);

        name.setText(holder.dishes.getDishName());
        price.setText(holder.dishes.getDishPrice());
        ingredient.setText(holder.dishes.getIngredient());
    }

    @Override
    public int getItemCount() {
        return this.dish.size();
    }
}
