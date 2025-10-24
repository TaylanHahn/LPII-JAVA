package dominio;

import java.util.List;
import java.util.ArrayList;

public class Regiao {

	private String nome;
	private float tempMedia;
	private List<Estado> estados = new ArrayList<Estado>();

	public Regiao(String nome, float tempMedia){
		this.nome = nome;
		this.tempMedia = tempMedia;
	}

	public String getNome() {
		return nome;
	}

	public float getTempMedia() {
		return tempMedia;
	}
	public List<Estado> getEstados() {
		return estados;
	}

	public void incluiEstado(Estado e) {
		this.estados.add(e);
	}

}//Regiao.