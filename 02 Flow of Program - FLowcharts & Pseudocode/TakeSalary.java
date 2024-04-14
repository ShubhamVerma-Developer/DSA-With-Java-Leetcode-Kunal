// Take input of a salary. If the salary is greater than 10,000 add bonus as 2000,
// otherwise add bonus as 1000.

import java.util.Scanner;

public class TakeSalary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your salary : ");
    double salary = sc.nextDouble();

    if (salary > 10000) {
      salary = salary + 2000;
    } else {
      salary = salary + 1000;
    }

    System.out.println("Your salary after adding bonus is :" + salary);
  }
}
