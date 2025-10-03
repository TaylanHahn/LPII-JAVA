import java.text.ParseException;

public class TelaLeitura {
  private Teclado teclado = new Teclado();

  //-------------------------------------------------------------------------
  // Método leSalario1
  // Este método chama leFloat1() e não precisa capturar a exceção ParseException
  // pois o método leFloat1() já capturou essa exceção.
  //-------------------------------------------------------------------------
  public float leSalario1(String texto) {
    float sal=0;
    System.out.print(texto);
    sal = teclado.leFloat1();
    System.out.println("leSalario1(), sal = " + sal);
    System.out.println("Final de leSalario1().");
    return sal;
  }//leSalario1()

  //-------------------------------------------------------------------------
  // Método leSalario21
  // Este método chama leFloat2() que especifica ParseException na sua declaração.
  // Portanto, aqui deve ser cumprido o requerimento catch or specify. 
  // Foi adotada a opção de capturar a exceção ParseException.
  //-------------------------------------------------------------------------
  public float leSalario21(String texto) {
    float sal=0;
    System.out.print(texto);
    try {
      sal = teclado.leFloat2();
      System.out.println("leSalario21(), sal = " + sal);
    } catch (ParseException e) {
      System.out.println("Erro na leitura do salario 21.");
      //e.printStackTrace();
    }
    System.out.println("Final de leSalario21().");
    return sal;
  }//leSalario21()

  //-------------------------------------------------------------------------
  // Método leSalario22
  // Este método chama leFloat2() que especifica ParseException na sua declaração.
  // Portanto, aqui deve ser cumprido o requerimento catch or specify. 
  // Foi adotada a opção de especificar ParseException na declaração do método.
  //-------------------------------------------------------------------------
  public float leSalario22(String texto) throws ParseException {
    float sal;
    System.out.print(texto);
    sal = teclado.leFloat2();
    System.out.println("leSalario22(), sal = " + sal);
    System.out.println("Final de leSalario22().");
    return sal;
  }//leSalario22()

  //-------------------------------------------------------------------------
  // O método leFloat3() poderá lançar ArithmetcException (divisão por zero).
  // Digite zero para forçar esse erro.
  //-------------------------------------------------------------------------
  public float leSalario3(String texto) {
    float sal;
    System.out.print(texto);
    //leFloat3() poderá lançar ArithmetcException (divisão por zero).
    //Digite zero para forçar esse erro.
    sal = teclado.leFloat3();
    System.out.println("leSalario3(), sal = " + sal);
    System.out.println("Final de leSalario3().");
    return sal;
  }//leSalario3()

  //-------------------------------------------------------------------------
  // Tratamento de exceção com dois blocos catch.
  //-------------------------------------------------------------------------
  public float leSalario4(String texto) {
    float sal=0;
    System.out.print(texto);
    try {
      //Digite zero quando solicitada a leitura do número para gerar a exceção ArithmeticException.
      sal = teclado.leFloat4();
      System.out.println("leSalario4(), sal = " + sal);
    } catch (ParseException e) {
      System.out.println("Erro ao ler salario 4.");
    } catch (ArithmeticException e) {
      System.out.println("Erro ao efetuar a operação salario 4.");
    }
    System.out.println("Final de leSalario4().");
    return sal;
  }//leSalario4()

  //-------------------------------------------------------------------------
  public float leSalario51(String texto) {
    float sal=0;
    System.out.print(texto);
    try {
      sal = teclado.leFloat5();
      System.out.println("leSalario51(), sal = " + sal);
    }
    catch (RuntimeException e) {
      System.out.println("Erro na leitura do salario 51.");
    }
    System.out.println("Final de leSalario51().");
    return sal;
  }//leSalario51()

  //-------------------------------------------------------------------------
  public float leSalario52(String texto) {
    float sal=0;
    System.out.print(texto);
    sal = teclado.leFloat5();
    System.out.println("leSalario52(), sal = " + sal);
    System.out.println("Final de leSalario52().");
    return sal;
  }//leSalario52())

}//TelaLeitura.