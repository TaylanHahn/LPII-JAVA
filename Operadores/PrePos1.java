/*
  Exemplo para demonstração dos operadores de pré e pós incremento.
*/
public class PrePos1 {
	
  public static void main(String[] args){
    int i = 3;
    
    System.out.println("print(i)   = " + i);   //imprime "3"
    i++; //pós-incremento                      //i=4
    System.out.println("Executou i++");
    System.out.println("print(i)   = " + i);   //imprime "4"
    ++i; //pré-incremento                      //i=5
    System.out.println("Executou ++i");
    System.out.println("print(i)   = " + i);   //imprime "5"
    System.out.println();
    
    System.out.println("Procure nao utilizar estas formas:");
    System.out.println("print(++i) = " + ++i); //i=6 imprime "6"
    System.out.println("print(i)   = " + i);   //    imprime "6"    
    System.out.println("print(i++) = " + i++); //    imprime "6"  i=7
    System.out.println("print(i)   = " + i);   //    imprime "7"
  }//main()
}//PrePos1.