package observer;

public class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp (" + user + "): Stock price updated to $" + stockPrice);
    }
}
