import java.util.Scanner;

public class Ex7 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe a distância do trajeto e a velocidade media: ");
    int distancia = in.nextInt();
    int velocidade = in.nextInt();

    int tempoHrs = distancia / velocidade;
    int tempoMin = ((distancia % velocidade) * 60) / velocidade;

    System.out.printf("Levou %d : %d\n", tempoHrs, tempoMin);
  }
}
