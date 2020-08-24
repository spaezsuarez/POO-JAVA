import java.util.Scanner;

public class Main{

    public static int calcularPeso(String cadena){
        int peso = 0;
        for(int i = 0; i <= cadena.length()-1; i++){
            peso += (int)cadena.charAt(i);
        }
        return peso;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaUno = "",cadenaDos = "";
        int pesoUno = 0,pesoDos = 0;

        System.out.println("Ingrese la primera cadena: ");
        cadenaUno = entrada.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        cadenaDos = entrada.nextLine();
        pesoUno = calcularPeso(cadenaUno);
        pesoDos = calcularPeso(cadenaDos);

        do{
            System.out.println("Ingrese la primera cadena: ");
            cadenaUno = entrada.nextLine();
            System.out.println("Ingrese la segunda cadena: ");
            cadenaDos = entrada.nextLine();
            pesoUno = calcularPeso(cadenaUno);
            pesoDos = calcularPeso(cadenaDos);

        }while(pesoUno != pesoDos);


        entrada.close();
    }
}