/*
  Exemplo para testar objetos String.
  Método equals(String).
*/
public class String2 {
	
  public static void main(String[] args) {
    String s3;
    String s4;
   
    s3 = new String("teste");
    s4 = new String("teste");
   
    //1) Não usar esta forma. Não são iguais.
    if (s3 == s4) {
      System.out.println("s3 eh igual a s4.");
    }
    else {
      System.out.println("s3 e s4 nao sao iguais.");
    }

    s3 = s4;
    //2) Não usar esta forma. São iguais.
    if (s3 == s4) {
      System.out.println("s3 eh igual a s4.");
    }
    else {
      System.out.println("s3 e s4 nao sao iguais.");
    }

    //3) Não usar esta forma. Cuidado: será criada uma nova instância para s4.
    s4 = "teste";
    if (s3 == s4) {
      System.out.println("s3 eh igual a s4.");
    }
    else {
      System.out.println("s3 e s4 nao sao iguais.");
    }

    //4) Nao funciona.
    if (s3 == "teste") {
      System.out.println("s3 eh teste");
    }
    else {
      System.out.println("s3 nao eh teste");
    }

    //5) Nao funciona.
    if (s4 == "teste") {
      System.out.println("s4 eh teste");
    }
    else {
      System.out.println("s4 nao eh teste");
    }

    //6) Esta é a forma correta para comparar conteúdo de um objeto String.
    if (s3.equals("teste")) {
      System.out.println("s3 eh teste");
    }
    else {
      System.out.println("s3 nao eh teste");
    }

    //7) Esta é a forma correta para comparar conteúdo de um objeto String.
    if (s3.equals(s4)) {
      System.out.println("s3 e s4 sao iguais");
    }
    else {
      System.out.println("s3 e s4 nao sao iguais");
    }
    
  }//main()
  
}//String2.