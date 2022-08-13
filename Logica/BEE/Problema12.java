//Problema 1011

import java.util.Scanner;

public class Problema12 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double raio, raioCubo, pi, volume;

    raio = in.nextDouble();
    raioCubo = raio * raio * raio;

    pi = 3.14159;
    volume = (4.0 / 3) * pi * raioCubo;

    System.out.printf("VOLUME = %.3f\n", volume);
  }
}
