package singleton;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();


        logger1.log("1st log message");
        logger2.log("2nd log message");


        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton works!");
        } else {
            System.out.println("Different logger instances. Singleton failed!");
        }
    }
}
