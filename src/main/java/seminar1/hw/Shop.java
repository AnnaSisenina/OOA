package seminar1.hw;

import java.util.List;

public class Shop {
    private String shopName;
    private Stock stock;
    private List<Cart> carts;
    private List<Category> categories;

    public Shop(String shopName, Stock stock, List<Cart> carts, List<Category> categories) {
        this.shopName = shopName;
        this.stock = stock;
        this.carts = carts;
        this.categories = categories;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
    public void printShopCatalog () {
        System.out.println("Наименование магазина: " + shopName);

        for (Category category : categories) {
            System.out.println(category.toString());
            for (StockItem stockItem : getStock().getStock()) {
                if (stockItem.getProduct().getCategory().equals(category)){
                    System.out.println(stockItem.getProduct().toString() +" "+stockItem.getAmount());
                }
            }
        }
    }
    public void buy (Cart cart, Product product, Integer amount) {
        if (stock.buyFromStock(product, amount))
            cart.addItem(product, amount);;
    }
}
