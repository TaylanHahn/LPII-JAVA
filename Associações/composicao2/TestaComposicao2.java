package composicao2;

import java.util.List;

//Este exemplo mostra uma associação do tipo composição multivalorada entre Aluno->(0..*)Residencia.
public class TestaComposicao2 {

  public static void main(String[] args) {
    Aluno a1;
  
    System.out.println("=============== Etapa 1 ===============");
    //Instancia um aluno.
    a1 = new Aluno("Jose", 8, 9);
    System.out.println(a1);
    
    //Solicita ao aluno a adição de duas Residencia. O próprio objeto a1 irá instanciar as Residencia
    //pois se trata de um relacionamento do tipo composição.
    a1.adicionaResidencia("Rua Abc", 100);
    a1.adicionaResidencia("Rua Xyz", 200);

    System.out.println("=============== Etapa 2 ===============");
    //Solicita ao aluno as suas residencias. Na verdade será retornada uma cópia das Residencia.
    List<Residencia> residencias;
    residencias = a1.getCopiaResidencias();
    for (Residencia r: residencias) {
      System.out.println(r);  
    }
    
    System.out.println("=============== Etapa 3 ===============");
    //Modifica as residencias que foram retornadas pelo aluno.
    for (Residencia r: residencias) {
      r.setNumero(9);
      System.out.println(r);  
    }

    System.out.println("=============== Etapa 4 ===============");
    //Solicita novamente as residencias do aluno. 
    //Pode ser verificado que as residencias não foram modificadas, o que está correto.
    residencias.clear();
    residencias = a1.getCopiaResidencias();
    for (Residencia r: residencias) {
      System.out.println(r);  
    }
    
  }//main()

}//TestaComposicao2.