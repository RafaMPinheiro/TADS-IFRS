import java.util.Scanner;

public class Ex12 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um número múltiplo de 5: ");
    int n = in.nextInt();

    while (n % 5 != 0) {
      System.out.println("O valor Informado não é múltiplo de 5.");
      System.out.println("Informe um número múltiplo de 5: ");
      n = in.nextInt();
    }
    System.out.println("O valor informado foi " + n);
  }
}
