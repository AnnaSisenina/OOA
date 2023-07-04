package seminar1.hw;

import java.util.HashMap;

public class Basket {

    private User user;
    private HashMap<Product, Integer> productsInCart;

    public Basket(User user, HashMap<Product, Integer> productsInCart) {
        this.user = user;
        this.productsInCart = productsInCart;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public HashMap<Product, Integer> getProductsInCart() {
        return productsInCart;
    }

    public void setProductsInCart(HashMap<Product, Integer> productsInCart) {
        this.productsInCart = productsInCart;
    }

    public void addToCart (Product newProduct, Integer amount, Shop shop, Category category) {
        productsInCart.put(newProduct, amount);
        category.deleteProduct(newProduct, amount);
    }
}