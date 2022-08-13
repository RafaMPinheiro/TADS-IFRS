//Problema 1038

import java.util.Scanner;

public class Problema27 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int codigo, quantLanche;
    double preco;

    codigo = in.nextInt();
    quantLanche = in.nextInt();

    if (codigo == 1) {
        preco = quantLanche * 4;
      System.out.printf("Total: R$ %.2f\n", preco);
    } else if (codigo == 2) {
        preco = quantLanche * 4.5;
      System.out.printf("Total: R$ %.2f\n", preco);
    } else if (codigo == 3) {
        preco = quantLanche * 5;
      System.out.printf("Total: R$ %.2f\n", preco);
    } else if (codigo == 4) {
        preco = quantLanche * 2;
      System.out.printf("Total: R$ %.2f\n", preco);
    } else {
        preco = quantLanche * 1.5;
      System.out.printf("Total: R$ %.2f\n", preco);
    }
  }
}
