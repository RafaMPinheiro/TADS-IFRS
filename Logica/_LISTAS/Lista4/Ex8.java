import java.util.Scanner;

public class Ex8 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 0;
    float valorEstoque = 0;

    System.out.println("Informe quantos tipos de mercadoria tem: ");
    int tipos = in.nextInt();
    System.out.println("Informe quantidade de produto no seu estoque: ");
    int estoque = in.nextInt();

    while (n < tipos) {
      n++;

      System.out.printf(
        "Quantos produtos tem da %d mercadoria e seu preço: ",
        n
      );
      int produtos = in.nextInt();
      float preco = in.nextFloat();

      valorEstoque += (produtos * preco);
    }

    float mediaPreco = valorEstoque / estoque;
    System.out.printf(
      "O valor total de estoque é de %.2f R$ e a media dos valores dos produtos é de %.2f R$.\n",
      valorEstoque,
      mediaPreco
    );
  }
}
