import java.util.Scanner;

public class Ex5 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = 1;
    float media = 0;

    while (n < 6) {
      System.out.printf("Informe a %d nota do aluno: ", n);
      float nota = in.nextFloat();
      media += nota;

      n++;
    }

    media = media / 5;
    System.out.printf("A media do aluno foi %.1f!!\n", media);
  }
}
