circumference-with-input.java

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        float radius;
        double area, circum;
        Scanner scan = new Scanner(System.in);

        System.out.print("\n"); // blank line to make code easy to read
        System.out.print("Enter radius of the 1st circle : ");
        radius = scan.nextFloat();
		
        circum = 2*3.14159*radius;
		
        System.out.print("\nCircumference of the 1st circle = " +circum);

        float radius2;
        double circum1;
        Scanner scan2 = new Scanner(System.in);

        System.out.print("\n");// blank line to make code easy to read
        System.out.print("\n");// blank line to make code easy to read
        System.out.print("Enter radius of the 2nd circle : ");
        radius2 = scan2.nextFloat();
		
        circum = 2*3.14159*radius2;
		
        System.out.print("\nCircumference of the 2nd circle is = " +circum);

        float radius3;
        double circum3;
        Scanner scan3 = new Scanner(System.in);

        System.out.print("\n");// blank line to make code easy to read
        System.out.print("\n");// blank line to make code easy to read
        System.out.print("Enter radius of the 3rd circle : ");
        radius3 = scan3.nextFloat();
		
        circum3 = 2*3.14159*radius3;
		
        System.out.print("\nCircumference of the 3rd circle is = " +circum3);
    }
}