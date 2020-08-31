package com.example.movie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

    private List<Movie> movies;
    private Context context;
    private FragmentManager fragmentManager;

    public MoviesAdapter(List<Movie> movies, Context context, FragmentManager fragmentManager){
        this.movies = movies;
        this.context = context;
        this.fragmentManager = fragmentManager;

    }

    private ItemClickListener listener;
    private void setListener (ItemClickListener listener){
        this.listener = listener;
    }

    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View View = inflater.inflate(R.layout.movie_items, parent , false);

        MoviesViewHolder viewHolder = new MoviesViewHolder(View);
        return viewHolder;
    }


    public void onBindViewHolder(@NonNull MoviesAdapter.MoviesViewHolder holder, int position) {
        Movie movie = movies.get(position);

        holder.tvName.setText(movie.getName());
        holder.tvYear.setText(movie.getYear());

        String uri = movie.getUrl();
        Glide.with(holder.ivImage.getContext()).load(uri).into(holder.ivImage);

    }

    @Override
    public int getItemCount() { return movies.size(); }

    public class MoviesViewHolder extends RecyclerView.ViewHolder {

        public TextView tvName;
        public TextView tvYear;
        public ImageView ivImage;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.Name);
            tvYear = itemView.findViewById(R.id.Year);
            ivImage = itemView.findViewById(R.id.moviePoster);

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {

                    ChooserDialog chooserDialog = new ChooserDialog(new ChooserDialog.DialogChoose() {
                        @Override
                        public void removeItem() {
                            movies.remove(getAdapterPosition());
                            notifyItemRemoved(getAdapterPosition());

                        }

                        @Override
                        public void addFavorites() {
                            Toast.makeText(context, "Added to favorites", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void removeFromFavorites() {
                            Toast.makeText(context, "Removed from favorites", Toast.LENGTH_SHORT).show();
                        }


                    });
                    chooserDialog.show(fragmentManager, "lll");


                    return true;
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener !=null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.openMovieFragment(movies.get(position));
                        }
                    }
                }
            });


        }
    }



}
