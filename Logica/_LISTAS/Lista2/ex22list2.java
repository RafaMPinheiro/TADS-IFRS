import java.util.Scanner;

public class ex22list2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String numeroConta;
    float saldo, debito, credito, saldoTotal;

    System.out.println("Informe sua conta: ");
    numeroConta = in.next();

    System.out.println("Informe seu saldo: ");
    saldo = in.nextFloat();

    System.out.println("Informe seu débito: ");
    debito = in.nextFloat();

    System.out.println("Informe seu crédito: ");
    credito = in.nextFloat();

    saldoTotal = saldo - debito + credito;

    System.out.println(
      "Seu saldo total da conta " + numeroConta + " é: " + saldoTotal
    );

    if (saldoTotal < 0) {
      System.out.println("Saldo negativo... ");
    } else {
      System.out.println("Saldo positivo... ");
    }
  }
}
