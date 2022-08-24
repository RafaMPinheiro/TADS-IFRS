import java.util.Scanner;

public class ex15list2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int horasInicio, minInicio, horasFim, minFim;
    int totalMin, totalHrs;

    System.out.println("Informe o horario inicial: ");
    horasInicio = in.nextInt();
    minInicio = in.nextInt();

    System.out.println("Informe o horario final: ");
    horasFim = in.nextInt();
    minFim = in.nextInt();

    totalMin = minFim - minInicio;
    totalHrs = horasFim - horasInicio;

    if (totalHrs < 0) {
      totalHrs += 24;
    }

    if (totalMin < 0) {
      totalMin += 60;
      totalHrs--;
    }

    System.out.printf("%d : %d\n", totalHrs, totalMin);
  }
}
