package com.alatoo.FinalProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alatoo.FinalProject.adapter.NemanCategoryAdapter;
import com.alatoo.FinalProject.adapter.PopularProductsAdapter;
import com.alatoo.FinalProject.model.NemanCategory;
import com.alatoo.FinalProject.model.PopularProducts;

import java.util.ArrayList;
import java.util.List;

public class  MainActivity extends AppCompatActivity {

    RecyclerView nemanRecycler, popularproductsRecycler;

    NemanCategoryAdapter nemanCategoryAdapter;

    PopularProductsAdapter popularProductsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayList<NemanCategory> NemanCategoryList = new ArrayList<>();

        NemanCategoryList.add(new NemanCategory("Medicines","Not available", R.drawable.medicals));
        NemanCategoryList.add(new NemanCategory("Consultation", "Not available", R.drawable.consultation));
        NemanCategoryList.add(new NemanCategory("Vitamins", "Not available", R.drawable.vitamins));
        NemanCategoryList.add(new NemanCategory("Medicines", "Not available", R.drawable.medicals));
        NemanCategoryList.add(new NemanCategory("Consultation", "Not available", R.drawable.consultation));
        NemanCategoryList.add(new NemanCategory("Vitamins", "Not available", R.drawable.vitamins));

        setCategoryRecycler(NemanCategoryList);


        List<PopularProducts> popularProductsList = new ArrayList<>();
        popularProductsList.add(new PopularProducts("Multi Vitamins", "15 types", R.drawable.multivitamins, "Yes"));
        popularProductsList.add(new PopularProducts("Capsules", "15 types", R.drawable.capsules, "No"));
        popularProductsList.add(new PopularProducts("Sputnik V", "15 types", R.drawable.covid, "No"));
        popularProductsList.add(new PopularProducts("Multi Vitamins", "15 types", R.drawable.multivitamins, "Yes"));
        popularProductsList.add(new PopularProducts("Capsules", "15 types", R.drawable.capsules, "No"));
        popularProductsList.add(new PopularProducts("Sputnik V", "15 types", R.drawable.covid, "No"));

        setProductsRecycler(popularProductsList);

    }


    private void setCategoryRecycler(List<NemanCategory> NemanCategoryList) {

        nemanRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        nemanRecycler.setLayoutManager(layoutManager);
        nemanCategoryAdapter = new NemanCategoryAdapter(this, NemanCategoryList);
        nemanRecycler.setAdapter(nemanCategoryAdapter);

    }

    private void setProductsRecycler(List<PopularProducts> popularProductsList) {

        popularproductsRecycler = findViewById(R.id.popularproducts_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        popularproductsRecycler.setLayoutManager(layoutManager);
        popularProductsAdapter = new PopularProductsAdapter(this, popularProductsList);
        popularproductsRecycler.setAdapter(popularProductsAdapter);

    }



}
