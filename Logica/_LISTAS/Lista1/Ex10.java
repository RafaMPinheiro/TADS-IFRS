import java.util.Scanner;

public class Ex10 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Qual o valor do ingresso: ");
    float ingresso = in.nextFloat();

    System.out.println("Qual o numero de pessoas socias do clube: ");
    int socios = in.nextInt();

    System.out.println("Qual o numero de pessoas nao pagantes: ");
    int isentos = in.nextInt();

    System.out.println(
      "Qual o numero de pessoas pagantes (sem desconto algum): "
    );
    int pagantes = in.nextInt();

    int totalPublico = socios + isentos + pagantes;

    float valorArrecadado = (float) (
      (pagantes * ingresso) + (socios * (ingresso * 0.7))
    );

    float valorNaoArrecadado = (float) (
      (isentos * ingresso) + (socios * (ingresso * 0.3))
    );

    System.out.printf(
      "O total de publico no evento foi de %d.\nA renda total do evento foi de %.2f e o valor que deixou de ser arrecadado foi de %.2f.\n",
      totalPublico,
      valorArrecadado,
      valorNaoArrecadado
    );
  }
}
