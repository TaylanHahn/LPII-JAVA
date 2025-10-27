package dominio;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private String nome;
    
    //0,3 pontos
    private List<Apto> listaDeAptos = new ArrayList<Apto>(); 

    public Edificio(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    //0,2 pontos
    public void addApartamento(Apto a) {
        listaDeAptos.add(a);
    }

    //0,1 ponto
    public List<Apto> getAptos() {
       return listaDeAptos;
    }

    //0,2 pontos
    public List<Apto> getAptosAlugados() {
    	List<Apto> aptosAlugados = new ArrayList<Apto>();
    	for(Apto apto: listaDeAptos) {
    		if (apto.isAlugado()) {
    			aptosAlugados.add(apto);
    		}
    	}
        return aptosAlugados;
    }
    
}//Fim Classe Edificio.