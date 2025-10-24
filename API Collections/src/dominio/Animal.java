package dominio;

public class Animal {
  int    codigo;
  String nome;
  float  peso;
  
  public Animal(int c, String n, float p){
    this.codigo = c;
    this.nome = n;
    this.peso = p;
  }
  
  public String toString(){
    return this.codigo + " " + this.nome + " " + this.peso;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }
  
  
}//Animal.