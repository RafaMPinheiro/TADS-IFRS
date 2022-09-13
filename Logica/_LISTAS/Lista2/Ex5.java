import java.util.Scanner;

public class Ex5 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe os numeros: ");
    float numerador = in.nextFloat();
    float denominador = in.nextFloat();

    if (denominador == 0) {
      System.out.println(
        "Opss... nao eh possivel usar o zero como denominador."
      );
    } else {
      float resultado = numerador / denominador;
      System.out.println("A divisao desses numeros eh " + resultado + ".");
    }
  }
}
