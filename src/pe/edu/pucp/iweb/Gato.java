package pe.edu.pucp.iweb;

public class Gato extends Animal{
    private int alturaSalto;
    private int numeroVidas=7;

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }
}
