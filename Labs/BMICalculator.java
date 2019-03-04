import java.util.Scanner;

public class BMICalculator {
  public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, pounds, feet, height;

    System.out.print( "Your height in feet: ");
    feet = keyboard.nextDouble();
    System.out.print( "Your height in inches: ");
    inches = keyboard.nextDouble();

    System.out.print( " Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    height = (feet * 12) + inches;
    m = height * 0.0254;
    kg = pounds * 0.453592;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);
  }
}
