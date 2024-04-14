import java.util.Scanner;

public class Prime {
  static boolean isPrime(int n) {
    boolean result = true;
    if (n == 1) {
      return true;
    }
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        result = false;
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    if (isPrime(n)) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }
}
