package com.company.Abstract;

import com.company.Entities.Discount;
import com.company.Entities.Game;

public interface DiscountService {
    void add(Discount discount);
    void update(Discount discount);
    void delete(Discount discount);

}
