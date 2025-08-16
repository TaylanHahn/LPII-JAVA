/* Exemplo para demonstrar a utilização de matrizes em java */
public class Array5{
  
  public static void main(String[] args){

    //Declarando uma matriz de floats.
    float[][]m1;
    
    //Declarando e criando uma matriz de floats.
    float[][]m2 = new float[3][4];
    
    //Declarando, criando e inicializando uma matriz de floats.
    float[][] m3 = { {10,  20,  30,  40},
                     {50,  60,  70,  80},
                     {90, 100, 110, 120}        
                   };
    
    float[][] q;         //Declarando uma matriz de floats.
    q = new float[3][4]; //Criando uma matriz de floats.
    //Inicializando a matriz q.
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        q[i][j] = (i+1)*10 + j;
      }
    }

    //Mostrando os dados da matriz q.
    System.out.print  (q[0][0] + "  ");
    System.out.print  (q[0][1] + "  ");
    System.out.print  (q[0][2] + "  ");
    System.out.println(q[0][3]);
    
    System.out.print  (q[1][0] + "  ");
    System.out.print  (q[1][1] + "  ");
    System.out.print  (q[1][2] + "  ");
    System.out.println(q[1][3]);
    
    System.out.print  (q[2][0] + "  ");
    System.out.print  (q[2][1] + "  ");
    System.out.print  (q[2][2] + "  ");
    System.out.println(q[2][3]);
    
    System.out.println();

    //Mostrando os dados da matriz q.
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        System.out.print(q[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println();
   
  }//main()
}//Array5.