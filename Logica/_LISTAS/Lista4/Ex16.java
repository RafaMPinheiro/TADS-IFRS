import java.util.Scanner;

public class Ex16 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int contador = 0;
    int mult = 1;

    System.out.println("Informe um número: ");
    int n = in.nextInt();
    System.out.println("Informe um expoente para esse número: ");
    int expo = in.nextInt();

    while (contador < expo) {
      contador++;

      mult = n * mult;
    }

    System.out.printf("O número %d elevado a %d é %d.\n", n, expo, mult);
  }
}
