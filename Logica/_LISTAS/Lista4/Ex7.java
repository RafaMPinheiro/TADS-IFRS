import java.util.Scanner;

public class Ex7 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int senhaCorreta = 12345;
    int tentativas = 0;
    int senha = 0;

    while (senha != senhaCorreta) {
      System.out.println("Informe a senha: ");
      senha = in.nextInt();

      tentativas++;
    }
    System.out.printf(
      "Parabéns acertou a senha, demorou %d tentativas!!\n",
      tentativas
    );
  }
}
