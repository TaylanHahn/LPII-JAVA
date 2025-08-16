/*
  Exemplo para demonstrar os operadores de deslocamento >> e <<.  
*/
public class Deslocamentos {
  public static void main(String[] args) {
    int a, b;
   
    a = 8;
    System.out.println("a = " + a);
    
    b = a<<1;    
    System.out.println("b = a << 1 : " + b);
    
    b = a<<3;
    System.out.println("b = a << 3 : " + b);
    
    b = a>>2;
    System.out.println("b = a >> 2 : " + b);

    System.out.println();
    
    a = 7;
    System.out.println("a = " + a);

    b = a << 1;
    System.out.println("b = a << 1 : " + b);

    b = a >> 1;
    System.out.println("b = a >> 1 : " + b);
    
  }//main()
}//Deslocamentos.