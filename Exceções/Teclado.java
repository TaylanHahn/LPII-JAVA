import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParseException;

/*********************************************************
 * Demonstra exceções verificadas (checked exceptions) e 
 * exceções não verificadas (unchecked exceptions).
 * 
 * Os métodos leFloat1 e leFloat2 mostram o requerimento catch or specify
 * para as exceções verificadas (checked);
 * 
 * Os métodos leFloat3() e leFloat4() mostram a exceção ArithmeticExpection
 * que é do tipo não verificada (unchecked)
 * 
 *********************************************************/

//--------------------------------------------------------
public class Teclado {

  private Scanner scan;

  public Teclado(){
    scan = new Scanner(System.in);
  }

  //--------------------------------------------------------  
  public String leString(){
    return scan.nextLine();
  }

  //-------------------------------------------------------------------------  
  // Método leFloat1():
  // Demonstra um bloco try-catch.
  // Le uma String e tenta (try) converter para float. 
  // Captura a exceção verificada ParseException (caso ocorra). Assim, quem chamar
  // este método não precisará tratar (capturar) a exceção ParseException.
  // Em caso de ocorrer ParseException o método retornará zero no número lido. 
  //-------------------------------------------------------------------------
  public float leFloat1(){
    String aux;
    float f=0;
    aux = leString();
    try {
      f = NumberFormat.getInstance().parse(aux).floatValue(); 
    }
    catch (ParseException e) {
      System.out.println("Erro leFloat1(): Numero invalido!");
      f = 0; //nao precisaria pois a variavel ja foi inicializada, mas só para ficar mais didático.
    }
    //O programa chegará neste ponto mesmo que ocorra ParseException 
    //pois ela foi capturada pelo bloco try-catch acima.
    System.out.println("Final de leFloat1().");
    return f; 
  }//leFloat1()

  //-------------------------------------------------------------------------
  // Método leFloat2():
  // Demonstra a especificação de uma exceção (cláusula throws) na declaração do método.
  // Le uma String e tenta (try) converter para float. 
  // Não captura a exceção verificada ParseException, mas especifica (declara) a exceção 
  // ParseException na declaração do método.
  // Dessa forma, quem chamar este método deverá capturar ou especificar (catch or specify) ParseException. 
  // Em caso de ocorrer ParseException o método será abandonado no ponto que ocorreu a exceção (não retornando nenhum valor).
  //-------------------------------------------------------------------------
  public float leFloat2() throws ParseException{
    String aux;
    float f;
    aux = leString();
    f = NumberFormat.getInstance().parse(aux).floatValue();
    //Em caso de ParseException este ponto não será executado.
    System.out.println("Final de leFloat2().");
    return f; 
  }//leFloat2()

  //-------------------------------------------------------------------------
  // Método leFloat3():
  // Demonstra o bloco finally (sempre será executado).
  //-------------------------------------------------------------------------
  public float leFloat3() {
    String aux;
    float f=0;
    //Digite zero quando solicitada a leitura do número para 
    //simular um erro não previsto: ArithmeticException.
    aux = leString();
    try {
      f = NumberFormat.getInstance().parse(aux).floatValue();
      //Valor zero em f irá gerar uma ArithmeticException; 
      int y = 100/(int)f;
      System.out.println("Divisao y=100/f em leFloat3(). y = " + y);
    }
    catch (ParseException e) {
      System.out.println("Erro leFloat3(): Numero invalido!");
      f = 0; //nao precisaria pois a variavel ja foi inicializada, mas só para ficar mais didático.
    }
    finally {
      //Bloco finally sempre é executado, independentemente de ter sido gerada alguma exceção ou não.
      System.out.println("Bloco finally de leFloat3().");
    }
    //Este ponto será executado mesmo que ocorra ParseException, pois ela foi capturada pelo bloco try-catch.
    //Entretanto, se ocorrer ArithmeticException, este ponto não será executado, pois ArithmeticException não foi capturada.
    System.out.println("Final de leFloat3().");
    return f; 
  }//leFloat3()

  //-------------------------------------------------------------------------
  // Método leFloat4():
  // Este método pode lançar uma de duas exceções: ParseException ou ArithmeticException.
  //-------------------------------------------------------------------------
  public float leFloat4() throws ParseException{
    String aux;
    float f;
    //Digite zero quando solicitada a leitura do número para gerar a exceção ArithmeticException.
    aux = leString();
    f = NumberFormat.getInstance().parse(aux).floatValue();
    int y = 100/(int)f;
    System.out.println("Divisao y=100/f em leFloat4(). Digite zero para gerar ArithmeticException, y = " + y);
    System.out.println("Final de leFloat4().");
    return f; 
  }//leFloat4()

  //-------------------------------------------------------------------------  
  // Método leFloat5():
  // Captura a exceção verificada ParseException e lança 
  // a exceção não verificada RuntimeException, assim, 
  // quem chamar este método não precisa cumprir o requerimento catch or specify. 
  // Não é uma boa prática de programação se o único objetivo for esse (burlar o requerimento catch or specify).
  //-------------------------------------------------------------------------
  public float leFloat5(){
    String aux;
    float f;
    aux = leString();
    try {
      f = NumberFormat.getInstance().parse(aux).floatValue();
    }
    catch (ParseException e) {
      //Lança outra exceção e abandona método:
      throw new RuntimeException("Erro leFloat5(): Numero invalido!");
      //Este ponto nunca será executado.
      //System.out.println("catch de leFloat5()");
    }  
    //Em caso de ParseException este ponto não será executado, pois,
    //embora ParseException tenha sido capturada no bloco try-catch,
    //foi re-lançada uma outra exceção (neste caso RuntimeException).
    System.out.println("Final de leFloat5().");
    return f; 
  }//leFloat5()

}//Teclado.