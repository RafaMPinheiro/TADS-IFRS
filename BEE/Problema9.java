//Problema 1008

import java.util.Scanner;

public class Problema9 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int num, horas;
    double valorHora, salario;
    num = in.nextInt();
    horas = in.nextInt();
    valorHora = in.nextDouble();
    salario = (valorHora * horas);

    System.out.println("NUMBER = " + num);
    System.out.printf("SALARY = U$ %.2f\n", salario);
  }
}
