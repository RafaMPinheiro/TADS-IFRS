import java.util.Scanner;

public class Ex4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int num = in.nextInt();
    int[] valor = new int[num];

    for (int i = 0; i < num; i++) {
      valor[i] = i + 1;
    }
  }
}
