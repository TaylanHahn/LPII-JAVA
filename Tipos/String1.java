/*
  Exemplo para testar objetos String e alguns de seus métodos.
*/
public class String1 {
  
  public static void main(String[] args) {
    String s1, s2;
    
    s1 = new String("Casa Azul");

    System.out.println("A string eh                     : " + s1);
    s1.concat(" claro");
    System.out.println("A string eh                     : " + s1);
    s2 = s1.concat(" claro");
    System.out.println("A string eh                     : " + s2);
    System.out.println("O quarto caractere eh           : " + s1.charAt(3));
    System.out.println("O comprimento da string eh      : " + s1.length());
    System.out.println("A palavra Azul comeca na posicao: " + s1.indexOf("Azul"));
    System.out.println("A palavra AzuL comeca na posicao: " + s1.indexOf("AzuL"));    
    System.out.println("substring(1, 7)                 : " + s1.substring(1, 7));
    System.out.println("s1.compareTo(\"Casa Azul\")     : " + s1.compareTo("Casa Azul"));
    System.out.println("s1.compareTo(\"Casa Branca\")   : " + s1.compareTo("Casa Branca"));
    System.out.println("s1.compareTo(\"Casa Amarela\")  : " + s1.compareTo("Casa Amarela"));    
    
    System.out.println();
    System.out.print("O comprimento da frase \"Casa azul\" eh: ");
    System.out.println("Casa azul".length());
    
    System.out.println(" \" \\ \' ");

  }//main()
}//String1.