import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();

        System.out.print("please enter a double: ");
        double doubleInput = scanner.nextDouble();
        int sum = integerInput + (int) doubleInput;
        double product = integerInput * doubleInput;

        System.out.printf("you entered the integer: %d%n", integerInput);
        System.out.printf("you enter the double: %2f%n", doubleInput);
        System.out.printf("The sum is %d\n",sum);
        System.out.printf("Their product is: %2f\n",product);
    }
}
