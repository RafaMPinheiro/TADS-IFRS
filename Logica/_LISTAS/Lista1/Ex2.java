import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o numero: ");
    float numero = in.nextFloat();

    float valorAtualizado = numero * 1.2f;

    System.out.printf("Valor atualizado para: %.2f\n", valorAtualizado);
  }
}
