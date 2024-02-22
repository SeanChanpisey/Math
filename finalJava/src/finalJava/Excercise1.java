package finalJava;
import java.util.Scanner;
public class Excercise1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10]; 
        int count = 0;

        System.out.println("Enter numbers (enter 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                // Expand array if needed
                if (count == numbers.length) {
                    int[] expandedNumbers = new int[numbers.length * 2];
                    System.arraycopy(numbers, 0, expandedNumbers, 0, numbers.length);
                    numbers = expandedNumbers;
                }

                numbers[count++] = number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done'.");
            }
        }

        
        System.out.println("\nInput numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
}
	}
}
