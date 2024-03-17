/* English Calculator

 */

import java.util.Scanner;

public class EnglishCalculator
{
    public static void main( String [] args )
    {
        Scanner scan = new Scanner( System.in );

        int result = 0;

        String operatorWords = "", operand1Word = "", operand2Word = "";

        boolean operand1OK, operand2OK, operatorOK;

        System.out.print( "Enter the first operand > " );
        int operand1 = scan.nextInt( );
        System.out.print( "Enter the second operand > " );
        int operand2 = scan.nextInt( );

        System.out.print( "Enter the operator > " );
        String operatorS = scan.next( );
        char operator = operatorS.charAt( 0 );

        operand1OK = true;

        switch ( operand1 )
        {
            case 0:
                operand1Word = "zero";
                break;
            case 1:
                operand1Word = "one";
                break;
            case 2:
                operand1Word = "two";
                break;
            case 3:
                operand1Word = "three";
                break;
            case 4:
                operand1Word = "four";
                break;
            case 5:
                operand1Word = "five";
                break;
            case 6:
                operand1Word = "six";
                break;
            case 7:
                operand1Word = "seven";
                break;
            case 8:
                operand1Word = "eight";
                break;
            case 9:
                operand1Word = "nine";
                break;
            default:
                operand1OK = false;
                System.out.println( "Invalid number" );
        } // end switch operand1

        if ( operand1OK )
        {
            operatorOK = true;

            switch ( operator )
            {
                case '+':
                    operatorWords = " plus ";
                    result = operand1 + operand2;
                    break;
                case '-':
                    operatorWords = " minus ";
                    result = operand1 - operand2;
                    break;
                case '*':
                    operatorWords = " multiplied by ";
                    result = operand1 * operand2;
                    break;
                case '/':
                    operatorWords = " divided by ";
                    if ( operand2 == 0 )
                    {
                        System.out.println( "Division by zero is not allowed" );
                        operatorOK = false;
                    }
                    else
                    {
                        result = operand1 / operand2;
                    }
                    break;
                case '^':
                    operatorWords = " to the power ";
                    result = (int) ( Math.pow( operand1, operand2 ) );
                    break;
                default:
                    operatorOK = false;
                    System.out.println( "Invalid operator" );
            } // end switch operator

            if ( operatorOK )
            {
                operand2OK = true;

                switch ( operand2 )
                {
                    case 0:
                        operand2Word = "zero";
                        break;
                    case 1:
                        operand2Word =  "one";
                        break;
                    case 2:
                        operand2Word = "two";
                        break;
                    case 3:
                        operand2Word = "three";
                        break;
                    case 4:
                        operand2Word = "four";
                        break;
                    case 5:
                        operand2Word = "five";
                        break;
                    case 6:
                        operand2Word = "six";
                        break;
                    case 7:
                        operand2Word = "seven";
                        break;
                    case 8:
                        operand2Word = "eight";
                        break;
                    case 9:
                        operand2Word = "nine";
                        break;
                    default:
                        operand2OK = false;
                        System.out.println( "Invalid number" );
                } // end switch operand2

                if ( operand2OK )
                    System.out.println( operand1Word + operatorWords
                            + operand2Word + " is "
                            + result );
            } // end if ( operatorOK )
        } // end if ( operand1OK )
    } // end main5
}