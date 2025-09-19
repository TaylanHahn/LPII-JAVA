package outros;
import pessoas.*;

public class TestaVisibilidade2{
  public static void main(String[] args){
    //Declara e instancia objetos.
    Pessoa    p = new Pessoa("Pes", 'M', 30, 9);
    Aluno     a = new Aluno("Alu", 'M', 30, 9);
    Professor r = new Professor("Prof", 'M', 30, 9);

    p.nome = "Pes"; //publico: pode ser acessado por qualquer um.
    //p.sexo = 'M'; //protegido: somente pacote pessoas ou sub-classes de Pessoa.
    //p.idade = 30; //default: só poderá ser acessado no pacote pessoas.
    //p.codigo = 2; //privado: só pode ser acessado pela própria classe Pessoa.

    a.nome = "Alu";    //publico: pode ser acessado por qualquer um.
    //a.sexo = 'M';    //protegido: somente pacote pessoas ou sub-classes de Pessoa.
    //a.idade = 35;    //default: só poderá ser acessado no pacote pessoas.
    //a.codigo = 3;    //privado: só pode ser acessado pela própria classe Pessoa.

    r.nome = "Prof";   //publico: pode ser acessado por qualquer um.
    //r.sexo = 'M';    //protegido: somente pacote pessoas ou sub-classes de Pessoa.
    //r.idade = 40;    //default: só poderá ser acessado no pacote pessoas.
    //r.codigo = 4;    //privado: só pode ser acessado pela própria classe Pessoa.
    //r.codigo2 = 5;   //privado: só pode ser acessado pela própria classe Professor.
    
    //Esses dois atributos podem ser acessados 
    //pois as classes UsaAluno e Professor estão no mesmo pacote.
    r.titulo = "Mestre"; //protegido: pacote (e sub-classes) tem acesso.
    r.cargaHoraria = 40; //default: pacote tem acesso.
    
    p.metodos();
    a.metodos();
    r.metodos();
  }
}//TestaVisibilidade2.