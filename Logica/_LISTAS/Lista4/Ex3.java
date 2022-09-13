import java.util.Scanner;

public class Ex3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um numero: ");
    int n = in.nextInt();
    int contador = 0;
    int primo = 0;

    while (contador < n) {
      contador++;

      if (n % contador == 0) {
        primo += 1;
      }
    }

    if (primo == 2) {
      System.out.println(n + " eh numero primo.");
    } else {
      System.out.println(n + " nao eh numero primo.");
    }
  }
}
