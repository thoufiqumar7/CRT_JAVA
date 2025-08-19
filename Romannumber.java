import java.util.Scanner;

public class Romannumber {
    public static int valueOf(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.next().toUpperCase();
        int total = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = valueOf(roman.charAt(i));
            if (current == -1) {
                System.out.println("Invalid Roman numeral character.");
                return; t
            }
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }
        System.out.println("The integer value of " + roman + " is " + total);
    }
}
