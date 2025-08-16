import java.util.Scanner;

public class TestaWhile2{

  public static void main(String[] args) {
    float nota, media, soma=0;
    char   resp = 'S';
    int c=0;
    Scanner t = new Scanner(System.in);

    //Le as notas.
    while ( (resp=='S') | (resp=='s') ) {
      System.out.print("Digite a nota: ");
      nota = t.nextFloat();
      t.nextLine(); //para remover o ENTER do Scanner.
      soma = soma + nota;
      c++;      
      System.out.print("Deseja ler outra nota (S/N)? ");
      resp = t.nextLine().charAt(0);
    } //while
    
    media = soma / c; 

    System.out.println();
    System.out.printf("A soma das notas eh : %5.2f \n", soma);
    System.out.printf("Quantidade de notas : %5d   \n", c);    
    System.out.printf("A media das notas eh: %5.2f \n", media);
  }//main().
  
} //TestaWhile2.