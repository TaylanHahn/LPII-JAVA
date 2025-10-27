package dominio;

//0,2 ponto
public class AptoTipoA extends Apto {

    public AptoTipoA(int num, int andar, float area) {
        super(num, andar, area);
    }

    @Override
    public float precoExtra() {
        return 100 * getAndar();
    }
    
}//Fim AptoTipoA.
