package inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();


        manager.addProduct(new Product("P001", "Laptop", 10, 75000));
        manager.addProduct(new Product("P002", "Mouse", 50, 500));


        manager.updateProduct("P001", "Laptop Pro", 8, 82000);


        manager.deleteProduct("P002");


        manager.displayInventory();
    }
}
