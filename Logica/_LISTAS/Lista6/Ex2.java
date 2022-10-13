import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean continuar;
    do {
      System.out.print("Digite um numeros inteiro positivo: ");
      int valor = in.nextInt();
      for (; valor < 0;) {
        System.out.println("Valor incorreto!");
        System.out.print("Digite um numeros inteiro positivo: ");
        valor = in.nextInt();
      }
      System.out.println("Numero digitado: " + valor);

      int pares = 0;

      for (int i = 2; i < valor; i++) {
        if (i % 2 == 0) pares++;
      }

      int[] inteiros = new int[pares];

      for (int i = 2; i < valor; i += 2) {
        if (i > 2) {
          inteiros[(i / 2) - 1] = i;
        } else {
          inteiros[0] = i;
        }
      }

      System.out.print("Numeros inteiros pares entre 1 e 8: ");
      for (int i = 0; i < inteiros.length; i++) {
        if (inteiros.length - i != 1) {
          System.out.print(inteiros[i] + ", ");
        } else {
          System.out.print(inteiros[i]);
        }
      }
      System.out.println();

      System.out.println("Deseja repetir? [S/N]");
      char repetir = in.next().toUpperCase().charAt(0);
      if (repetir == 'S') {
        continuar = true;
      } else {
        continuar = false;
      }
    } while (continuar);
  }
}
