import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    float base, altura, area, lado3;
    double perimetro;

    System.out.println("Informe a base e a altura: )");
    base = in.nextFloat();
    altura = in.nextFloat();

    area = base * altura;
    lado3 = (base * base) + (altura * altura);
    perimetro = base + altura + Math.sqrt(lado3);

    System.out.printf(
      "Área do retangulo: %.2f\nPerimetro do triangulo: %.2f\n",
      area,
      perimetro
    );
  }
}
