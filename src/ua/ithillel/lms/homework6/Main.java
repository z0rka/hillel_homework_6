package ua.ithillel.lms.homework6;

import static ua.ithillel.lms.homework6.model.ArrayValueCalculator.doCalc;

import ua.ithillel.lms.homework6.exceptions.ArrayDataException;
import ua.ithillel.lms.homework6.exceptions.ArraySizeException;

public class Main {

  public static void main(String[] args) {
    String[][] str = {
        {"1", "1", "1", "null"},
        {"1", "1", "1", "1"},
        {"1", "1", "1", "1"},
        {"1", "1", "1", "1"}
    };

    try {
      System.out.println(doCalc(str));
    } catch (ArrayDataException | ArraySizeException | NullPointerException e) {
      System.out.println(e.getMessage());

    }
  }
}

