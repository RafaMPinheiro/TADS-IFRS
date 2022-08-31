import java.util.Scanner;

public class Ex3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o numero: ");
    float num = in.nextFloat();

    if (num >= 0) {
      System.out.println("O numero é positivo.");
    } else {
      System.out.println("O numero é negativo.");
    }
  }
}
