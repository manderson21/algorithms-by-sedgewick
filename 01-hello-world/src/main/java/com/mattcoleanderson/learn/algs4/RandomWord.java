package com.mattcoleanderson.learn.algs4;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    // TODO: Implement this assingment
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
