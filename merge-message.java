merge-message.java

import java.util.Scanner; 

public class Main {
  
  public static void main(String[] args) {
    Scanner kybrd = new Scanner(System.in);  // Create a Scanner object
    System.out.print("\n");
    System.out.println("please enter your first message");
    String first = kybrd.nextLine();  // Read user input
    System.out.print("\n");
    System.out.println("please enter your second message");
    String second = kybrd.nextLine();  // Read user input
    System.out.print("\n");
    System.out.println(first + " " + second);  // Output user input
  }
}
