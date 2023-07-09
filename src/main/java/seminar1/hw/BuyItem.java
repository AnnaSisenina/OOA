package seminar1.hw;

public class BuyItem {
    Product product;
    Integer amount;

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
    public BuyItem(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Товар " + product +
                ", количество " + amount +
                '}';
    }
}
