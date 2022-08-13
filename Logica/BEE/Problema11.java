//Problema 1010

import java.util.Scanner;

public class Problema11 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int peca1, numPeca1, peca2, numPeca2;
    double valorPeca1, valorPeca2, total;

    peca1 = in.nextInt();
    numPeca1 = in.nextInt();
    valorPeca1 = in.nextDouble();

    peca2 = in.nextInt();
    numPeca2 = in.nextInt();
    valorPeca2 = in.nextDouble();

    total = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
  }
}
