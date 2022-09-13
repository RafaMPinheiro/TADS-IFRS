import java.util.Scanner;

public class Ex9 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe sua idade: ");
    int idade = in.nextInt();

    while (idade < 0 || idade > 150) {
      System.out.println("Idade invalida!! Informe novamente:");
      idade = in.nextInt();
    }

    System.out.printf("Idade valida!! A idade digitada foi %d.\n", idade);
  }
}
