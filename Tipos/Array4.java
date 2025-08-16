/* Preenche um vetor com valores aleatórios. 
 * Soma os valores do vetor.
 * Mostra os valores do vetor na ordem inversa.
 */
public class Array4{
  public static void main(String[] args){
    double[] v = new double[5];
    double soma=0;
    
    //Gera um vetor com números aleatórios.
    System.out.println("Gerando valores aleatórios.");
    for (int i=0; i<v.length; i++) {
      v[i] = Math.random() * 10;
      soma = soma + v[i];
      System.out.println(v[i]);
    }
    System.out.println();    
    System.out.println("Soma = " + soma);
    System.out.println();

    //Mostra o vetor na ordem inversa.
    for (int i=v.length-1; i>=0; i--) {
      System.out.println("v[" + i + "] = " + v[i]);
    }
    
  }//main()
}//Array4.