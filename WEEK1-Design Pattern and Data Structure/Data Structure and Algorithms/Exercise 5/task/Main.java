package task;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();


        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Write Backend", "In Progress"));
        manager.addTask(new Task(3, "Test Application", "Pending"));


        manager.displayTasks();


        Task found = manager.searchTask(2);
        System.out.println("\nSearch Result: " + (found != null ? found : "Not Found"));


        manager.deleteTask(2);
        manager.displayTasks();
    }
}
