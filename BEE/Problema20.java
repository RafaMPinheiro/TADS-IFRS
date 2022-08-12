//Problema 1019

import java.util.Scanner;

public class Problema20 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n, atual, segundos, minutos, horas;

    n = in.nextInt();
    atual = n;

    segundos = atual % 60;
    atual = atual / 60;
    minutos = atual % 60;
    horas = atual / 60;

    System.out.println(horas + ":" + minutos + ":" + segundos);
  }
}
