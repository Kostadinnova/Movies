package com.example.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesRepository {

    public static List<Movie> getAllMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("It Follows","2004", "Horror","https://images-na.ssl-images-amazon.com/images/I/710pAWTpT5L._SL1500_.jpg"));
        movieList.add(new Movie("Evil Dead","2013","Horror", "https://s.s-bol.com/imgbase0/imagebase3/large/FC/0/2/8/0/9200000016500820.jpg"));
        movieList.add(new Movie("Funny Games","1997","Horror","https://m.media-amazon.com/images/M/MV5BM2ZhZDlmZDMtMDk5OC00YjhiLTgxOTAtYWEwMzhiMjJhMmEwL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg"));
        movieList.add(new Movie(" Hereditary","2018","Horror","https://m.media-amazon.com/images/M/MV5BOTU5MDg3OGItZWQ1Ny00ZGVmLTg2YTUtMzBkYzQ1YWIwZjlhXkEyXkFqcGdeQXVyNTAzMTY4MDA@._V1_.jpg"));
        movieList.add(new Movie(" Martyrs","2008","Horror","https://i.pinimg.com/originals/b7/a2/a5/b7a2a5d750cdc3eb3bfd27f3a08ff9be.jpg"));
        movieList.add(new Movie(" I Saw the Devil","2010","Horror","https://images-na.ssl-images-amazon.com/images/I/81UEsqer-sL._SL1500_.jpg"));
        movieList.add(new Movie(" The Skin I Live In ","2011","Horror","https://scdn.nflximg.net/ipl/05628/621072f1c98b7d8abb115e6b2e3b1df6e54cf268.jpg"));
        movieList.add(new Movie(" 28 Days Later...","2002","Horror","https://m.media-amazon.com/images/M/MV5BYTFkM2ViMmQtZmI5NS00MjQ2LWEyN2EtMTI1ZmNlZDU3MTZjXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX140_CR0,0,140,209_AL_.jpg"));

        movieList.add(new Movie("Shaun of the Dead", "2004","Comedy","https://static.tvgcdn.net/feed/1/40/thumbs/12134040_1200x1600.jpg"));
        movieList.add(new Movie("Old School","2003","Comedy","https://cdn3.movieweb.com/i/movie/8jS68TbRVZ9ObVo6ep9yWD4H3MA2EL/384:50/Old-School.jpg"));
        movieList.add(new Movie("White Chicks","2004", "Comedy","https://www.sodafactory.com.au/wp-content/uploads/2016/01/WhiteChicks-PosterArt.jpg"));
        movieList.add(new Movie("Juno","2007", "Comedy","https://s3-us-west-2.amazonaws.com/fsl.web/production/media/spotlight/page/poster-537fe57e-4ec1-449f-9307-bb979992d1aa.jpg"));
        movieList.add(new Movie("The Perfect Score", "2004", "Comedy","https://images-na.ssl-images-amazon.com/images/I/71jz-sIyQzL._SY445_.jpg"));
        movieList.add(new Movie("American Pie","1992","Comedy","https://m.media-amazon.com/images/M/MV5BMTg3ODY5ODI1NF5BMl5BanBnXkFtZTgwMTkxNTYxMTE@._V1_UX182_CR0,0,182,268_AL_.jpg"));
        movieList.add(new Movie("American Pie 2","2001","Comedy","https://m.media-amazon.com/images/M/MV5BOTEyYjhiMjYtNjU3YS00NmQ4LTlhNTEtYTczNWY3MGJmNzE2XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg"));
        movieList.add(new Movie(" Step Brothers","2008","Comedy","https://m.media-amazon.com/images/M/MV5BODViZDg3ZjYtMzhiYS00YTVkLTk4MzktYWUxMTlkYjc1NjdlXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UY209_CR0,0,140,209_AL_.jpg"));

        movieList.add(new Movie(" Gods of Egypt","2016","Action","https://m.media-amazon.com/images/M/MV5BNjExODg3MDUzNl5BMl5BanBnXkFtZTgwNjExMjE3NzE@._V1_.jpg"));
        movieList.add(new Movie(" Captain America: Civil War","2016","Action","https://images-na.ssl-images-amazon.com/images/I/51RYCQU%2ByxL.jpg"));
        movieList.add(new Movie("Hero","2004", "Action","https://m.media-amazon.com/images/M/MV5BMWQ2MjQ0OTctMWE1OC00NjZjLTk3ZDAtNTk3NTZiYWMxYTlmXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg"));
        movieList.add(new Movie("EQUILIBRIUM","2002","Action", "https://www.film.ru/sites/default/files/movies/posters/equilibrium.jpg"));
        movieList.add(new Movie("John Wick","2014", "Action","https://m.media-amazon.com/images/M/MV5BMTU2NjA1ODgzMF5BMl5BanBnXkFtZTgwMTM2MTI4MjE@._V1_.jpg"));
        movieList.add(new Movie("John Wick:Chapter 2","2017", "Action","https://img01.mgo-images.com/image/thumbnail/v2/content/MMV9D183EB36CDF6353B4D01D15A3BF1F70A.jpeg"));
        movieList.add(new Movie("John Wick:Parabellum","2019", "Action","https://images-na.ssl-images-amazon.com/images/I/91wc7yc2R8L._SL1500_.jpg"));
        movieList.add(new Movie(" The Family I","2013","Action","https://m.media-amazon.com/images/M/MV5BMjE2MzI0MzkyNV5BMl5BanBnXkFtZTcwMjQ2MDM2OQ@@._V1_UX140_CR0,0,140,209_AL_.jpg"));

        return movieList;
    }

}
