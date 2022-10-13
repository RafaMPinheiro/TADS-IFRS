import java.util.Scanner;

public class Ex3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe quantas pessoas vao ser checadas: ");
    int pessoas = in.nextInt();
    float[] altura = new float[pessoas];
    float[] peso = new float[pessoas];
    float[] IMC = new float[pessoas];
    String[] categorias = new String[pessoas];
    int abaixo = 0, normal = 0, sobre = 0, obe1 = 0, obe2 = 0, obe3 = 0;

    for (int i = 0; i < pessoas; i++) {
      System.out.println("Informe a altura e o peso: ");
      altura[i] = in.nextFloat();
      peso[i] = in.nextFloat();
      if (altura[i] == 0.0f) break;
    }

    for (int i = 0; i < pessoas; i++) {
      IMC[i] = peso[i] / (altura[i] * altura[i]);
    }

    for (int i = 0; i < pessoas; i++) {
      if (IMC[i] < 18.5f) {
        abaixo++;
        categorias[i] = "Abaixo do peso";
      } else if (IMC[i] >= 18.5f && IMC[i] < 25) {
        normal++;
        categorias[i] = "Peso normal";
      } else if (IMC[i] > 25 && IMC[i] < 30) {
        sobre++;
        categorias[i] = "Sobrepeso";
      } else if (IMC[i] >= 30 && IMC[i] < 35) {
        obe1++;
        categorias[i] = "Obesidade Grau I";
      } else if (IMC[i] >= 35 && IMC[i] < 40) {
        obe2++;
        categorias[i] = "Obesidade Grau II";
      } else if (IMC[i] >= 40) {
        obe3++;
        categorias[i] = "Obesidade Grau III";
      } else {
        categorias[i] = "Nao informado o peso ou altura!!";
      }
    }

    for (int i = 1; i <= pessoas; i++) {
      System.out.println(
        i +
        " - Altura: " +
        altura[i - 1] +
        " - Peso: " +
        peso[i - 1] +
        " - Categoria: " +
        categorias[i - 1]
      );
    }
  }
}
