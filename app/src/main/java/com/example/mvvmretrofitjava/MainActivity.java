package com.example.mvvmretrofitjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.mvvmretrofitjava.adapter.MovieListAdapter;
import com.example.mvvmretrofitjava.model.MovieModel;
import com.example.mvvmretrofitjava.viewmodel.MovieListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MovieModel> movieModelList;
    private MovieListAdapter adapter;
    private MovieListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        adapter =  new MovieListAdapter(this, movieModelList);
        recyclerView.setAdapter(adapter);

        viewModel = ViewModelProviders.of(this).get(MovieListViewModel.class);
    }
}