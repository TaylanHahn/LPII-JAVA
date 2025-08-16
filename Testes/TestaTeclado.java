
public class TestaTeclado {
	public static void main(String[] args) {
		
    String nome;    
    int    idade;
    float  altura;

    System.out.print("Digite seu nome: ");
    nome = Teclado.leString();
    
    System.out.print("Digite sua idade: ");
    idade = Teclado.leInteiro();
    
    System.out.print("Digite sua altura (ex.: 1,75): ");
    altura = Teclado.leFloat();
    
    System.out.println();
    System.out.printf("Oi %s, sua idade eh %d e voce tem %f metros de altura.\n\n", nome, idade, altura);
    
    System.out.printf("Mostrando um valor inteiro --- %10d --- \n", idade);
    System.out.printf("Mostrando um valor float   --- %10f --- \n", altura);
    System.out.printf("Mostrando um valor float   --- %10.2f ---\n", altura);
    System.out.printf("Mostrando um valor float   --- %-10.2f --- \n\n", altura);
    
    System.out.printf("Imprimindo caracteres especiais: \\ %% \" \' \n");
  }
}
