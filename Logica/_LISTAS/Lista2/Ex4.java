import java.util.Scanner;

public class Ex4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o numero: ");
    int primeiroNum = in.nextInt();
    int segundoNum = in.nextInt();

    if (primeiroNum > segundoNum) {
      System.out.printf(
        "O primeiro número é maior e seu valor: %d.\n",
        primeiroNum
      );
    } else if (primeiroNum < segundoNum) {
      System.out.printf(
        "O segundo número é maior e seu valor: %d.\n",
        segundoNum
      );
    } else {
      System.out.println("Os números são iguais.");
    }
  }
}
