//Problema 1013

import java.util.Scanner;

public class Problema14 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int A, B, C;
    A = in.nextInt();
    B = in.nextInt();
    C = in.nextInt();

    if (A > B && A > C) {
      System.out.println(A + " eh o maior");
    } else if (B > C) {
      System.out.println(B + " eh o maior");
    } else {
      System.out.println(C + " eh o maior");
    }
  }
}
