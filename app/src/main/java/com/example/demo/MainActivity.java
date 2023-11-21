package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.demo.Adaptor.CategoryAdaptor;
import com.example.demo.Adaptor.PopularAdaptor;
import com.example.demo.Domain.CategoryDomain;
import com.example.demo.Domain.FoodDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        //recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> Category=new ArrayList<>();
        Category.add(new CategoryDomain("Birthday","cat_1"));
        Category.add(new CategoryDomain("Anniversory","cat_2"));
        Category.add(new CategoryDomain("Regular","cat_3"));
        Category.add(new CategoryDomain("Photo","cat_4"));
        Category.add(new CategoryDomain("Designer","cat_5"));

        adapter=new CategoryAdaptor(Category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

//    private void recyclerViewPopular(){
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerViewPopularList=findViewById(R.id.recyclerView2);
//        recyclerViewPopularList.setLayoutManager(linearLayoutManager);
//
//        ArrayList<FoodDomain> foodList=new ArrayList<>();
//        foodList.add(new FoodDomain("majithiya","cake_dp","kem che,majama ne,hu to thik chu taem bolo",96));
//
//
//        adapter2 =new PopularAdaptor(foodList);
//        recyclerViewPopularList.setAdapter(adapter2);
//    }
}
