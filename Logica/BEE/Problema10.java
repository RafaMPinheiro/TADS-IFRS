//Problema 1009

import java.util.Scanner;

public class Problema10 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String nome;
    double salario, totalVendas, receber;
    nome = in.next();
    salario = in.nextDouble();
    totalVendas = in.nextDouble();
    receber = salario + (0.15 * totalVendas);

    System.out.printf("TOTAL = R$ %.2f\n", receber);
  }
}
