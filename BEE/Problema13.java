//Problema 1012

import java.util.Scanner;

public class Problema13 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double A, B, C, pi;
    double areaTri, areaCirc, areaTra, areaQuad, areaRet;

    A = in.nextDouble();
    B = in.nextDouble();
    C = in.nextDouble();
    pi = 3.14159;

    areaTri = (A * C) / 2;
    areaCirc = pi * Math.pow(C, 2);
    areaTra = (A + B) * C / 2;
    areaQuad = Math.pow(B, 2);
    areaRet = A * B;

    System.out.printf("TRIANGULO: %.3f\n", areaTri);
    System.out.printf("CIRCULO: %.3f\n", areaCirc);
    System.out.printf("TRAPEZIO: %.3f\n", areaTra);
    System.out.printf("QUADRADO: %.3f\n", areaQuad);
    System.out.printf("RETANGULO: %.3f\n", areaRet);
  }
}
