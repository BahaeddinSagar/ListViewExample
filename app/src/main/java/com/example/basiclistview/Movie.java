package com.example.basiclistview;

public class Movie {

    String title;
    String description;
    String imageURL;
    String releaseYear;

    public Movie(String title, String description, String releaseYear) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    public Movie(String title, String description, String imageURL, String releaseYear) {
        this.title = title;
        this.description = description;
        this.imageURL = imageURL;
        this.releaseYear = releaseYear;
    }
}
