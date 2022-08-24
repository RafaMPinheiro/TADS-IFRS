import java.util.Scanner;

public class ex23list2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int quantAtual, quantMaxima, quantMinima, quantMedia;

    System.out.println("Informe a quantidade que tem em seu estoque: ");
    quantAtual = in.nextInt();

    System.out.println("Informe a quantidade maxima de seu estoque: ");
    quantMaxima = in.nextInt();

    System.out.println("Informe a quantidade minima de seu estoque: ");
    quantMinima = in.nextInt();

    quantMedia = (quantMaxima + quantMinima) / 2;

    if (quantAtual >= quantMedia) {
      System.out.println("Não efetuar compra");
    } else {
      System.out.println("Efetuar compra");
    }
  }
}
