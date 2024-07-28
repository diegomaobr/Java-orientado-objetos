package screematch.calculos;
import screematch.modelos.Titulo;
public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
