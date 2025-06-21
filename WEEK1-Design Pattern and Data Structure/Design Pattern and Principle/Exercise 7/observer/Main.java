package observer;

public class Main {
    public static void main(String[] args) {

        StockMarket market = new StockMarket();


        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");


        market.registerObserver(mobileUser);
        market.registerObserver(webUser);


        market.setStockPrice(100.5);
        market.setStockPrice(104.0);


        market.removeObserver(mobileUser);
        market.setStockPrice(98.75);
    }
}
