package com.example.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFragment extends Fragment implements ItemClickListener {


    public FavoriteFragment() {
    }

    List<Movie> favoriteMovies = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);


        RecyclerView recyclerView = rootView.findViewById(R.id.favoriteRecyclerView);
        GridLayoutManager glmenager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(glmenager);



        favoriteMovies.add(new Movie("John Wick:Parabellum","2019", "Action","https://images-na.ssl-images-amazon.com/images/I/91wc7yc2R8L._SL1500_.jpg"));


        final MoviesAdapter favoriteadapter = new MoviesAdapter(favoriteMovies, getContext(), getFragmentManager());
        recyclerView.setAdapter(favoriteadapter);

        return rootView;


    }

    @Override
    public void openMovieFragment(Movie movie) {

        if (movie != null) {
            InMoviesFragment inMV = new InMoviesFragment();
            Bundle bundle = new Bundle();
            bundle.putString("MOVIE_NAME", movie.getName());
            bundle.putString("MOVIE_YEAR", movie.getYear());
            inMV.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frameLayout, inMV)
                        .addToBackStack("inMV")
                        .commit();
            }
        }
    }
}


