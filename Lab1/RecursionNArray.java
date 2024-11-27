// this is Lab1 Recursion and Array

// import java.util.Scanner;

public class RecursionNArray {
 
    // Recursion part 
    public static int subsum(int n){
        if (n == 1) 
            return 1;
        return (int) Math.pow(-1, n+1) * n + subsum(n - 1);
    }

    public static int sumDigit(int num){
        if (num == 0)
            return 0;
        
        return (int) num % 10 + sumDigit((num/10));
    }

    public static int sumEven(int n){
        if (n == 1)
            return 0;
        else if ((n%2) == 0)
            return (int) n + sumEven(n-1);
        else
            return sumEven(n-1);     
    }

    public static void main(String[] args) {
        // Exercise 1 
        System.out.println("Testing Subsum method");
        System.out.println(("-").repeat(20));

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your number: ");
        // int input = scanner.nextInt();
        // System.out.println("wow!: " + subsum(input));
        System.out.println("This is your Result");
        System.out.println(subsum(10));
        System.out.println(("-").repeat(20));

        //Exercise 2
        System.out.println("Testing SumDigit method");
        System.out.println(("-").repeat(20));
        System.out.println("This is your Result");

        System.out.println(sumDigit(123456789));

        System.out.println(("-").repeat(20));

        //Exercise 3
        System.out.println("Testing SumEven method");
        System.out.println(("-").repeat(20));
        System.out.println("This is your Result");

        System.out.println(sumEven(10));

        System.out.println(("-").repeat(20));

    }
}
