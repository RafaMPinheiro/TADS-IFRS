//Problema 1040

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema28 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");

    double n1, n2, n3, n4, media, nExame;

    n1 = in.nextDouble();
    n2 = in.nextDouble();
    n3 = in.nextDouble();
    n4 = in.nextDouble();
    media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

    System.out.println("Media: " + df.format(media));

    if (media < 7 && media >= 5) {
      System.out.println("Aluno em exame.");
      nExame = in.nextDouble();
      System.out.printf("Nota do exame: %.1f\n", nExame);
      media = (nExame + media) / 2;
      if (media >= 5) {
        System.out.println("Aluno aprovado.");
      } else {
        System.out.println("Aluno reprovado.");
      }
      System.out.println("Media final: " + df.format(media));
    } else if (media >= 7) {
      System.out.println("Aluno aprovado.");
    } else {
      System.out.println("Aluno reprovado.");
    }
  }
}
/*

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema28 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");

    double n1, n2, n3, n4, media, nExame;

    n1 = in.nextDouble();
    n2 = in.nextDouble();
    n3 = in.nextDouble();
    n4 = in.nextDouble();
    media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

    System.out.printf("Media: %.2f\n", media);

    if (media < 7 && media >= 5) {
      System.out.println("Aluno em exame.");
      nExame = in.nextDouble();
      System.out.printf("Nota do exame: %.2f\n", nExame);
      media = (nExame + media) / 2;
      if (media >= 5) {
        System.out.println("Aluno aprovado.");
      } else {
        System.out.println("Aluno reprovado.");
      }
      System.out.printf("Media final: %.2f\n", media);
    } else if (media >= 7) {
      System.out.println("Aluno aprovado.");
    } else {
      System.out.println("Aluno reprovado.");
    }
  }
}
*/
