package Mundo;

import java.util.Scanner;

public class Radio {
    private double emisora;

    // Metodos setter y getter
    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }

    public double getEmisora() {
        return this.emisora;
    }

    // Metodos

    public void encender() {
        Scanner entrada = new Scanner(System.in);
        this.setEmisora(0.0);
        boolean estado = true;

        while (estado) {

            System.out.println("Seleccione una opcion: \n" + "1.)Cambiar Emisora \n" + "2.)Apagar radio \n");
            System.out.println("Emisora: " + this.getEmisora());

            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    this.setEmisora(Math.random() * 100);
                    System.out.println("Ahora estas en la " + this.getEmisora() + "FM");
                    break;
                case 2:
                    System.out.println("Radio apagado");
                    estado = false;
                    entrada.close();
                    break;
                default:
                    System.out.println("Debe ingresar una de las opciones");
                    System.out.println("Seleccione una opcion: \n" + "1.)Cambiar Emisora \n" + "2.)Apagar radio \n");
                    opcion = entrada.nextInt();
                    break;
            }
        }

    }
}