
public class TestaTeclado2 {
  public static void main(String[] args) {
    Teclado2 t = new Teclado2();

    String nome;		
    int    idade;
    float  altura;

    System.out.print("Digite seu nome: ");
    nome = t.leString();

    System.out.print("Digite sua idade: ");
    idade = t.leInteiro();

    System.out.print("Digite sua altura (ex.: 1,75): ");
    altura = t.leFloat();

    System.out.println();    
    System.out.println("Oi " + nome + ", sua idade eh " + idade + " anos e voce tem " + altura + " metros de altura.\n");

    System.out.printf("Oi %s, sua idade eh %d anos e voce tem %4.2f metros de altura.\n\n", nome, idade, altura);
  }
}
