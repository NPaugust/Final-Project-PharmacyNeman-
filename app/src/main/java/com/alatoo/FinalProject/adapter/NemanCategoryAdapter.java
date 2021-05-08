package com.alatoo.FinalProject.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alatoo.FinalProject.DetailsActivity;
import com.alatoo.FinalProject.R;
import com.alatoo.FinalProject.model.NemanCategory;

import java.util.List;


public class NemanCategoryAdapter extends RecyclerView.Adapter<NemanCategoryAdapter.NemanCategoryViewHolder> {

    Context context;
    List<NemanCategory> nemanCategoryList;



    public NemanCategoryAdapter(Context context, List<NemanCategory> nemanCategoryList) {
        this.context = context;
        this.nemanCategoryList = nemanCategoryList;
    }

    @NonNull
    @Override
    public NemanCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.medicines_item, parent, false);
        return new NemanCategoryViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull NemanCategoryViewHolder holder, int position) {

        holder.capsules.setImageResource(nemanCategoryList.get(position).getImageUrl());
        holder.name.setText(nemanCategoryList.get(position).getName());
        holder.kolvo.setText(nemanCategoryList.get(position).getKolvo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return nemanCategoryList.size();
    }


    public static final class NemanCategoryViewHolder extends RecyclerView.ViewHolder{


        ImageView capsules;
        TextView kolvo, name;

        public NemanCategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            capsules = itemView.findViewById(R.id.capsules);
            kolvo = itemView.findViewById(R.id.kolvo);
            name = itemView.findViewById(R.id.name);



        }
    }

}