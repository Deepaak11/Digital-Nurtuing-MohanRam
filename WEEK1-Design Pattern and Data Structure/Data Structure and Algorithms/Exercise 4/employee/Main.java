package employee;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);


        manager.addEmployee(new Employee(101, "Mohan", "Manager", 70000));
        manager.addEmployee(new Employee(102, "Ram", "Developer", 50000));
        manager.addEmployee(new Employee(103, "Ragul", "Designer", 45000));


        manager.displayEmployees();


        Employee found = manager.searchEmployee(102);
        System.out.println("\nSearch Result: " + (found != null ? found : "Not found"));


        manager.deleteEmployee(102);


        manager.displayEmployees();
    }
}
