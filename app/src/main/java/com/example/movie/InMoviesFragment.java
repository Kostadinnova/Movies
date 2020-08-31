package com.example.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class InMoviesFragment extends Fragment {

    public InMoviesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_in_movies, container, false);

        TextView inMovieName = rootView.findViewById(R.id.inName);
        String name = getArguments().getString("MOVIE_NAME");
        inMovieName.setText(name);

        TextView inMovieYear = rootView.findViewById(R.id.inYear);
        String year = getArguments().getString("MOVIE_YEAR");
        inMovieYear.setText(year);



        return rootView;
    }

}

