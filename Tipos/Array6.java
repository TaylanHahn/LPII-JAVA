import java.sql.Array;
import java.util.Arrays;

/* Exemplo para demonstrar que em java não existe o tipo matriz,
 * mas sim, array de array. 
 */
public class Array6{

  public static void main(String[] args){

    //Declarando, criando e inicializando um array de array de floats.
    //o primerio elemento do array ax é um array com 3 elementos float
    //o segundo  elemento do array ax é um array com 2 elementos float
    //o terceiro elemento do array ax é um array com 4 elementos float
    float[][] ax = { {10, 20, 30}, 
                     {40, 50}, 
                     {60, 70, 80, 90} 
                   };

    //Mostrando os dados do array ax.
    System.out.print  (ax[0][0] + "  ");
    System.out.print  (ax[0][1] + "  ");
    System.out.println(ax[0][2]);

    System.out.print  (ax[1][0] + "  ");
    System.out.println(ax[1][1]);

    System.out.print  (ax[2][0] + "  ");
    System.out.print  (ax[2][1] + "  ");
    System.out.print  (ax[2][2] + "  ");
    System.out.println(ax[2][3]);
    
    System.out.println();

    //Usando dois laços para mostrar os elementos do array ax.
    for (int i=0; i<ax.length; i++) {
      float[] vf;
      vf = ax[i]; //pega o elemento do array ax, que é um vetor de float.
      for (int j=0; j<vf.length; j++) {
        System.out.print(vf[j] + "   ");
      }
      System.out.println();
    }
    System.out.println();

    
    //Usando dois laços "for especial" para mostrar os elementos do array ax.
    for (float[] vf: ax) {
      for (float f: vf) {
        System.out.print(f + "   ");
      }
      System.out.println();
    }
    System.out.println();

    //Array ax não pode ser acessado com o laço tradicional, pois ele não é uma matriz,
    //ele é um "array de array de floats".
    System.out.println("O array ax não pode ser acessado com o laço tradicional");
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        System.out.println("ax[" + i + "," + j + "] = " + ax[i][j]);
      }
    }
    System.out.println();
    
  }//main()
}//Array6.