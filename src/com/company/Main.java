package com.company;


import com.company.Abstract.DiscountService;
import com.company.Abstract.GameService;
import com.company.Abstract.GenreService;
import com.company.Abstract.UserService;
import com.company.Concrete.*;
import com.company.Entities.Discount;
import com.company.Entities.Game;
import com.company.Entities.Genre;
import com.company.Entities.User;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        User user = CreateUser();
        Discount discount = CreateDiscount();
        Game game = CreateGame();
        Game game2 = CreateSecondGame();
        Genre genre = CreateGenre();

        UserService userService = new UserManager(new CheckIfPersonManager());
        userService.add(user);

        DiscountService discountService = new DiscountManager();
        discountService.add(discount);

        GenreService genreService = new GenreManager();
        genreService.add(genre);

        GameService gameService = new GameManager();
        gameService.add(game);
        gameService.addDiscountToGame(discount,game);
        gameService.sell(user,game,game2);
    }

    private static Genre CreateGenre() {
        Genre genre = new Genre();
        genre.setId(1);
        genre.setGenreName("Action");
        return genre;
    }

    private static Game CreateGame() {
        Game game = new Game();
        game.setId(1);
        game.setName("Oyun 1");
        game.setDiscountId(1);
        game.setGenreId(1);
        game.setUnitPrice(250);
        return game;
    }

    private static Game CreateSecondGame() {
        Game game = new Game();
        game.setId(2);
        game.setName("Oyun 2");
        game.setGenreId(1);
        game.setUnitPrice(150);
        return game;
    }

    private static Discount CreateDiscount() {
        Discount discount = new Discount();
        discount.setId(1);
        discount.setName("Özel yaz indirimi");
        discount.setDiscountRate(10.5);
        return discount;
    }

    private static User CreateUser() {
        User user = new User();
        user.setId(1);
        user.setUserName("OguzhanAydinay");
        user.setFirstName("Oğuzhan");
        user.setLastName("Aydınay");
        user.setDateOfBirth(new Date(1999, Calendar.APRIL,23));
        user.setNationalityId("18434224487");
        return user;
    }
}
