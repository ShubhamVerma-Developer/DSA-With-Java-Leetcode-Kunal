import java.util.Scanner;

public class SumTwoNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two number : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("The result is : " + c);
  }
}
