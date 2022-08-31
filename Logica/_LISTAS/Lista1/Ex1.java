import java.util.Scanner;

public class Ex1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o numero: ");
    int numero = in.nextInt();

    int antecessor = numero - 1;
    System.out.println("Antecessor: " + antecessor);
  }
}
