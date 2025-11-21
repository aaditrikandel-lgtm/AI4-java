
/**
 * Write a description of class IOTdevice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IOTdevice
{
    public static void main(String[]arg)
    {
       int waterLevel;
       waterLevel=1000;
       System.out.println("The current water level is:"+ waterLevel);
       String result=(waterLevel>=1000)?"Warning Waterlevel is over 1000 litres" : "status Normal";
       System.out.println(result);
       

    }
    }
