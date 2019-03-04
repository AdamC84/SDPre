import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String [] args) {
  Double num1, num2, sum;
  Scanner input = new Scanner(System.in);

  System.out.print(" Please enter a number with a decimal: ");
  num1 = input.nextDouble();
  System.out.print("Please enter another number with a decimal: ");
  num2 = input.nextDouble();

  sum = num1 + num2;

  System.out.println(" The sum of " + num1 + " + " + num2 + " = " + sum);
  input.close();

 }
}
