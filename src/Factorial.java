import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println("Please enter a number to calculate its factorial");
      int num = input.nextInt();
      System.out.println("Factorial of " + num + " is " + factorial(num));
        EvenOdd(num);
    }
    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
    static void EvenOdd(int num){
        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
    static void EvenOdd(int num){
        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}
