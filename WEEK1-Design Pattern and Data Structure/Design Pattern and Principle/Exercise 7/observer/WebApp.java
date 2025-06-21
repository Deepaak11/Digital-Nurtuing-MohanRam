package observer;

public class WebApp implements Observer {
    private String username;

    public WebApp(String username) {
        this.username = username;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("WebApp (" + username + "): Stock price updated to $" + stockPrice);
    }
}
