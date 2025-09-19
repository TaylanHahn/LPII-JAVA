package pessoas;

public class Aluno extends Pessoa {
 
  //Construtor da classe Aluno
  public Aluno(String n, char s, int i, int cod) {
    super(n, s, i, cod);
  }
  
  public void tentaAcesso() {
    System.out.println(this.nome); //public: todo mundo tem acesso.
    System.out.println(this.sexo); //protected: pacote e sub-classes tem acesso. 
                                   //Aluno está no pacote e é uma sub-classe.
    System.out.println(this.idade);//default: o pacote pessoas tem acesso.
    //System.out.println(this.codigo); //private: só a classe Pessoa tem acesso.
    System.out.println(this.getCodigo());
    
    //Um objeto Aluno pode modificar os atributos public, protected e default
    //de outro objeto Pessoa.
    Pessoa p = new Pessoa();
    p.nome   = "Joao"; //public
    p.sexo   = 'M';    //protected
    p.idade  = 30;     //default
    //p.codigo = 9;    //private: Nao tem acesso.
    
    //Um objeto Aluno pode modificar os atributos public, protected e default
    //de outro objeto Aluno.
    Aluno a = new Aluno("João", 'M', 30, 9);
    a.nome   = "Joao"; //public
    a.sexo   = 'M';    //protected
    a.idade  = 30;     //default
    //a.codigo = 9;    //private: Nao tem acesso.
  }

  //Não pode ser diminuída a visibilidade.
  public void metodoPublico(){
    System.out.println("metodoPublico() de Aluno.");
  }

  //Não pode ser diminuída a visibilidade.
  protected void metodoProtected(){
    System.out.println("metodoProtected() de Aluno.");
  }
  
  //Não pode ser diminuída a visibilidade.
  void metodoDefault(){
    System.out.println("metodoDefault() de Aluno.");
  }
  
  //Qualquer método pode ser aumentada a visibilidade.  
  private void metodoPrivado(){    
    System.out.println("metodoPrivado() de Aluno.");
  }
  
  public void metodos(){
    metodoPublico();
    metodoProtected();
    metodoDefault();
    metodoPrivado();
  }
  
}//Aluno.