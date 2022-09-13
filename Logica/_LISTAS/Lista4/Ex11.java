import java.util.Scanner;

public class Ex11 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int n1 = in.nextInt();

    System.out.println("Informe outro número: ");
    int n2 = in.nextInt();

    while (n2 == 0) {
      System.out.println("Informe outro número diferente de zero: ");
      n2 = in.nextInt();
    }

    int n = n1 / n2;

    System.out.printf("A divisão de %d por %d é %d", n1, n2, n);
  }
}
