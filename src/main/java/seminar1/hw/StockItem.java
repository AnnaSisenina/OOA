package seminar1.hw;

public class StockItem {
    private Product product;
    private Integer amount;


    public StockItem(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public boolean buyStockItem (Integer newAmount) {
        if (newAmount > amount) {
            System.out.println("Такое колличество товара недоступно для заказа. " +
                    "Доступное количество - " + amount);
            return false;
        }
        else {
            amount = amount - newAmount;
            return true;
        }
    }
}
