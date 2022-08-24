import java.util.Scanner;

public class Problema1046 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int start, end, time;

    start = in.nextInt();
    end = in.nextInt();

    if (start >= end) {
      time = (24 - start) + end;
    } else {
      time = end - start;
    }
    System.out.printf("O JOGO DUROU %d HORA(S)\n", time);
  }
}
