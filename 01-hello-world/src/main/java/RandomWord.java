import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  /**
   * Randomly prints 1 word from standard input.
   *
   * @param args
   */
  public static void main(String[] args) {
    String champion = "";
    double index = 0;

    while (!StdIn.isEmpty()) {
      String contender = StdIn.readString();
      boolean isWinner = StdRandom.bernoulli(1.0 / (index + 1.0));

      if (isWinner) {
        champion = contender;
      }
      index++;
    }

    System.out.println(champion);
  }
}
