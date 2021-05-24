square.java

import java.util.*;
public class Main
{  
    public static void main(String args[])
   {
      for(int x=0;x<20;x++)
      {
         System.out.print("*");
      }
      for(int x=0;x<10;x++)
      {
         System.out.println();
         System.out.print("*");
         for(int n=1; n<19; n++) {System.out.print(" ");}
         System.out.print("*");
      }
      System.out.println();
      for(int x=0;x<20;x++)
      {
         System.out.print("*");
      }
     }
}