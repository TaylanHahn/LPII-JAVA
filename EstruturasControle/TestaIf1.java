/* Exemplo para demonstrar a estrutura de decisão if else.
 */
class TestaIf1 {
  public static void main(String[] args){
    int i = 20;
    
    //Estrutura IF sem bloco { }. Só funciona para um comando. 
    //Não é aconselhável usar.
    if (i >= 18)
      System.out.println("Maior de idade.");
    else
      System.out.println("Menor de idade.");
      
    //Estrutura IF com bloco { }. 
    //É aconselhável utilizar esta forma.
    if (i >= 18) {
      System.out.println("Maior de idade.");
    }
    else {
      System.out.println("Menor de idade.");
    }
  }//main()  
}//TestaIf1.