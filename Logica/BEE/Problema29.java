//Problema 1041
import java.util.Scanner;

public class Problema29 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double x, y;

    x = in.nextDouble();
    y = in.nextDouble();

    if (x > 0) {
      if (y > 0) {
        System.out.println("Q1");
      } else if (y < 0) {
        System.out.println("Q4");
      } else {
        System.out.println("Eixo X");
      }
    } else if (x < 0) {
      if (y > 0) {
        System.out.println("Q2");
      } else if (y < 0) {
        System.out.println("Q3");
      } else {
        System.out.println("Eixo X");
      }
    } else {
      if (y == 0) {
        System.out.println("Origem");
      } else {
        System.out.println("Eixo Y");
      }
    }
  }
}
/* 
    if (x == 0 && y == 0) {
      System.out.println("Origem");
    } else if (x == 0 && y != 0) {
      System.out.println("Eixo Y");
    } else if (y == 0 && x != 0) {
      System.out.println("Eixo X");
    } else if (x > 0) {
      if (y > 0) {
        System.out.println("Q1");
      } else {
        System.out.println("Q4");
      }
    } else if (x < 0) {
      if (y > 0) {
        System.out.println("Q2");
      } else if (y < 0) {
        System.out.println("Q3");
      }
    }
*/
