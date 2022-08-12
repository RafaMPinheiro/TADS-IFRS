//Problema 1036

import java.util.Scanner;

public class Problema25 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double a, b, c, delta, r1, r2;

    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

    if (a == 0 || b * b - 4 * a * c < 0) {
      System.out.println("Impossivel calcular");
    } else {
      delta = b * b - 4 * a * c;
      r1 = (-b + Math.sqrt(delta)) / (2 * a);
      r2 = (-b - Math.sqrt(delta)) / (2 * a);
      System.out.printf("R1 = %.5f\n", r1);
      System.out.printf("R2 = %.5f\n", r2);
    }
  }
}
