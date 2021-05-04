package com.company.Abstract;

import com.company.Entities.Game;
import com.company.Entities.Genre;

public interface GenreService {
    void add(Genre genre);
    void update(Genre genre);
    void delete(Genre genre);
}
