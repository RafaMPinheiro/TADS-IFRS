import java.util.Scanner;

public class Ex8 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o numero de votos validos, brancos e nulos: ");
    int validos = in.nextInt();
    int brancos = in.nextInt();
    int nulos = in.nextInt();

    int total = validos + brancos + nulos;

    int percValidos = (100 * validos) / total;
    int percBrancos = (100 * brancos) / total;
    int percNulos = (100 * nulos) / total;

    System.out.println("Percentual de votos validos: " + percValidos + "%");
    System.out.println("Percentual de votos brancos: " + percBrancos + "%");
    System.out.println("Percentual de votos nulos: " + percNulos + "%");
  }
}
