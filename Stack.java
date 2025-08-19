import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int choice, value;

        do {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push 2.pop  3.Peek  4.Display  5.Check if empty  0.Exit"); 
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed into stack.");
                    break;
                case 2: 
                    if (stack.isEmpty()) {
                        System.out.println("Stack Underflow! Cannot pop.");
                    } else {
                        System.out.println("Popped: " + stack.pop());
                    }
                    break;
                case 3: 
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println("Top element: " + stack.peek());
                    }
                    break;
                case 4: 
                    System.out.println("Stack: " + stack);
                    break;
                case 5: 
                    System.out.println("Is stack empty? " + stack.isEmpty());
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
