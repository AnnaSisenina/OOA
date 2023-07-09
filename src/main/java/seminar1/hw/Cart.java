package seminar1.hw;

import java.util.List;

public class Cart {
    private List<BuyItem> items;
    private User user;

    public Cart(List<BuyItem> items, User user) {
        this.items = items;
        this.user = user;
    }

     public List<BuyItem> getItems() {
        return items;
    }

    public void setItems(List<BuyItem> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addItem(Product product, Integer amount) {
        items.add(new BuyItem(product, amount));
    }

    public void printCart (){
        System.out.println("Содержимое корзины пользователя "+user.toString()+": ");
        for (BuyItem item : items) {
            System.out.println(item.toString());
        }
    }
}