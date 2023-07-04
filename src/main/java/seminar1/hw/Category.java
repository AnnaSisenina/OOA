package seminar1.hw;

import java.util.HashMap;
import java.util.Map;

public class Category {
    private String name;
    private HashMap<Product, Integer> products;

    public Category(String name, HashMap<Product, Integer> products) {
        this.name = name;
        this.products = products;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public void printCategory (){
        System.out.println("Название категории: " + this.name);
        for (Map.Entry<Product, Integer> productIntegerEntry : products.entrySet()) {
            System.out.println(productIntegerEntry.getKey().toString());
            System.out.println("Количество: "+ productIntegerEntry.getValue());
        }
    }
    public void deleteProduct (Product product, Integer amount) {
        if (products.containsKey(product)) {
            int newAmount = products.get(product)-amount;
            if (newAmount < 0 )
                System.out.println("Такое колличество товара недоступно для заказа. " +
                        "Доступное количество - "+products.get(product));
            else
            products.put(product, newAmount);
        }
    }

}
