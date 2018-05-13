package pl.lesson;

import java.util.Arrays;

public class Main {

  public int[] A = {2, 3,1,5};

  public static void main(String[] args) {

    System.out.println("frog jumps: " + frogJmp(10, 85, 30));



  }

  /*
   * 1/3
   * Method gives number of frog Jumps, Performance tests to improve!!!!
   * 100 out of 100 points
   */
  static int frogJmp(int X, int Y, int D) {

    double x = X;
    double y = Y;
    double d = D;

    double _tempDouble = Math.ceil((y - x) / d); //2 !!!!
    int jumps = (int) _tempDouble;

    return jumps;
  }

  static int permMisingElem(int[] A){

    Arrays.sort(A);

    for (int i = 0;)

    return -1;
  }



}
