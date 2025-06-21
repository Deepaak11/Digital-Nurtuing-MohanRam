package task;

public class TaskManager {

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    // Add task at end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        System.out.println("Added: " + task);
    }

    // Search task by ID
    public Task searchTask(int taskId) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.getTaskId() == taskId) {
                return curr.task;
            }
            curr = curr.next;
        }
        return null;
    }


    public void displayTasks() {
        Node curr = head;
        System.out.println("\n--- Task List ---");
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            System.out.println("Deleted: " + head.task);
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.task.getTaskId() != taskId) {
            curr = curr.next;
        }

        if (curr.next != null) {
            System.out.println("Deleted: " + curr.next.task);
            curr.next = curr.next.next;
        } else {
            System.out.println("Task ID not found.");
        }
    }
}
