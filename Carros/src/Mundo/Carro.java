package Mundo;

public class Carro {
    private Motor motor;
    private int numeroAsientos;
    private String modelo;
    private int numeroRuedas;
    private Radio radio;

    // Metodo constructor
    public Carro(String tipo, int numeroAsientos, String modelo, int numeroRuedas) {

        this.motor = new Motor();
        this.motor.setTipo(tipo);
        this.numeroRuedas = numeroRuedas;
        this.numeroAsientos = numeroAsientos;
        this.modelo = modelo;
    }

    // Metodos getter y setter
    public int getNumeroAsientos() {
        return this.numeroAsientos;
    }

    public int getNumeroRuedas() {
        return this.numeroRuedas;
    }

    public String getModelo() {
        return this.modelo;
    }

    // Metodos
    public void usarRadio() {
        this.radio = new Radio();
        this.radio.encender();
    }

    public void encender() {
        System.out.println("El carro esta encendido");
    }

    public void avanzar() {
        this.motor.convertirAEnergiaMecanica();
       
        for (int x = 0; x <= 4; x++) {
            System.out.print("@ ->");
            
        }
    }

    public void frenar() {
        System.err.println("\n");
        System.out.println("El carro se esta deteniendo");
    }

    public void apagar() {
        this.motor.apagar();
    }
}