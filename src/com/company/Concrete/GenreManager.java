package com.company.Concrete;

import com.company.Abstract.GenreService;
import com.company.Entities.Genre;

public class GenreManager implements GenreService {
    @Override
    public void add(Genre genre) {
        System.out.println("Genre sisteme eklendi : " + genre.getGenreName());
    }

    @Override
    public void update(Genre genre) {
        System.out.println("Genre güncellendi : " + genre.getGenreName());
    }

    @Override
    public void delete(Genre genre) {
        System.out.println("Genre silindi : " + genre.getGenreName());
    }
}
