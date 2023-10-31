package dz24.demo.service;

import java.util.List;

public interface ShopService {
    void addItemToCart(List<Integer> itemID);

    List<Integer> getCart();
}