import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();

        System.out.print("please enter a double: ");
        double doubleInput = scanner.nextDouble();

        System.out.printf("you entered the integer: %d%n", integerInput);
        System.out.printf("you enter the double: %2f%n", doubleInput);
    }
}
