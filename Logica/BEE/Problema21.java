//Problema 1020

import java.util.Scanner;

public class Problema21 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int diasTotais, atual, dias, meses, anos;

    diasTotais = in.nextInt();
    atual = diasTotais;

    anos = atual / 365;
    atual = atual % 365;
    meses = atual / 30;
    dias = atual % 30;

    System.out.println(anos + " ano(s)");
    System.out.println(meses + " mes(es)");
    System.out.println(dias + " dia(s)");
  }
}
