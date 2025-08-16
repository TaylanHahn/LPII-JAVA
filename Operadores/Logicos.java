/*
  Exemplo para demonstrar os operadores logicos.
*/
public class Logicos {
  public static void main(String[] args) {
    int a, b;
    boolean v1, v2, v3, v4, v5, v6;
    
    a = 7;
    b = 18;

    v1 = (a >  5) && (b > 10);
    v2 = (a >  5) && (b > 20);
    v3 = (a > 10) || (b > 15);
    v4 = (a > 20) || (b > 30);
    v5 = v1 && v2;
    v6 = v1 || v2;
    
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("v1 = (a >  5) && (b > 10) : " + v1);
    System.out.println("v2 = (a >  5) && (b > 20) : " + v2);
    System.out.println("v3 = (a > 10) || (b > 15) : " + v3);
    System.out.println("v4 = (a > 20) || (b > 30) : " + v4);
    
    System.out.println("v5 = v1 && v2             : " + v5);
    System.out.println("v6 = v1 || v2             : " + v6);
    System.out.println("!v2                       : " + !v2); 
  }//main()
}//Logicos.