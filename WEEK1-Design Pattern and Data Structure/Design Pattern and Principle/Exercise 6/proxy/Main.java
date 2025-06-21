package proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("landscape.jpg");

        System.out.println(">> First call to display:");
        image1.display();
        System.out.println("\n>> Second call to display:");
        image1.display();
    }
}
