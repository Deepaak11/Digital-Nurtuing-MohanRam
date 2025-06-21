package Ecommerce;


public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(205, "T-Shirt", "Clothing"),
                new Product(309, "Book", "Stationery"),
                new Product(150, "Mobile", "Electronics"),
                new Product(410, "Shoes", "Footwear")
        };

        System.out.println(" Linear Search:");
        Product foundLinear = SearchUtil.linearSearch(products, 205);
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        System.out.println("\n Binary Search:");
        SearchUtil.sortProductsById(products); // Important step before binary search
        Product foundBinary = SearchUtil.binarySearch(products, 205);
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}
