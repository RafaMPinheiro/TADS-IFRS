import java.util.Scanner;

public class ex7list4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    final float PRECO_GASOLINA = 4.3f;
    final float PRECO_ALCOOL = 3.9f;
    float precoTotal, precoCombustivel, desconto;

    System.out.println("Qual combustível foi usado: ");
    char combustivel = in.next().charAt(0);
    //char se compara com (==)
    //String se compara com (equals)

    if (combustivel == 'A') {
      precoCombustivel = PRECO_ALCOOL;
    } else {
      precoCombustivel = PRECO_GASOLINA;
    }

    System.out.println("Quanto de combustível é desejado: ");
    float quant = in.nextFloat();

    if (combustivel == 'A' && quant <= 20) {
      desconto = 0.97f;
    } else if (combustivel == 'A') {
      desconto = 0.95f;
    } else if (combustivel == 'B' && quant <= 20) {
      desconto = 0.96f;
    } else {
      desconto = 0.94f;
    }

    precoTotal = precoCombustivel * quant * desconto;
    System.out.println("Preco a ser pago é: " + precoTotal);
    /*if (combustivel == 'A') {
      if (quant <= 20) {
        preco = (float) (quant * PRECO_ALCOOL * 0.97);
      } else {
        preco = (float) (quant * PRECO_ALCOOL * 0.95);
      }
    } else {
      if (quant <= 20) {
        preco = (float) (quant * PRECO_GASOLINA * 0.96);
      } else {
        preco = (float) (quant * PRECO_GASOLINA * 0.94);
      }
    }*/
  }
}
