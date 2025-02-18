import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        System.out.println( "Encapsulation" );
        Employee employee = new Employee( );
        System.out.println( " " );

        System.out.println( "Inheritance" );
        Animal dog = new Dog( );
        dog.sound( );
        dog.moveOn( );// Inherited method from the superclass Animal
        System.out.println( " " );

        System.out.println( "Method Overloading" );
        Bike bike = new Bike( );
        bike.functionality( "Brake", "Cruise" );
        bike.functionality( "Brake", "Cruise", "Oil" );
        bike.functionality( 220.52, "Weight" );
        System.out.println( " " );

        System.out.println( "Method Overriding" );
        Bike bike1 = new RoyalEnfield( );
        bike1.functionality( "Brake", "Cruise" );
        System.out.println( " " );

        System.out.println( "Abstraction" );
        Food2 food2 = new Food2( );
        food2.taste( );//taste is a method from a abstract class Food 1 which implements interface Food
        food2.energy( );// energy is from a concrete class which extended a abstract class Food1 so it implement methods missing in abstract class

        Food3 food3 = new Food3( );//It is a concrete class which implements a interface Food so it should implement both methods undefined in interface
        food3.taste( );
        food3.energy( );
        System.out.println( " " );
        System.out.println( " " );
        System.out.println( " " );
        System.out.println( " " );

        Operators operators = new Operators( );
        System.out.println( "Addition: " + operators.add( 5.5, 3.2 ) );
        System.out.println( "Subtraction: " + operators.subtract( 5.5, 3.2 ) );
        System.out.println( "Multiplication: " + operators.multiply( 5.5, 3.2 ) );
        System.out.println( "Division: " + operators.divide( 5.5, 3.2 ) );
        System.out.println( "Modulus: " + operators.modulus( 10, 3 ) );
        System.out.println( "Increment: " + operators.increment( 5 ) );
        System.out.println( "Decrement: " + operators.decrement( 5 ) );
        System.out.println( "AND: " + operators.and( 5, 3 ) );
        System.out.println( "OR: " + operators.or( 5, 3 ) );
        System.out.println( "Right Shift: " + operators.rightShift( 16, 2 ) );
        System.out.println( "Left Shift: " + operators.leftShift( 4, 2 ) );
        System.out.println( "Greater: " + operators.greater( 5.5, 3.2 ) );
        System.out.println( "Lesser: " + operators.lesser( 5.5, 3.2 ) );
        System.out.println( "Equals: " + operators.equals( 5.5, 3.2 ) );

        System.out.println( " " );
        Datatypes datatypes = new Datatypes( );
        datatypes.display( );
        Scanner scanner = new Scanner( System.in );
        System.out.println( "If - Else Switch Case Demonstration" );
        Grading grading = new Grading( );
        grading.GradingStudent( scanner );

        System.out.println( "For While and Do-While Demonstration" );
        Numbers numbers = new Numbers( );
        numbers.Operations( scanner );
        scanner.close( );

    }

}