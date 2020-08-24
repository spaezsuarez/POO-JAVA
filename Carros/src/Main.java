import Mundo.*;

public class Main
{
    public static void main(String[] args) {
        Carro carro = new Carro("Gasolina",4,"estandar",4);
        carro.encender();
        carro.avanzar();
        carro.frenar();
        carro.apagar();
    }
}