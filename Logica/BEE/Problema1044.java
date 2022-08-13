//Problema 1044

import java.util.Scanner;

public class Problema1044 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a, b;

    a = in.nextInt();
    b = in.nextInt();

    if (a % b == 0 || b % a == 0) {
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }
  }
}
