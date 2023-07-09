package seminar1.hw;

import java.util.List;

public class Stock {
    private List<StockItem> stock;

    public Stock(List<StockItem> stock) {
        this.stock = stock;
    }


    public List<StockItem> getStock() {
        return stock;
    }

    public void setStock(List<StockItem> stock) {
        this.stock = stock;
    }

    public boolean buyFromStock (Product product, Integer amount) {
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getProduct().equals(product)){
                if (stock.get(i).buyStockItem(amount)) return true;
            }
        }
        return false;
    }
    public void printStock () {
        for (StockItem stockItem : stock) {
            System.out.println(stockItem.getProduct().toString() +" "+stockItem.getAmount());
        }
    }
}
