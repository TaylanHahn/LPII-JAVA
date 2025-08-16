/*
  Exemplo para testar objetos String.  
*/
public class String3 {
	
  public static void main(String[] args) {
    String s1 = "teste";
    String s2 = "teste";
    String s3;
    String s4;
   
    s3 = new String("teste");
    s4 = new String("teste");

    //Cuidado!!! Só funciona por acaso. 
    //Então nunca utilizar o == para comparar String.
    if (s1 == s2) {
      System.out.println("s1 eh igual a s2");
    }
    else {
      System.out.println("s1 nao eh igual a s2");
    }
    
    //Cuidado!!! Só funciona por acaso. 
    //Então nunca utilizar o == para comparar String.
    if (s1 == "teste") {
      System.out.println("s1 eh teste");
    }
    else {
      System.out.println("s1 nao eh teste");
    }
   
    //s3 e s4 são objetos diferentes.
    if (s3 == s4) {
      System.out.println("s3 eh igual a s4.");
    }
    else {
      System.out.println("s3 e s4 nao sao iguais.");
    }

    //Nao funciona.
    if (s3 == "teste") {
      System.out.println("s3 eh teste");
    }
    else {
      System.out.println("s3 nao eh teste");
    }

    //Nao funciona.
    if (s4 == "teste") {
      System.out.println("s4 eh teste");
    }
    else {
      System.out.println("s4 nao eh teste");
    }

    //Esta é a forma correta de comparar conteúdo de um objeto String.
    if (s3.equals("teste")) {
      System.out.println("s3 eh teste");
    }
    else {
      System.out.println("s3 nao eh teste");
    }

    //Esta é a forma correta de comparar conteúdo de um objeto String.
    if (s3.equals(s4)) {
      System.out.println("s3 e s4 sao iguais");
    }
    else {
      System.out.println("s3 e s4 nao sao iguais");
    }
    
  }//main()
  
}//String3.