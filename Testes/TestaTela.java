
public class TestaTela {
  public static void main(String[] args) {
    String nome;		
    int    idade;
    float  altura;

    nome = "Joao da Silva";
    idade = 30;
    altura = 1.75f; //tem que colocar f

    System.out.println();
    System.out.println("Oi " + nome + ", sua idade eh " + idade + " anos e voce tem " + altura + " metros de altura.\n");

    System.out.printf("Oi %s, sua idade eh %d anos e voce tem %4.2f metros de altura.\n\n", nome, idade, altura);

    System.out.printf("Mostrando um valor inteiro --- %8d --- \n", idade);
    System.out.printf("Mostrando um valor float   --- %8f --- \n", altura);
    System.out.printf("Mostrando um valor float   --- %8.2f ---\n", altura);
    System.out.printf("Mostrando um valor float   --- %-8.2f --- \n\n", altura);

    System.out.printf("Imprimindo caracteres especiais: \\ %% \" \' \n");
  }
}
