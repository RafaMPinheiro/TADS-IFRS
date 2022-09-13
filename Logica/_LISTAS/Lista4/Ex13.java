import java.util.Scanner;

public class Ex13 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe a nota 1 do aluno: ");
    float n1 = in.nextFloat();
    System.out.println("Informe a nota 2 do aluno: ");
    float n2 = in.nextFloat();
    System.out.println("Informe a nota 3 do aluno: ");
    float n3 = in.nextFloat();
    float media;

    if (n1 >= n2 && n2 >= n3) {
      media = (n1 + n2) / 2;
    } else if (n1 >= n2 && n3 >= n2) {
      media = (n1 + n3) / 2;
    } else {
      media = (n2 + n3) / 2;
    }

    System.out.println("A media das duas notas mais altas é " + media);
  }
}
