import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("___Menu___");
      System.out.println("1: Say Hello");
      System.out.println("2: List My Favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();


      if (selection == 1){
        System.out.println("Hello World");

      if (selection == 2)
        System.out.println(" Apple, Banana, Cocuonut");

      else
        System.out.println("Goodbye");

  }
  scanner.close();
 }
}
}
