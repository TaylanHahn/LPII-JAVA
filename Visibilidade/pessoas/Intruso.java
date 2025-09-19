package pessoas;

public class Intruso {
 
  public void tentaAcesso() {
    Pessoa p = new Pessoa();//Instancia um objeto da classe Pessoa.

    System.out.println(p.nome); //public: todo mundo tem acesso.
    System.out.println(p.sexo); //protected: pacote e sub-classes tem acesso. 
                                //Intruso está no mesmo pacote, embora não seja uma sub-classe.
    System.out.println(p.idade);//default: o pacote pessoas tem acesso.
    //System.out.println(p.codigo); //private: só a classe Pessoa tem acesso.
  }
  
}//Intruso.