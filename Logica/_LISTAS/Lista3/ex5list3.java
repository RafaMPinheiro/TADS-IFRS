import java.util.Scanner;

public class ex5list3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a, b, c;

    System.out.println("Informe os lados do possível triângulo: ");

    if ((a < b + c) && (b < a + c) && (c < a + b)) {
      System.out.println("É um triângulo");
    } else {
      System.out.println("Não é um triângulo");
    }
  }
}
