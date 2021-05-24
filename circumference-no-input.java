circumference-no-input.java

import java.util.Scanner;

public class Main
{  
    public static void main(String args[])
   {
      int r1=3, r2=100;
      double r3=8.75, pi=3.1415926, cir1,cir2, cir3;
      
      cir1 = 2*r1*pi;
      cir2 = 2*r2*pi;
      cir3 = 2*r3*pi;

      System.out.println("Circumference of circle1: " + cir1);
      System.out.println("Circumference of circle2: " + cir2);
      System.out.println("Circumference of circle3: " + cir3);
   }
}