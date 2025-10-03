import java.text.ParseException;

public class TestaExcecoes {

  public static void main(String[] args) throws ParseException  {
    float sal1, sal21, sal22=0, sal22b, sal3, sal4, sal51, sal52;

    TelaLeitura tela = new TelaLeitura();

    sal1 = tela.leSalario1("Digite o salario 1: ");

    sal21 = tela.leSalario21("Digite o salario 21: ");

    try {
      sal22 = tela.leSalario22("Digite o salario 22: ");
    } catch (ParseException e) {
      System.out.println("Erro na leitura do salario 22.");
    }

    sal22b = tela.leSalario22("Digite o salario 22b: ");

    //Digite zero quando solicitada a leitura do número para gerar a exceção ArithmeticException.
    sal3 = tela.leSalario3("Salario 3 (digite zero para gerar ArithmeticException): ");

    //Digite zero quando solicitada a leitura do número para gerar a exceção ArithmeticException.
    sal4 = tela.leSalario4("Salario 4 (digite zero para gerar ArithmeticException): ");

    sal51 = tela.leSalario51("Digite o salario 51: ");

    sal52 = tela.leSalario52("Digite o salario 52: ");

    System.out.println("sal1   = " + sal1);
    System.out.println("sal21  = " + sal21);
    System.out.println("sal22  = " + sal22);
    System.out.println("sal22b = " + sal22b);
    System.out.println("sal3   = " + sal3);
    System.out.println("sal4   = " + sal4);
    System.out.println("sal51  = " + sal51);
    System.out.println("sal52  = " + sal52);

  }//main()

}//TestaExcecoes.