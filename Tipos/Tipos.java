/*
  Exemplo para demonstração dos tipos primitivos do java.
 */
public class Tipos {
  public static void main(String[] args){
  //Valores máximos permitidos em cada tipo.
  byte   b1 = 127;                  //mínimo = -128
  short  s1 = 32767;                //mínimo = -32768 
  int    i1 = 2147483647;           //mínimo = -2147483648 
  long   l1 = 9223372036854775807L; //mínimo = -9223372036854775808L
  
  //de 0 a 65535.
  char   c1 = 68; //68 = letra D. 

  float  f1 = 3.40282347e38F;
  double d1 = 1.79769313486231570e308;
  
  boolean bol1 = true; //ou false.
  
  System.out.println(b1);
  System.out.println(s1);
  System.out.println(i1);
  System.out.println(l1);
  System.out.println(c1);
  System.out.println(f1);
  System.out.println(d1);
  System.out.println(bol1);
  }//main()
}//Tipos.
