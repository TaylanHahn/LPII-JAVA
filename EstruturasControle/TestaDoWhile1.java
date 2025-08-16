/* Exemplo para demonstrar a estrutura de repetição "do while".
 */
public class TestaDoWhile1 {
  
  public static void main(String[] args){
    int c;
    
    //Exemplo de laco "do while".
    c = 1;
    do  {
      System.out.println("c = " + c);
      c++;
    } while (c<=10);
    System.out.println("Ultimo = " + c);
    
  }//main()  
}//TestaDoWhile1.