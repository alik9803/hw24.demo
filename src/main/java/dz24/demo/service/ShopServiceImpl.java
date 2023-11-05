package dz24.demo.service;

import dz24.demo.cart.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    private final ShoppingCart shoppingCart;

    public ShopServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    @Override
    public void addItemToCart(List<Integer> itemID) {
        for (Integer itemIDs : itemID) {
            shoppingCart.addItemToCart(itemIDs);
        }
        shoppingCart.initMethod();
    }

    @Override
    public List<Integer> getCart() {
        return this.shoppingCart.getItemID();
    }

}