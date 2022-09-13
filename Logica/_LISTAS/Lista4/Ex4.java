import java.util.Scanner;

public class Ex4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println(
      "Digite A para consultar saldo\nB para saque\nC para depósito\nD para sair"
    );
    String acao = in.next();
    float saldo = 0;

    while (acao.equals("A") || acao.equals("B") || acao.equals("C")) {
      if (acao.equals("A")) {
        System.out.printf("Seu saldo é de: %.2f R$.\n", saldo);
      } else if (acao.equals("B")) {
        System.out.println("Quanto deseja sacar: ");
        float saque = in.nextFloat();
        saldo -= saque;
        System.out.printf("Seu saldo agora é de: %.2f R$.\n", saldo);
      } else if (acao.equals("C")) {
        System.out.println("Quanto deseja depositar: ");
        float deposito = in.nextFloat();
        saldo += deposito;
        System.out.printf("Seu saldo agora é de: %.2f R$.\n", saldo);
      }
      System.out.println(
        "Digite A para consultar saldo\nB para saque\nC para depósito\nD para sair"
      );
      acao = in.next();
    }
    saldo = 0;
  }
}
