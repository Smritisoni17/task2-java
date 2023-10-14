import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Changed from 'nextline' to 'nextLine'

            switch (choice) {

                case 1:
                    System.out.print("Enter the task: "); // Added a space after "Enter"
                    String task = scanner.nextLine();
                    addTask(tasks, task);
                    break;

                case 2:
                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = scanner.nextInt(); // Changed 'tasknumber' to 'taskNumber'
                    scanner.nextLine(); // Consume the newline character
                    removeTask(tasks, taskNumber);
                    break;

                case 3:
                    listTasks(tasks);
                    break;

                case 4:
                    System.out.println("Exiting the to-do list application.");
                    scanner.close(); // Changed from 'closed' to 'close'
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void addTask(ArrayList<String> tasks, String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public static void removeTask(ArrayList<String> tasks, int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            String removedTask = tasks.remove(taskNumber - 1);
            System.out.println("Removed Task: " + removedTask);
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    public static void listTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("--- Tasks ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
