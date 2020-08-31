package com.example.movie;

public class Movie {
    private String name;
    private String year;
    private String genre;
    private String url;


    public Movie(String name, String year, String genre, String url) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.url = url;
    }

    public String getName() {
        return name;
    }


    public String getYear() {
        return year;
    }


    public String getGenre() {
        return genre;
    }


    public String getUrl() {
        return url;
    }


}