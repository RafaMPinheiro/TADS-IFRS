import java.util.Scanner;

public class Ex10 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o salário: ");
    float salario = in.nextFloat();

    while (salario < 1000) {
      System.out.println("Salário invalido!! Informe novamente:");
      salario = in.nextFloat();
    }

    System.out.printf(
      "Salário invalido!! O salário informado foi %.2f.\n",
      salario
    );
  }
}
