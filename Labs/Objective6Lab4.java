public class Objective6Lab4 {
  public static void main(String[] args) {
    int count = 1;
    int sum = 0;

    while (count <= 20) {
      sum += count;

      if (count == 20) {
        System.out.println(sum);
      }
      count = count + 1;
    }
  }
}
