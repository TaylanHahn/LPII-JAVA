package dominio;

public class Aluno extends Pessoa {
  private String curso;
  private int    semestre;
  
public Aluno(String nome, String cpf, Endereco endereco, String curso, int semestre) {
	super(nome, cpf, endereco);
	this.curso = curso;
	this.semestre = semestre;
}

public String getCurso() {
	return curso;
}

public void setCurso(String curso) {
	this.curso = curso;
}

public int getSemestre() {
	return semestre;
}

public void setSemestre(int semestre) {
	this.semestre = semestre;
}


@Override
public String toString() {
	return super.toString() + " Aluno [curso=" + curso + ", semestre=" + semestre + "] ";
}

//Sobrescrita de método (overriden).
//Este método já existe na superclasse Pessoa, mas foi re-implementado (sobrescrito) aqui.
//
//Este método foi criado somente para demonstração,
//lembrando que este não é o melhor local para implementação de um método 
//relativo à interface de usuário (tela).
  public void mostraDados() {
    System.out.println("============================================");
    super.mostraDados(); //Invoca o método mostraDados() da superclasse Pessoa.
    System.out.println("------------");
    System.out.println("Curso     : " + curso);
    System.out.println("Semestre  : " + semestre);
    System.out.println("============================================");
  }
  
}//Aluno.