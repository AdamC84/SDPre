public class Objective6Lab3 {
  public static void main(String [] args) {
    int counter = 1;
    int oe;

    while(counter <= 20) {
      oe = counter % 2;

      if (oe >= 1){
      System.out.println(counter + " is ODD.");
    }
      if (oe == 0){
      System.out.println(counter + " is EVEN.");
      }
      counter = counter + 1;
    }
  }
}
