import java.util.Arrays;
import java.util.Scanner;

public class NumericArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        double[] numbers = new double[size];

        // Input array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(numbers);

        // Calculate sum and average
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / size;

        // Output the results
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close(); // Close the scanner
    }
}
