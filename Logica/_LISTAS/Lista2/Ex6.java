import java.util.Scanner;

public class Ex6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe quantos anos, meses e dias voce tem: ");
    int anos = in.nextInt();
    int meses = in.nextInt();
    int dias = in.nextInt();

    int totalDias = (anos * 365) + (meses * 30) + dias;

    System.out.println("Voce tem " + totalDias + " dias vividos.");
  }
}
