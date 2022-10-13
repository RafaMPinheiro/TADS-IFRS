import java.util.Scanner;

public class Ex1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe quantos funcionarios tem na empresa: ");
    int funcionarios = in.nextInt();

    int[] matricula = new int[funcionarios];
    int[] idade = new int[funcionarios];
    String[] sexo = new String[funcionarios];
    String[] concursado = new String[funcionarios];
    float[] altura = new float[funcionarios];

    for (int i = 0; i < funcionarios; i++) {
      System.out.println(
        "matricula, idade, sexo [M/F], altura e concursado [S/N]: "
      );
      matricula[i] = in.nextInt();
      idade[i] = in.nextInt();
      sexo[i] = in.next();
      altura[i] = in.nextFloat();
      concursado[i] = in.next();

      if (funcionarios - i == 1) {
        matricula[i] = 0;
      }
    }

    for (int i = 0; i < funcionarios; i++) {
      System.out.print(
        "\n" +
        matricula[i] +
        " " +
        idade[i] +
        " " +
        sexo[i] +
        " " +
        altura[i] +
        " " +
        concursado[i]
      );
    }

    int concursadas = 0, concursados = 0, homens = 0, homens40 =
      0, maiorIdadeH = idade[0], mulheresSemC = 0;

    float somaAltura = 0, mediaAltura;

    for (int i = 0; i < funcionarios - 1; i++) {
      if (sexo[i].equals("F")) {
        if (concursado[i].equals("S")) concursadas++;
        if (concursado[i].equals("N") && idade[i] > 30) mulheresSemC++;
      }

      if (sexo[i].equals("M")) {
        homens++;
        if (concursado[i].equals("S") && idade[i] > maiorIdadeH) {
          maiorIdadeH = idade[i];
        }
        if (idade[i] < 40) {
          somaAltura += altura[i];
          homens40++;
        }
      }

      if (concursado[i].equals("S")) concursados++;
    }

    mediaAltura = somaAltura / homens40;

    System.out.printf(
      "\nO numero de funcionarias concursadas: %d \no numero de funcionarios (somente homens): %d \na maior idade dos homens concursados: %d \na quantidade de mulheres com mais de 30 anos sem concurso: %d \na quantidade de concursados(as): %d \na media das alturas dos homens com menos de 40 anos: %.2f \n",
      concursadas,
      homens,
      maiorIdadeH,
      mulheresSemC,
      concursados,
      mediaAltura
    );
  }
}
