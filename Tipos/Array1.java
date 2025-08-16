/* Exemplo para demonstrar o tipo array.
 * - Declarando um array
 * - Inicializando um array
 * - Acessando os valores
 * - Atributo length e laço de repetição
 */
public class Array1{
  
  public static void main(String[] args){
    //declarando um array (vetor) de floats.
    float[] v;

    //criando o array com 5 elementos float.
    v = new float[5];
    
    //inicializando o array.
    v[0] = 100;
    v[1] = 200;
    v[2] = 300;
    v[3] = 400;
    v[4] = 500;
    
    //Somando os elementos do array.
    float soma;
    soma = v[0] + v[1] + v[2] + v[3] + v[4];
    
    //Mostrando os valores do array na ordem inversa.
    System.out.println("Imprimindo o vetor v na ordem inversa:");
    System.out.println("v[4] = " + v[4]);
    System.out.println("v[3] = " + v[3]);
    System.out.println("v[2] = " + v[2]);
    System.out.println("v[1] = " + v[1]);
    System.out.println("v[0] = " + v[0]);

    System.out.println("Soma = " + soma);
    System.out.println();
    
    //declarando e inicializando um array de floats.
    float[] w = {100, 200, 300, 400, 500};
    
    //Mostrando os dados do vetor w usando um laço de repetição.
    System.out.println("Imprimindo o vetor w:");
    for (int i=0; i<w.length; i++) {
      System.out.println("w[" + i + "] = " + w[i]);
    }
    
  }//main()
}//Array1.