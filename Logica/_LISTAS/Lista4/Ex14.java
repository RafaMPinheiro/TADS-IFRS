import java.util.Scanner;

public class Ex14 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int contador = 0;
    int mult = 1;
    int soma = 0;

    while (contador < 10) {
      contador++;

      System.out.printf("Informe o %d número: ", contador);
      int num = in.nextInt();

      if (num < 10 && num > 0) {
        mult = num * mult;
      } else {
        soma += num;
      }
    }
    System.out.printf("A multiplicação é %d e a soma %d.\n", mult, soma);
  }
}
