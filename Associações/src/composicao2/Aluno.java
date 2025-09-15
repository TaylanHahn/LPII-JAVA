package composicao2;

import java.util.ArrayList;
import java.util.List;

//Esta classe implementa a associação do tipo composição Aluno()-->(0..*)Residencia.
//Observe que se trata de uma associação multivalorada opcional de Aluno para Residencia, ou seja, 
//um objeto Aluno pode conter zero ou vários objetos do tipo Residencia.
//E mais, como se trata de uma composição, é o próprio objeto Aluno que instancia o seu objeto Residencia.
// Além disso, cada objeto Residencia só pode estar associado a um unico Aluno
//e somente o objeto Aluno pode ter acesso aos seus objetos Residencia. 
//Por isso não foi implementado o método getResidencias(), mas sim, um método getCopiaResidencias() para retornar
//uma cópia dos objetos Residencia e não os próprios objetos Residencia, pois, se assim fosse feito,
public class Aluno {
  private String  nome;
  private float   nota1;
  private float   nota2;
  private List<Residencia> residencias = new ArrayList<Residencia>();

  //Construtor de aluno.
  public Aluno(String n, float n1, float n2) {
    setNome(n);
    setNota1(n1);
    setNota2(n2);
  }

  //Este método recebe os parâmetros para instanciar uma Residencia, 
  //instancia a Residencia e associa ao objeto Aluno.
  public void adicionaResidencia(String rua, int numero) {
    if (rua == null) {
      new RuntimeException("Erro Aluno: Rua nao pode ser null");
    }
    else {
      Residencia r;
      r = new Residencia(rua, numero);
      this.residencias.add(r);
    }
  }

  //Este método retorna uma cópia da lista de Residencia do Aluno, assim, outros objetos podem solicitar os dados das Residencia
  //do Aluno mas não poderão modificar esses dados, já que eles estão recebendo uma cópia dos objetos Residencia e 
  //não os próprios objetos Residencia do Aluno.
  public List<Residencia> getCopiaResidencias() {
    List<Residencia> copia_lista_residencia = new ArrayList<Residencia>();
    //Percorre todas as Residencia do aluno.
    for (Residencia r: this.residencias) {
      //Cria uma cópia da Residencia r;
      Residencia r_copia = r.copia();
      //Adiciona a cópia na lista a ser retornada.
      copia_lista_residencia.add(r_copia);
    }
    return copia_lista_residencia;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    if (nome == null) {
      //Lancando um excecao.
      new RuntimeException("Erro Aluno: nome nao pode ser null");
    }
    else if (nome.equals("")) {
      //Lancando um excecao.
      new RuntimeException("Erro Aluno: nome nao pode ser vazio");
    }
    else {
      this.nome = nome;
    }
  }

  public float getNota1() {
    return this.nota1;
  }

  public void setNota1(float nota1) {
    if ( (nota1 >= 0) && (nota1 <= 10) ) {
      this.nota1 = nota1;
    }
    else {
      //Lancando um excecao.
      throw new RuntimeException("Erro Aluno: Nota 1 invalida="+nota1+".");
    }
  }

  public float getNota2() {
    return this.nota2;
  }

  public void setNota2(float nota2) {
    if ( (nota2 >= 0) && (nota2 <= 10) ) {
      this.nota2 = nota2;
    }
    else {
      //Lancando um excecao.
      throw new RuntimeException("Erro Aluno: Nota 2 invalida="+nota2+".");
    }
  }

  public float media(){
    float m;
    m = (this.nota1 + this.nota2) / 2;
    return m;
  }

  public String situacao() {
    if (media() < 3) {
      return "REPROVADO";
    }
    else if ( media()< 7 ) {
      return "RECUPERACAO";
    }
    else {
      return "APROVADO";
    }
  }

  @Override
  public String toString() {
    return "Aluno [nome=" + this.nome + ", nota1=" + this.nota1 + ", nota2=" + this.nota2
        + ", residencia=" + this.residencias + "]";
  }

}//Aluno.