//Problema 1014

import java.util.Scanner;

public class Problema15 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x;
    float y;
    double consumo;
    x = in.nextInt();
    y = in.nextFloat();

    consumo = x / y;

    System.out.printf("%.3f km/l\n", consumo);
  }
}
