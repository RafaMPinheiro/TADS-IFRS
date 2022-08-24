import java.util.Scanner;

public class ex6list3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String time1, time2;
    int golsTime1, golsTime2;

    System.out.println(
      "Informe o nome do time e a quantidade de gols marcado na partida: "
    );
    time1 = in.next();
    golsTime1 = in.nextInt();

    System.out.println(
      "Informe o nome do time e a quantidade de gols marcado na partida: "
    );
    time1 = in.next();
    golsTime1 = in.nextInt();

    if (golsTime1 > golsTime2) {
      System.out.println("Time " + time1 + "ganhou a partida");
    } else if (golsTime1 < golsTime2) {
      System.out.println("Time " + time2 + "ganhou a partida");
    } else {
      System.out.println("A partida deu empate");
    }
  }
}
