package Mundo;

public class Motor {
    
    private String tipo;
    private long numeroSerie;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public long getNumeroSerie() {
        return this.numeroSerie;
    }

    public void convertirAEnergiaMecanica() {
        
        switch (this.getTipo()) {
            case "Electrico":
                System.out.println("Se esta convirtiendo la energia electrica a energia mecanica");
                break;
            case "Gasolina":
                System.out.println("Se esta convirtiendo la energia de la combustion a energia mecanica");
                break;
        }
    }

    public void apagar() {
        System.out.println("El motor se apago");
    }
    
}