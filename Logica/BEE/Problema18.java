//Problema 1017

import java.util.Scanner;

public class Problema18 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int velocidade, tempo;
    float gasto;
    tempo = in.nextInt();
    velocidade = in.nextInt();

    gasto = velocidade * tempo;
    gasto = gasto / 12;

    System.out.printf("%.3f\n", gasto);
  }
}
