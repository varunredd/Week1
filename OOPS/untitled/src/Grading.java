import java.util.Scanner;

public class Grading {

    public void GradingStudent ( Scanner scanner ) {
        System.out.print( "Enter the student's name: " );
        String studentName = scanner.nextLine( );

        System.out.print( "Enter the student's marks for Mathematics: " );
        double mathMarks = scanner.nextDouble( );

        System.out.print( "Enter the student's marks for Science: " );
        double scienceMarks = scanner.nextDouble( );

        System.out.print( "Enter the student's marks for English: " );
        double englishMarks = scanner.nextDouble( );

        double totalMarks = mathMarks + scienceMarks + englishMarks;
        double averageMarks = totalMarks / 3;
        char grade;

        System.out.println( "\nCalculating the results for " + studentName + "..." );

        if ( averageMarks >= 90 ) {
            grade = 'A';
        } else if ( averageMarks >= 75 ) {
            grade = 'B';
        } else if ( averageMarks >= 60 ) {
            grade = 'C';
        } else if ( averageMarks >= 50 ) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println( "\nResults for " + studentName + ":" );
        System.out.println( "Total Marks: " + totalMarks );
        System.out.println( "Average Marks: " + averageMarks );
        System.out.println( "Grade: " + grade );

        System.out.println( "\nWould you want to perform another action?" );
        System.out.println( "1. View detailed grade" );
        System.out.println( "2. Exit" );
        System.out.print( "Enter your choice (1-2): " );
        int choice = scanner.nextInt( );

        switch ( choice ) {
            case 1:
                switch ( grade ) {
                    case 'A':
                        System.out.println( "Grade A: Excellent performance. Keep it up!" );
                        break;
                    case 'B':
                        System.out.println( "Grade A: Excellent performance. Keep it up!" );
                        break;
                    case 'C':
                        System.out.println( "Grade A: Excellent performance. Keep it up!" );
                        break;
                    case 'D':
                        System.out.println( "Grade A: Excellent performance. Keep it up!" );
                        break;
                    case 'F':
                        System.out.println( "Grade A: Excellent performance. Keep it up!" );
                        break;

                    default:
                        System.out.println( "Invalid Grade" );
                        break;
                }
                break;
            case 2:
                System.out.println( "Exiting ........." );
                break;
            default:
                System.out.println( "Invalid option. Code Terminated" );
                break;
        }

    }
}
