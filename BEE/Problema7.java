//Problema 1006

import java.util.Scanner;

public class Problema7 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double A, B, C, MEDIA;
    A = in.nextDouble();
    B = in.nextDouble();
    C = in.nextDouble();
    MEDIA = (A * 2 + B * 3 + C * 5) / 10;

    System.out.printf("MEDIA = %.1f\n" + MEDIA);
  }
}
