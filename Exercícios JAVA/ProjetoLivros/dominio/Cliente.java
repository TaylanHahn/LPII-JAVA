package dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente  {
  // atributos
  private String nome;

  //Livros que o Cliente tem em mãos (locados).
  private List<Livro> livros = new ArrayList<Livro>();	

  //construtor
  public Cliente (String nome){
    this.nome=nome;
  }

  public String getNome() {
    return nome;
  }

  public List<Livro> getLivros() {
    return livros;
  }

  public void locaLivro(Livro livro) {
    //Testa se o livro está disponível, assim garante a multiplicidade 0..1.
	if (livro.getDisponivel()) {
        this.livros.add(livro);
        livro.setDisponivel(false);
      }
  }

  public void devolveLivros() {
    for (Livro l: livros) {
      l.setDisponivel(true);
    }
    livros.clear();
  }

  //Caso não conseguisse implementar o método devolveLivros(), 
  //poderia tentar outra estratégia, como esta abaixo.
  /*
	public void devolveLivro(Livro livro) {
		int i;
		i = livros.indexOf(livro);
		//Se o cliente estah com o livro locado entao devolve o livro.
		if (i != -1) {
			this.livros.remove(livro);
			livro.setDisponivel(true);
		}
	}*/

  public int quantidadeLivros() {
    return livros.size();
  }

  public float desconto() {
    //Por enquanto este método está retornando zero, pois as sub-classes é que são responsáveis por calcular o desconto.
    //Na próxima versão este método será transformado em método abstrato (essa é a forma mais adequada).
    return 0;
  }

  public float valorTotalDevido() {
    float total = 0;

    //calcular R$ 2,00 para cada livro.
   total = livros.size() * 2.0f;
   
   //ou
   //for (Livro l: livros) {
   //  total += 2.0f;
   //}

    //Realizar o desconto.
    total = total - desconto();
    return total;
  }

}//Cliente.