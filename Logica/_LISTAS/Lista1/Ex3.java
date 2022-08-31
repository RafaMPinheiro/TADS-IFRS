import java.util.Scanner;

public class Ex3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o numero: ");
    int numero = in.nextInt();

    numero = numero * numero;
    System.out.println("Quadrado do numero: " + numero);
  }
}
