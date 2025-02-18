import java.util.Scanner;

public class Numbers {

    public void Operations ( Scanner scanner ) {

        System.out.print( "Enter a number (N) to print the first N natural numbers: " );
        int n = scanner.nextInt( );
        System.out.println( "The first " + n + " natural numbers are:" );
        for (int i = 1; i <= n; i++) {
            System.out.print( i + " " );
        }
        System.out.println( );

        System.out.print( "Enter a number (M) to calculate its factorial: " );
        int m = scanner.nextInt( );
        int k = m;
        long factorial = 1;
        while (k > 0) {
            factorial = factorial * k--;
        }
        System.out.println( "The factorial of " + m + " is: " + factorial );

        System.out.print( "Enter a number (J) to calculate the sum of all even numbers up to J: " );
        int j = scanner.nextInt( );
        int sum = 0;
        int num = 2;
        do {
            sum += num;
            num += 2;
        } while (num <= j);
        System.out.println( "The sum of even numbers from 1 to " + j + " is: " + sum );


    }
}
