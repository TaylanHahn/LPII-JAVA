/* Exemplo para demonstrar estruturas de decisão if else aninhadas.
 */
import java.util.Scanner;

class TestaIf2 {
  public static void main(String[] args){
    float sal, tx, inss;
    Scanner t = new Scanner(System.in);
    
    System.out.print("Digite seu salario: ");
    sal = t.nextFloat();
    t.nextLine();
    
    if (sal <= 500) {
      tx = 9;
    }
    else {
      if (sal <= 1000) {
        tx = 10;
      }
      else {
        if (sal <= 1500) {
          tx = 11;
        }
        else {
          tx = 12;
        }
      }
    }
    inss = sal * tx / 100;
    
    System.out.println();
    System.out.format("%25s %10.1f%% \n",       "Taxa de INSS: ", tx);
    System.out.format("%25s %10.2f   \n", "Valor pago ao INSS: ", inss);    

    System.out.println();
    System.out.format("%-25s %9.1f%% \n",  "Taxa de INSS      : ", tx);
    System.out.format("%-25s %10.2f  \n", "Valor pago ao INSS: ", inss);    
  }//main()
  
}//TestaIf2.