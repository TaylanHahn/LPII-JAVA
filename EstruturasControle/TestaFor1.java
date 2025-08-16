/* Exemplo para demonstrar a estrutura de repetição "for"
 * e a declaração de variáveis locais a um bloco.
 */
public class TestaFor1 {
  public static void main(String[] args){
    int c;
    
    //Testando for.
    for(c=1; c<11; c++){
      System.out.println("Contador c = " + c);
    }
    System.out.println("Ultimo c = " + c);
    System.out.println();    
    
    //Testando for.
    for(int i=1; i<11; i++){
      System.out.println("Contador i = " + i);
    }
    //Variavel i nao existe aqui fora.
    //System.out.println("Ultimo i = " + i);
    System.out.println();    
    
    //Declaração de um bloco.
    { int a=3; //variável declarada dentro de um bloco.
      System.out.println("a = " + a);
    }

    //Note que a variável <a> não existe neste ponto.
    //System.out.println("a = " + a);
    
  }//main()
}//TestaFor1.