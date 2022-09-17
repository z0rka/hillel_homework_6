package ua.ithillel.lms.homework6.model;

import static java.lang.Integer.parseInt;

import ua.ithillel.lms.homework6.exceptions.ArrayDataException;
import ua.ithillel.lms.homework6.exceptions.ArraySizeException;

public class ArrayValueCalculator {

  public static int doCalc(String[][] matrixStr) throws ArrayDataException, ArraySizeException {
    int sum = 0;

    checkIfStrFits(matrixStr);
    removeSpace(matrixStr);

    for (int i = 0; i < matrixStr.length; i++) {
      for (int j = 0; j < matrixStr[i].length; j++) {

        if (!matrixStr[i][j].matches("[-+]?\\d+")) {
          throw new ArrayDataException("Not numbers in the field" + " [ " + i + " ][ " + j + " ]");
        }

        sum += Integer.parseInt(matrixStr[i][j]);
      }
    }
    return sum;
  }

  private static void checkIfStrFits(String[][] matrixStr) throws ArraySizeException {
    if (matrixStr == null) {
      throw new ArraySizeException("String is null");
    }

    int checkIfFits = 0;

    for (String[] str : matrixStr) {
      if (str == null) {
        throw new ArraySizeException("Not appropriate size of the String");
      }

      checkIfFits += str.length;
    }

    if (checkIfFits != 16) {
      throw new ArraySizeException("Not appropriate size of the String");
    }
  }

  private static void removeSpace(String[][] matrixStr) {

    for (int i = 0; i < matrixStr.length; i++) {
      for (int j = 0; j < matrixStr[i].length; j++) {

        if (matrixStr[i][j] == null) {
          throw new NullPointerException(
              "There is null in cell number " + " [ " + i + " ][ " + j + " ]");
        }

        matrixStr[i][j] = matrixStr[i][j].trim();
      }
    }
  }
}
