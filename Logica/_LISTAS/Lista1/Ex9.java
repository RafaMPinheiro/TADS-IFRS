import java.util.Scanner;
import javax.sound.sampled.FloatControl;

public class Ex9 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe o numero de homens: ");
    int homens = in.nextInt();

    System.out.println("Informe o numero de mulheres: ");
    int mulher = in.nextInt();

    System.out.println("Informe o numero de criancas: ");
    int criancas = in.nextInt();

    float carneG = (homens * 400) + (mulher * 320) + (criancas * 200);
    carneG = (float) (carneG * 1.2);

    float carneKG = carneG / 1000;

    System.out.printf(
      "Eh necessário comprar %.1f kilo(s) de carne.\n",
      carneKG
    );
  }
}
