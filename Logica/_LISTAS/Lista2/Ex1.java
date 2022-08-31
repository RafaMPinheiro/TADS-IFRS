import java.util.Scanner;

public class Ex1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    float metros, centimetros;

    System.out.println("Informe o dado: (metros)");
    metros = in.nextFloat();

    centimetros = metros * 100;

    System.out.printf(
      "%.2f metro(s) é %.2f em centimetro(s).\n",
      metros,
      centimetros
    );
  }
}
