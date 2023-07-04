package seminar1.hw;

/* Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
        3)Создать класс Basket, содержащий массив купленных товаров.
        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
        5)Вывести на консоль каталог продуктов. (все продукты магазина)
        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре */

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Product shampoo = new Product("Шампунь", 150, 8);
        Product showerGel = new Product("Гель для душа", 100, 7);
        Product soap = new Product("Жидкое мыло", 50, 6);

        Product milk = new Product("Молоко", 80, 9);
        Product water = new Product("Вода", 20, 6);
        Product cheese = new Product("Сыр", 170, 12);

        HashMap<Product, Integer> categoryCosmetics = new HashMap<>();
        categoryCosmetics.put(shampoo, 12);
        categoryCosmetics.put(showerGel, 7);
        categoryCosmetics.put(soap, 5);
        Category cosmetics = new Category("cosmetics", categoryCosmetics);

        HashMap<Product, Integer> categoryFood = new HashMap<>();
        categoryFood.put(milk, 20);
        categoryFood.put(water, 30);
        categoryFood.put(cheese, 10);
        Category food = new Category( "food", categoryFood);

        HashSet<Category> x5Catalog = new HashSet<>();
        x5Catalog.add(food);
        x5Catalog.add(cosmetics);

        Shop x5 = new Shop("Пятерочка",x5Catalog);
        x5.printShopCatalog();

        x5.deleteProductFromCatalog(food, milk, 2);
        x5.printShopCatalog();

        User ivan = new User("Ivan", new char[]{'1', '2', '3', '4'});
        HashMap<Product, Integer> ivanWantsToBuy = new HashMap<>();
        Basket ivansBasket = new Basket(ivan, ivanWantsToBuy);
        ivansBasket.addToCart(milk, 20, x5, food);
        x5.printShopCatalog();


    }
}
