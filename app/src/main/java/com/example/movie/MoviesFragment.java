package com.example.movie;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MoviesFragment extends Fragment implements ItemClickListener {

    public MoviesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movies, container, false);

        String genre = null;
        if(getArguments() != null){
            genre = getArguments().getString("GENRE");
        }


        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView_id);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        List<Movie> movies = MoviesRepository.getAllMovies();

        List<Movie> filteredMovies = new ArrayList<>();
        for (int i = 0; i<movies.size(); i++){
            Movie movie = movies.get(i);
            if(genre.equals(movie.getGenre())){
                filteredMovies.add(movie);
            }
        }


        final MoviesAdapter adapter = new MoviesAdapter(filteredMovies, getContext(), getFragmentManager());
        recyclerView.setAdapter(adapter);

        return rootView;


    }


    @Override
    public void openMovieFragment(Movie movie) {

        if (movie != null){
            Intent intent = new Intent(getContext(), InMoviesActivity.class);
            startActivity(intent);

        }
    }


}

