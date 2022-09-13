import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um numero: ");
    int n = in.nextInt();
    int contador = 0;
    int soma = 0;

    while (contador < n) {
      contador++;

      if (contador % 2 == 0) {
        soma += contador;
      }
    }

    System.out.printf("A soma de todos pares de 1 ate %d eh %d.\n", n, soma);
  }
}
