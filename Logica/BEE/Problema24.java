//Problema 1035

import java.util.Scanner;

public class Problema24 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a, b, c, d;

    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    d = in.nextInt();

    if (b > c && d > a && (c + d) > (a + b) && c >= 0 && d >= 0 && a % 2 == 0) {
      System.out.println("Valores aceitos");
    } else {
      System.out.println("Valores nao aceitos");
    }
  }
}
