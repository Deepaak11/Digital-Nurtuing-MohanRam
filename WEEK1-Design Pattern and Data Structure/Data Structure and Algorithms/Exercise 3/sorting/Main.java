package sorting;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O001", "Kavi", 350.50),
                new Order("O002", "Priya", 1250.00),
                new Order("O003", "Ragul", 890.75),
                new Order("O004", "Saravanan", 120.00),
        };


        Order[] ordersBubble = orders.clone();
        Order[] ordersQuick = orders.clone();

        System.out.println("=== Original Orders ===");
        printOrders(orders);

        // Bubble Sort
        SortUtils.bubbleSort(ordersBubble);
        System.out.println("\n=== Bubble Sort Result ===");
        printOrders(ordersBubble);

        // Quick Sort
        SortUtils.quickSort(ordersQuick, 0, ordersQuick.length - 1);
        System.out.println("\n=== Quick Sort Result ===");
        printOrders(ordersQuick);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

