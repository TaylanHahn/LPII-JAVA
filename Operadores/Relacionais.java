/*
  Exemplo para demonstrar os operadores relacionais e o tipo boolean.
*/
public class Relacionais {
  public static void main(String[] args) {
    int     a, b;
    boolean teste;
    a = 4;
    b = 5;
    
    System.out.println("a      = " + a);    
    System.out.println("a <  4 : " + (a < 4)  );
    System.out.println("a >  4 : " + (a > 4)  );    
    System.out.println("a <= 4 : " + (a <= 4) );
    System.out.println("a >= 4 : " + (a >= 4) );
    System.out.println("a == 4 : " + (a == 4) );
    System.out.println("a != 4 : " + (a != 4) );
    
    System.out.println();
    System.out.println("a      = " + a);
    System.out.println("b      = " + b);    
    System.out.println("a > b  : " + (a > b) );
    System.out.println("a < b  : " + (a < b) );
    System.out.println("a == b : " + (a == b) );
    System.out.println("a != b : " + (a != b) );
    
    System.out.println();
    System.out.println("Cuidado!!!");
    System.out.println("Isto aqui nao eh uma expressao relacional.");
    System.out.println("Isto aqui eh uma atribuicao.");
    System.out.println("a = b  : " + (a = b) );
    
    System.out.println();
    System.out.println("teste = (a > b)");
    teste = (a > b);
    System.out.println("valor da variavel teste = " + teste);
    
  }//main()
}//Relacionais.