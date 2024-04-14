// Take a name and output Hello Name

import java.util.Scanner;

public class TakeInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.next();
    sc.close();
    System.out.println("Hello " + name);
  }
}
