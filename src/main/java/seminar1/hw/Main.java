package seminar1.hw;

/* Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
        3)Создать класс Basket, содержащий массив купленных товаров.
        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
        5)Вывести на консоль каталог продуктов. (все продукты магазина)
        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создаю категории
        Category cosmetics = new Category("Косметика");
        Category food = new Category("Продукты");
        List<Category>categories = new ArrayList<>();
        categories.add(cosmetics);
        categories.add(food);

        //Создаю продукты
        Shampoo shampoo = new Shampoo("Шампунь Ellseve", 150, 8, cosmetics);
        ShowerGel showerGel = new ShowerGel("Гель для душа Palmolive", 100, 7, cosmetics);
        Milk milk = new Milk("Молоко Домик в деревне", 80, 9, food);
        Water water = new Water("Вода Святой источник", 20, 6,  food);

        //Создаю складские позиции магазина, добавляю туда продукты и их кол-во
        StockItem first = new StockItem(shampoo, 15);
        StockItem second = new StockItem(showerGel, 11);
        StockItem third = new StockItem(milk, 20);
        StockItem fourth = new StockItem(water, 30);

        // Создаю запасы магазина
        List<StockItem> stock = new ArrayList<>();
        stock.add(first);
        stock.add(second);
        stock.add(third);
        stock.add(fourth);
        Stock shopStock = new Stock(stock);

        //создание нового пользователя
        User ivan = new User("Ivan", new char[]{'1', '2', '3', '4'});
        List<BuyItem> buyItems = new ArrayList<>();
        //создание корзины пользователя
        Cart ivanCart = new Cart(buyItems, ivan);
        //создание перечня корзин магазина
        List <Cart> carts = new ArrayList<>();
        carts.add(ivanCart);
        //создание магазина
        Shop x5 = new Shop("Пятерочка", shopStock, carts, categories);
        x5.printShopCatalog();
        System.out.println();
        x5.buy(ivanCart, shampoo, 4);
        System.out.println();
        x5.printShopCatalog();
        System.out.println();
        ivanCart.printCart();

    }
}
