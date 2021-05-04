package com.company.Concrete;

import com.company.Abstract.DiscountService;
import com.company.Entities.Discount;
import com.company.Entities.Game;

public class DiscountManager implements DiscountService {
    @Override
    public void add(Discount discount) {
        System.out.println(discount.getName() + " isimli indirim sisteme tanımlanmıştır");
    }

    @Override
    public void update(Discount discount) {
        System.out.println(discount.getName() + " isimli indirim güncellenmiştir");
    }

    @Override
    public void delete(Discount discount) {
        System.out.println(discount.getName() + " isimli indirim silinmiştir");
    }

}
