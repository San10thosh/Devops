import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a=10;
        int b=10;
        int c = a+b;
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
