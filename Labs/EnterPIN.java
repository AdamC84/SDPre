import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String typedPassword = "hunter2";

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA");
    System.out.print("PLEASE ENTER YOUR PASSWORD: ");
    typedPassword = keyboard.next();

    while ( ! typedPassword.equals("hunter2")) {
      System.out.println("\nINCORRECT PASSWORD, TRY AGAIN. ");
      System.out.print("PLEASE ENTER YOUR PASSWORD: ");
      typedPassword = keyboard.next();
    }
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN, TRY AGAIN. TRY AGAIN. ");
      System.out.println("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
