public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, height;
    double seconds, e, checking, minutes;
    String firstname, lastname, title, Profession;

    x = 10;
    y = 400;
    age = 39;
    height = 6;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    minutes = 4.5;

    firstname = "Graham";
    lastname = "Mitchell";
    title = "Mr.";
    Profession = "Welder";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The expieriment took " + seconds + " seconds");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstname + lastname );
    System.out.println("I'm " + height + " foot tall and run a mile in " + minutes + " minutes, " + "I'm also a " + Profession);
  }
}
