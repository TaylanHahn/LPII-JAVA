/* Exemplo para demonstração da conversão implícita, 
 * promoção numérica e conversão explícita ou coerção (type casting).
 */
public class MudancaTipo {
  public static void main (String args[]) {
    int   a=7, b=2;
    float x=7, y=2;

    //Conversão feita implicitamente pelo compilador.
    //Converte o valor numérico da variável "a" para uma string 
    //para poder realizar a concatenação com o texto "a    = ".
    System.out.println("a     = " + a);
    System.out.println("b     = " + b);

    //Promoção numérica.
    System.out.println("Promocao numerica");
    System.out.println("x / b = " + (x / b)); //realiza uma divisao real, resulta 3.5
    System.out.println("a / y = " + (a / y)); //realiza uma divisao real, resulta 3.5
    System.out.println();

    //Conversão explícita ou coerção (type casting).
    System.out.println("Conversao explicita: Casting (ou type cast)");
    //realiza uma divisão real, resulta 3.5.
    System.out.println("(float)a / b   = " + ( (float)a / b)   ); 
    //realiza uma divisão inteira, resulta 3.
    System.out.println("(float)(a / b) = " + ( (float)(a / b)) + " !!!CUIDADO!!!");
    System.out.println();

    //realiza uma divisão inteira e atribui 3.0 para a variavel "x".
    x = a / b; 
    System.out.println("x = a / b " );
    System.out.println("x = " + x);
  }//main()
}//MudancaTipo.