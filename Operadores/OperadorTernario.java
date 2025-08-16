/* Exemplo para demonstrar o operador lógico ternário ? :
 */
public class OperadorTernario {
  public static void main(String[] args){
    int valor1 = 10;
    int valor2 = 20;
    boolean condicao1 = true;
    boolean condicao2 = false;
    int resultado1, resultado2;
    
    resultado1 = condicao1 ? valor1 : valor2;
    resultado2 = condicao2 ? valor1 : valor2;
    
    System.out.println(resultado1);
    System.out.println(resultado2);
  }//main()
}//OperadorTernario.