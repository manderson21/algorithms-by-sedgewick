package com.mattcoleanderson;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    // TODO: Implement this assingment
    String champion = StdIn.readString();
    Integer total = 1;
    
    while (!StdIn.isEmpty()) {
      String contender = StdIn.readString();
      
      if (StdRandom.bernoulli(1 / ++total)) {
        champion = contender;
      }
    }

    System.out.println(champion);
  }
}
