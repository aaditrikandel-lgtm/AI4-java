import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        int sum;
        sum=num1+num2;
        System.out.println("The sum of"+num1+"and"+num2+"is="+sum);
        int difference;
        difference=num1-num2;
        System.out.println("The difference of"+num1+"and"+num2+"is="+difference);
        int multiple;
        multiple=num1*num2;
        System.out.println("The multiplication of"+num1+"and"+num2+"is="+multiple);
        int divide;
        divide=num1/num2;
        System.out.println("The division of"+num1+"and"+num2+"is="+divide);
        int remainder;
        remainder=num1%num2;
        System.out.println("The remainder is="+remainder);
        
        
        
    }
    }
