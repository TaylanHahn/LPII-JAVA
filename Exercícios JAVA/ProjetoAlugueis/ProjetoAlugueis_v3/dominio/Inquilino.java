package dominio;

import java.util.*;

public class Inquilino {
	private String nome;
	
	//0,3 pontos
	private List<Apto> aptosAlugados = new ArrayList<>();
	
	public Inquilino(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//0,2 pontos
	public List<Apto> getAptosAlugados() {
		return aptosAlugados;
	}
	
	//0,4 pontos
	public void aluga(Apto apto) {
		if (!apto.isAlugado()) {
			apto.setAlugado(true);
			aptosAlugados.add(apto);
		}
	}
	
	//0,4 pontos
	public void desaluga(Apto apto) {
		if (aptosAlugados.contains(apto)) {
			apto.setAlugado(false);
			aptosAlugados.remove(apto);
		}
	}
	
}//Final classe Inquilino.