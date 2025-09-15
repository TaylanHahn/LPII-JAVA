package associacao4a;

public class Residencia {

  private String rua;
  private int numero;
  private Aluno aluno; //Atributo para implementar a navegabilidade no sentido de Residencia para Aluno.

  public Residencia(String rua, int numero, Aluno aluno) {
    setRua(rua);
    setNumero(numero);
    setAluno(aluno);
  }

  public String getRua() {
    return this.rua;
  }

  public void setRua(String rua) {
    if (rua==null) {
      //Lancando uma excecao.
      throw new RuntimeException("Erro Residencia: rua não pode ser null");
    }
    else if (rua.equals("")) {
      //Lancando uma excecao.
      throw new RuntimeException("Erro Residencia: rua não pode ser vazio");
    }
    else {
      this.rua = rua;
    }
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Aluno getAluno() {
    return this.aluno;
  }
  
 
  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
    aluno.adicionaResidencia(this);
  }

  @Override
  public String toString() {
    return "Residencia [rua=" + this.rua + ", numero=" + this.numero + "]";
  }
  

}//Residencia.