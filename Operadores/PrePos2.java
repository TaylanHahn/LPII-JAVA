/*
  Exemplo para demonstração dos operadores de pré e pós incremento.
*/
public class PrePos2 {
	
  public static void main(String[] args){
    int a, i;

    System.out.println("atribui i  = 7");
    i = 7;
    a = ++i + ++i; //8 + 9
    System.out.println("++i + ++i  = 8 + 9 = " + a); //17
    System.out.println("i                  = " + i); //9
    System.out.println();
    
    System.out.println("atribui i  = 7");
    i = 7;
    a = i++ + i++; //7 + 8
    System.out.println("i++ + i++  = 7 + 8 = " + a); //15
    System.out.println("i                  = " + i); //9
    System.out.println();
    
    System.out.println("atribui i  = 7");
    i = 7;
    a = ++i + i++; //8 + 8
    System.out.println("++i + i++  = 8 + 8 = " + a); //16
    System.out.println("i                  = " + i); //9
    System.out.println();

    System.out.println("atribui i  = 7");
    i = 7;
    a = i++ + ++i; //7 + 9    
    System.out.println("i++ + ++i  = 7 + 9 = " + a); //16
    System.out.println("i                  = " + i); //9
    System.out.println();
    
  }//main()
}//PrePos2.