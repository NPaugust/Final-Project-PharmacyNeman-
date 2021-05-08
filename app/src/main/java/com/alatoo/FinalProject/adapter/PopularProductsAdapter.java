package com.alatoo.FinalProject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alatoo.FinalProject.R;
import com.alatoo.FinalProject.model.PopularProducts;

import java.util.List;


public class PopularProductsAdapter extends RecyclerView.Adapter<PopularProductsAdapter.PopularProductsViewHolder> {

    Context context;
    List<PopularProducts> popularProductsList;



    public PopularProductsAdapter(Context context, List<PopularProducts> popularProductsList) {
        this.context = context;
        this.popularProductsList = popularProductsList;
    }

    @NonNull
    @Override
    public PopularProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate
                (R.layout.capsules_item, parent, false);
        return new PopularProductsViewHolder(view);
    }




    @Override
    public void onBindViewHolder( PopularProductsViewHolder holder, int position) {

        holder.capsules.setImageResource(popularProductsList.get(position).getImageUrl());
        holder.name.setText(popularProductsList.get(position).getName());

        holder.orangetext.setImageResource(popularProductsList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return popularProductsList.size();
    }


    public static final class PopularProductsViewHolder extends RecyclerView.ViewHolder{


        ImageView capsules,orangetext,available;
        TextView kolvo, name;

        public PopularProductsViewHolder(@NonNull View itemView) {
            super(itemView);
            capsules = itemView.findViewById(R.id.capsules);
            kolvo = itemView.findViewById(R.id.kolvo);
            name = itemView.findViewById(R.id.name);
            available = itemView.findViewById(R.id.available);
            orangetext = itemView.findViewById(R.id.orangetext);
        }
    }

}
