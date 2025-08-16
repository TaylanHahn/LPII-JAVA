/* Exemplo para demonstração dos operadores aritméticos + - * / %
 */
public class Aritmeticos1 {
  public static void main (String args[]) {
    int   a=7, b=2, c, d;
    float x=7, y=2;

    System.out.println("a     = " + a);
    System.out.println("b     = " + b);
    //erro de compilacao. variavel nao inicializada.
    //System.out.println("c     = " + c);
    //System.out.println("d     = " + d);
    System.out.println("x     = " + x);
    System.out.println("y     = " + y);
    System.out.println();

    System.out.println("(-b)  = " + (-b));
    System.out.println("-b    = " + -b);
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b)); //realiza uma divisao inteira, resulta 3.    
    System.out.println("x / y = " + (x / y)); //realiza uma divisao real, resulta 3.5
    System.out.println("a % b = " + (a % b)); //módulo (resto da divisão inteira de a / b).    
    System.out.println("x % y = " + (x % y)); //módulo (resto da divisão inteira de x / y).    
    System.out.println(); 
  }//main()
}//Aritmeticos1.
