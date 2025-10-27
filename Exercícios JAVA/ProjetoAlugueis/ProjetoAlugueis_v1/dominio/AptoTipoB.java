package dominio;

//0,2 ponto
public class AptoTipoB extends Apto {

    public AptoTipoB(int num, int andar, float area) {
        super(num, andar, area);
    }

    @Override
    public float precoExtra() {
        if (getAndar() > 1) 
        	return 50;
        else
          return 0;
    }
    
}//Fim Classe AptoTipoB
