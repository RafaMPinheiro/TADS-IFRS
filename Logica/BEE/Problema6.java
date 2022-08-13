//Problema 1005

import java.util.Scanner;

public class Problema6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double nota1, nota2, MEDIA;
    nota1 = in.nextDouble();
    nota2 = in.nextDouble();
    MEDIA = (nota1 * 3.5 + nota2 * 7.5) / 11;

    System.out.printf("MEDIA = %.5f\n", MEDIA);
  }
}
