package outros;
import pessoas.*;

/*
  A classe Professor é descendente da classe Pessoa
mas está fora do pacote pessoas.
*/

public class Professor extends Pessoa {
  protected String titulo;
            int    cargaHoraria;
  private   int    codigo2;

  //Construtor da classe Professor
  public Professor(String n, char s, int i, int cod) {
    super(n, s, i, cod);
  }
  
  public void tentaAcesso() {
    System.out.println(this.nome); //public: todo mundo tem acesso.
    System.out.println(this.sexo); //protected: pacote e sub-classes tem acesso. Professor é uma sub-classe, embora não esteja no mesmo pacote.
    //System.out.println(this.idade);  //default: o pacote pessoas tem acesso. sub-classe fora do pacote não tem acesso.
    //System.out.println(this.codigo); //private: só a classe Pessoa tem acesso.
    
    //Um objeto Professor só tem acesso aos atributos public de um objeto Pessoa.
    Pessoa p = new Pessoa();
    p.nome   = "Joao";
    //p.sexo   = 'M'; //Nao tem acesso.
    //p.idade  = 30;  //Nao tem acesso.
    //p.codigo = 9;   //Nao tem acesso.

    //Um objeto Professor só tem acesso aos atributos public e protected
    //da superclasse de outro objeto Professor.
    Professor r = new Professor("P", 'M', 1, 1);
    r.nome = "João"; //public
    r.sexo = 'M';    //protected
    //r.idade = 30;  //default: Nao tem acesso.
    //r.codigo = 9;  //private: Nao tem acesso.
    
    //Mas tem acesso aos atributos protected, default e private de Professor.
    r.titulo = "Mestre"; //protected
    r.cargaHoraria = 40; //default
    r.codigo2 = 2;       //private
  }
  
  //Não pode ser diminuída a visibilidade.
  public void metodoPublico(){    
    System.out.println("metodoPublico() de Professor.");
  }

  //Não pode ser diminuída a visibilidade.
  protected void metodoProtected(){
    System.out.println("metodoProtected() de Professor.");
  }
  
  //Metodo default de subclasse que não está no mesmo pacote 
  //pode ser diminuída a visibilidade. 
  void metodoDefault(){
    System.out.println("metodoDefault() de Professor.");
  }
  
  //Qualquer método pode ser aumentada a visibilidade.  
  private void metodoPrivado(){
    System.out.println("metodoPrivado() de Professor.");
  }  
  
  public void metodos(){
    metodoPublico();
    metodoProtected();
    metodoDefault();
    metodoPrivado();
  }
  
}//Professor.