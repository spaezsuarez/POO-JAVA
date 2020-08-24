package Mundo;

public class Rueda {
    private long ancho;
    private double diametroRin;
    private double indiceCarga;
    private double presionMaxima;

    // Ancho
    public void setAncho(long ancho) {
        this.ancho = ancho;
    }

    public long getAncho() {
        return this.ancho;
    }

    // diametroRin
    public void setDiametroRin(double diametroRin) {
        this.diametroRin = diametroRin;
    }

    public double getDiametroRin() {
        return this.diametroRin;
    }

    // indiceCarga
    public void setIndiceCarga(double indiceCarga) {
        this.indiceCarga = indiceCarga;
    }

    public double getIndiceCarga() {
        return this.indiceCarga;
    }

    // presionMaxima
    public void setPresionMaxima(double presionMaxima) {
        this.presionMaxima = presionMaxima;
    }

    public double getPresionMaxima() {
        return this.presionMaxima;
    }
}