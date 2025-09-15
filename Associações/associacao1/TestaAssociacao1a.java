package associacao1;

//Este exemplo testa a associação opcional Aluno(0..*)-->(0..1)Residencia,
//mostrando que pode ser instanciado um Aluno sem nenhuma Residencia.
public class TestaAssociacao1a {

  public static void main(String[] args) {
    Aluno a1, a2, a3;
    Residencia r2, r3;

    System.out.println("=============== Etapa 1 ===============");
    //Instancia Aluno a1 sem associar a nenhuma Residencia: 
    a1 = new Aluno("Pedro", 6, 7);
    System.out.println(a1);

    System.out.println("=============== Etapa 2 ===============");
    //Instancia um Aluno (a2) e associa a uma Residencia (r2):
    //Insancia Aluno a2:
    a2 = new Aluno("Maria", 8, 9);
    System.out.println(a2);
    //Instancia residência r2:
    r2 = new Residencia("Rua abc", 200);
    //Associa Aluno a2 à Residencia r2:
    a2.setResidencia(r2);
    System.out.println(a2);
    
    //Declara outra variável para pegar a Residencia de um Aluno.
    //Poderia utilizar as variáveis r2 e r3, utilizou-se outra variável para facilitar o entendimento.
    Residencia r;
    
    //Pega a Residencia de a2 e imprime na tela.
    System.out.println("----- Pede para a2 a sua Residencia e imprime -----");
    r = a2.getResidencia();
    System.out.println("Rua    : " + r.getRua());
    System.out.println("Numero : " + r.getNumero());

    System.out.println("=============== Etapa 3.1 ===============");
    //Associa Aluno a3 à Residencia r3, instanciando primeiro a Residencia:
    //Instancia residência r3:
    r3 = new Residencia("Rua abc", 300);
    //Instancia Aluno a3:
    a3 = new Aluno("Carlos", 9, 9);
    //Associa Aluno a3 à Residencia r3:
    a3.setResidencia(r3);
    System.out.println(a3);

    //Pega a Residencia de a3 e imprime na tela.
    System.out.println("----- Pede para a3 a sua Residencia e imprime -----");
    r = a3.getResidencia();
    System.out.println("Rua    : " + r.getRua());
    System.out.println("Numero : " + r.getNumero());
    
    System.out.println("=============== Etapa 3.2 ===============");
    //Remove a Residência de a3, ou seja,
    //remove a associação de a3 para a sua Residencia.
    //Isso é feito atribuindo null para a residência de a3.
    //Isso é permitido, pois a associação implementada 
    //é opcional, ou seja, tem multiplicidade 0..1.
    a3.setResidencia(null);
    System.out.println("----- Removendo a Residencia de a3 -----");
    System.out.println(a3);
    
    //Note que o objeto Residencia ainda existe, só não está mais associado a a3.
    System.out.println("Rua    : " + r.getRua());
    System.out.println("Numero : " + r.getNumero());
    
    System.out.println("=============== Etapa 3.3 ===============");
    //Pega a Residencia de a3 (note que ela é null).
    r = a3.getResidencia();
    //Se existe a possibilidade de um objeto ser null, então devemos testar antes de usar o objeto:
    if (r == null) {
      System.out.println("Aluno sem Residencia.");
    }
    else {
      System.out.println("Rua    : " + r.getRua());
        System.out.println("Numero : " + r.getNumero());
    }
    
    //>>>>>>>>> ATENÇÃO<<<<<<<<<<<
    //Veja o que acontece se tentar interagir com um objeto null. 
    System.out.println("Rua    : " + r.getRua());  //<<<<<<<< Será lançada uma Exceção aqui.
    System.out.println("Numero : " + r.getNumero());

  }//main()
  
}//TestaAssociacao1a.