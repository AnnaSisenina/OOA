package seminar1.hw;

import java.util.HashSet;

public class Shop {
    private String shopName;
    HashSet<Category> shopCatalog;


    public Shop(String shopName, HashSet<Category> shopCatalog) {
        this.shopName = shopName;
        this.shopCatalog = shopCatalog;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public HashSet<Category> getShopCatalog() {
        return shopCatalog;
    }

    public void setShopCatalog(HashSet<Category> shopCatalog) {
        this.shopCatalog = shopCatalog;
    }

    public void printShopCatalog () {
        System.out.println("Наименование магазина: " + shopName);
        for (Category category : shopCatalog) {
            category.printCategory();
        }
    }

    public void deleteProductFromCatalog (Category category, Product product, Integer amount) {
        if (shopCatalog.contains(category)) {
            category.deleteProduct(product, amount);
        }
        else {
            System.out.println("Товар не найден");
        }
    }
}