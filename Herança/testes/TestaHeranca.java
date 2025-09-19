package testes;

import dominio.Aluno;
import dominio.Endereco;
import dominio.Professor;

public class TestaHeranca{
  public static void main(String[] args){
    Endereco e;

    //Instancia um Professor.
    e = new Endereco("Rua abc", 100, "apto 101", "Centro");
    Professor r  = new Professor("Jose", "111.111.111-11", e);
    r.setFormacao("Mestre");
    r.setCargaHoraria(40);

    //Instancia um Aluno.
	e = new Endereco("Rua Xyz", 200, "apto 202", "Centro");
    Aluno     a  = new Aluno("Maria", "222.222.222-22", e, "Biologia", 1);
    
    System.out.println("Professor: " + r);
    System.out.println("Aluno    : " + a);
    System.out.println();
    
    System.out.println("============================================");
    System.out.println("Dados do professor r:");
    r.mostraDados();
    
    System.out.println("============================================");
    System.out.println("Dados do aluno a:");
    a.mostraDados(); 
    System.out.println();

  }//main()
  
}//TestaHeranca.