import java.util.Scanner;

public class Ex5 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe a temperatura em Fahrenheit: ");
    int fahrenheit = in.nextInt();

    int celsius = ((fahrenheit - 32) / 9) * 5;
    System.out.println("Celsius: " + celsius);
  }
}
