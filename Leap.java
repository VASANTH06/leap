import java.io.*;
import java.util.*;
class Leap
{
  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(((a%400==0)||(a%4==0))&&(a%100!=0))
        {
            System.out.println("given year is leap year");
        }
        else
        {
            System.out.print("given year is not a leap year");
        }
    }
    
}
