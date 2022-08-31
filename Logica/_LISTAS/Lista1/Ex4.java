import java.util.Scanner;

public class Ex4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe a base e a altura: ");
    int base = in.nextInt();
    int altura = in.nextInt();

    int area = (base * altura) / 2;
    System.out.printf("Area: %d cm²\n", area);
  }
}
