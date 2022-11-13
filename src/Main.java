import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK 1:");
        char[] c = new char[10];
        for (int i=0; i<5; i++) c[i] = (char)(65+i);
        System.out.println(c);

        System.out.println("TASK 2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[arraySize];
        System.out.println("Fill in the array");
        int max = -9999, min = 9999, maxCount = 1, minCount = 1;
        for (int i = 0; i < arraySize; i++){
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
            if (numbers[i] == max)
                maxCount++;
            else if (numbers[i] > max) {
                max = numbers[i];
                maxCount = 1;
            }
            if (numbers[i] == min)
                minCount++;
            else if (numbers[i] < min) {
                min = numbers[i];
                minCount = 1;
            }
        }
        System.out.println("Array: ");
        System.out.println("\t" + Arrays.toString(numbers));
        System.out.println("Max:");
        System.out.println("\t" + "Number: " + max);
        System.out.println("\t" + "Count: " + maxCount);
        System.out.println("Min:");
        System.out.println("\t" + "Number: " + min);
        System.out.println("\t" + "Count: " + minCount);

        System.out.println("TASK 3");
        System.out.print("Enter array size: ");
        int coordsArraySize = scanner.nextInt();
        scanner.nextLine();
        int[] xCoords = new int[coordsArraySize];
        int[] yCoords = new int[coordsArraySize];
        System.out.println("Fill in the coordinates");
        for (int i = 0; i < coordsArraySize; i++)
            yCoords[i] = -yCoords[i];
        for (int i = 0; i < coordsArraySize; i++){
            System.out.print("X: ");
            xCoords[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Y: ");
            yCoords[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("-------------------------");
        }
        System.out.println("Coords before flipping:");
        for (int i = 0; i < coordsArraySize; i++)
            System.out.print("(" + xCoords[i] + ";" + yCoords[i] + "), ");
        System.out.println("");
        for (int i = 0; i < coordsArraySize; i++)
            yCoords[i] = -yCoords[i];
        System.out.println("Coords after flipping:");
        for (int i = 0; i < coordsArraySize; i++)
            System.out.print("(" + xCoords[i] + ";" + yCoords[i] + "), ");
    }
}