package dominio;

//0,2 ponto
public class AptoTipoB extends Apto {
	public AptoTipoB(int numero, int andar, float area, Edificio edificio) {
		super(numero, andar, area, edificio);
	}
	
	public float precoExtra() {
		int andar = getAndar();
		
		if (andar >= 1 ) {
			return 50;
		}
		else {
			return 0;
		}
	}
	
}//Final classe AptoTipoB.
