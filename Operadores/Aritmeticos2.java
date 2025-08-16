/* Exemplo para demonstrar os cuidados que devem
 * ser tomados ao realizar operações aritméticas.
 */
public class Aritmeticos2 {
  public static void main (String args[]) {
    int a = 5, b = 2, c, d;
    long x, y;
    
    System.out.println();
    a =  12345;
    b = 234567;
    c = a * b / b; // deveria ser igual à variavel a ( 12345)
    d = a / b * b; // também deveria ser igual à variável a.
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = a * b / b : " + c);
    System.out.println("d = a / b * b : " + d);
    
    x = a * b / b; //12345 * 234567 -> overflow -> resultado sem sentido (somente dígidos que couberem em 32 bits).
    y = a / b * b; //12345 / 234567 resultaria 0,052... mas com inteiro resulta zero.
    System.out.println("x = a * b / b : " + x);
    System.out.println("y = a / b * b : " + y); 
  
    System.out.println();
    x = (long)a * b / b; //agora operação é realizada em 64 bits (long). Resultado correto.
    y = (long)a / b * b; //a / b resulta zero, pois está fazendo operancao inteira (long).
    System.out.println("x = " + x);
    System.out.println("y = " + y);
   }//main()
}//Aritmeticos2.
