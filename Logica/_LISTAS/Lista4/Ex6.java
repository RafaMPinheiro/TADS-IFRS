import java.util.Scanner;

public class Ex6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = 0;

    while (n < 1 || n > 10) {
      System.out.print("Informe um número entre 1 e 10(incluindo 1 e 10): ");
      n = in.nextInt();
    }

    System.out.println("O número informado foi: " + n);
  }
}
