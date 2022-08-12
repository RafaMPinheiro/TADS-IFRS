//Problema 1043

import java.util.Scanner;

public class Problema1043 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    float a, b, c, perimetro, area;

    a = in.nextFloat();
    b = in.nextFloat();
    c = in.nextFloat();

    if (a >= b && a >= c) {
      if (a < b + c) {
        perimetro = a + b + c;
        System.out.printf("Perimetro = %.1f\n", perimetro);
      } else {
        area = ((a + b) / 2) * c;
        System.out.printf("Area = %.1f\n", area);
      }
    } else if (b >= a && b >= c) {
      if (b < a + c) {
        perimetro = a + b + c;
        System.out.printf("Perimetro = %.1f\n", perimetro);
      } else {
        area = ((a + b) / 2) * c;
        System.out.printf("Area = %.1f\n", area);
      }
    } else {
      if (c < a + b) {
        perimetro = a + b + c;
        System.out.printf("Perimetro = %.1f\n", perimetro);
      } else {
        area = ((a + b) / 2) * c;
        System.out.printf("Area = %.1f\n", area);
      }
    }
  }
}
