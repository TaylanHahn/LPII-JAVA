/* Exemplo para demonstrar que o tipo array é um tipo referencial */
public class Array2{
  
  public static void main(String[] args){
	//Declarando, criando e inicializando dois vetores de floats.
    float[] v = {100, 200, 300, 400, 500};
    float[] w = {10, 20, 30, 40, 50};

    w = v; //w aponta para o vetor v (não é uma cópia).

    //Modifica o vetor original (v).
    w[3] = 401;
    
    //Mostrando os dados do vetor w.
    //O vetor w na verdade referencia (aponta) o mesmo vetor v (não é uma cópia).
    for (int i=0; i<w.length; i++) {
      System.out.println("w[" + i + "] = " + w[i]);
    }
    System.out.println();

    //Mostrando os dados do vetor v.
    //Veja que o elemento v[3] foi modificado para 401 pois 
    //o vetor w na verdade referencia o mesmo vetor v (não é uma cópia).
    for (int i=0; i<v.length; i++) {
      System.out.println("v[" + i + "] = " + v[i]);
    }
    System.out.println();
    
  }//main()
}//Array2.