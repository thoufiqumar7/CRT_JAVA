import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int choice, value;
        do {
            System.out.println("\n===== QUEUE MENU =====");
            System.out.println("1. Enqueue  2. Dequeue  3.Peek  4.Display  5.Check if Empty  0.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: 
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    queue.add(value); 
                    System.out.println(value + " enqueued into queue.");
                    break;

                case 2: 
                    if (queue.isEmpty()) {
                        System.out.println("Queue Underflow! Cannot dequeue.");
                    } else {
                        System.out.println("Dequeued: " + queue.remove());
                    }
                    break;

                case 3: 
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Front element: " + queue.peek());
                    }
                    break;

                case 4:
                    System.out.println("Queue: " + queue);
                    break;

                case 5: 
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
        sc.close();
    }
}
