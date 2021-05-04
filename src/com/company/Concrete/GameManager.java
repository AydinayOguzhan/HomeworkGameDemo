package com.company.Concrete;

import com.company.Abstract.GameService;
import com.company.Entities.Discount;
import com.company.Entities.Game;
import com.company.Entities.User;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService {
    @Override
    public void sell(User user, Game... games) {
        List<Integer> gameIds = new ArrayList<Integer>();
        System.out.println("Satın alım işlemi başarılı. Kullanıcı aşağıdaki oyunlara sahiptir:");
        for (int i = 0; i <= games.length -1 ; i++){
            gameIds.add(games[i].getId());
            user.setGameIds(gameIds);
            System.out.println(gameIds.get(i));
        }
    }

    @Override
    public void add(Game game) {
        System.out.println("Oyun sisteme eklendi : " + game.getName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun güncellendi : " + game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi : " + game.getName());
    }

    @Override
    public void addDiscountToGame(Discount discount, Game game) {
        System.out.println("İndirim oyuna eklendi");
    }

    @Override
    public void removeDiscountFromGame(Discount discount, Game game) {
        System.out.println("İndirim oyundan kaldırıldı");
    }
}
