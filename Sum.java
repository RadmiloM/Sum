import java.util.Arrays;
import java.util.Scanner;

public class Sum {

    public static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        System.out.println("program starts");
    }

    public static void sumOfTwoNumbers(int first, int second) {
        int result = first + second;
        System.out.printf("Sum of two numbers is %d\n", result);
    }

    public static int sum(){
        System.out.println("How many numbers you wish to be in array? ");
        int numbers = scanner.nextInt();
        int[] array = new int[numbers];
        System.out.printf("you just picked %d numbers\n",numbers);
        for(int i= 0; i< array.length;i++){
            System.out.println("enter number: ");
            array[i] = scanner.nextInt();
        }
        return Arrays.stream(array).sum();
    }

    public static void end() {
        System.out.println("end of the program");
    }

    public static void main(String[] args) {
        start();
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        sumOfTwoNumbers(firstNumber,secondNumber);
        System.out.println(sum());
        end();
    }
}
