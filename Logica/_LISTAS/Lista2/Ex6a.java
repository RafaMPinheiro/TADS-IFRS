import java.util.Calendar;
import java.util.Scanner;

public class Ex6a {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe quantos anos, meses e dias voce tem: ");
    int anos = in.nextInt();
    int meses = in.nextInt();
    int dias = in.nextInt();

    Calendar dataInicial = Calendar.getInstance();
    dataInicial.set(anos, meses, dias);
    Calendar dataFinal = Calendar.getInstance();

    int totalDias = Days.daysBetween(dataInicial, dataFinal).getDays();

    System.out.println("Voce tem " + totalDias + " dias vividos.");
  }
}
