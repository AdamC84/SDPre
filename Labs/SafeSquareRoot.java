import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String reply, yes, no;

    System.out.print(" Are you ready? ");
    reply = keyboard.next();

    while ( ! reply.equalsIgnoreCase("yes")) {
      System.out.println("\nLet me know when you are!");
      System.out.print("Are you ready? ");
      reply = keyboard.next();
    }

    System.out.print( " Give me a number, and i'll find it's square root. ");
    System.out.print( "(No negatives, please.): ");
    x = keyboard.nextDouble();

    while ( x < 0) {
    System.out.println( " I won't take the square root of a negative.");
    System.out.print("\nNew number: ");
    x = keyboard.nextDouble();
  }
  y = Math.sqrt(x);

  System.out.println("The square root of " + x + " is " + y);
  }
}
