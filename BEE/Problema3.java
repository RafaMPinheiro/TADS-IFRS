//Problema 1002

import java.util.Scanner;

public class Problema3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double pi = 3.14159;

    double r = input.nextDouble();

    double x = pi * (r * r);

    System.out.printf("A=%.4f\n", x);
  }
}
