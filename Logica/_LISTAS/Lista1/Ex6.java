import java.util.Scanner;

public class Ex6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe as duas notas do aluno: ");
    float nota1 = in.nextFloat();
    float nota2 = in.nextFloat();

    float media = (nota1 + nota2) / 2;
    System.out.printf("Media: %.2f\n", media);
  }
}
