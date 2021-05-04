package com.company.Abstract;

import com.company.Entities.Discount;
import com.company.Entities.Game;
import com.company.Entities.User;

public interface GameService {
    void sell(User user, Game... games);
    void add(Game game);
    void update(Game game);
    void delete(Game game);
    void addDiscountToGame(Discount discount, Game game);
    void removeDiscountFromGame(Discount discount, Game game);
}
