package week3;
import java.util.Scanner;


/**
 * Write a description of class Gradeevaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gradeevaluator
{
    public static void main (String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("students marks");
        int grades=sc.nextInt();
        int a = 50;
        String b =(grades>=a)?"pass":"fail";
        System.out.println(b);
        
        
    
    
    }
}