package seminar1.hw;
/* Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        5)Вывести на консоль каталог продуктов. (все продукты магазина)
        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре */

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int rate;
    private Category category;

    public Product(String name, int price, int rate, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        if (rate > 10) {
            this.rate = 10;
        }
        else
        this.rate = rate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Продукт{" +
                "Наименование: " + name  +
                ", Цена: " + price +
                ", Рейтинг: " + rate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && rate == product.rate && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rate);
    }
}
