import java.util.Scanner;

public class _5_FactorialNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number:");
    int num = sc.nextInt();
    int fact = 1;
    if (num < 0) {
      System.out.println(" the number is Negative");
    } else {

      for (int i = 1; i <= num; i++) {
        fact = fact * i;

      }
      System.out.println(" the factorial of" + num + " is:" + fact);
    }
  }

}
