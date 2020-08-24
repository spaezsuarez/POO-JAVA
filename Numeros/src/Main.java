import java.util.Scanner;
import Mundo.*;

public class Main
{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        Lista numeros = new Lista();

        System.out.println("Ingrese el limite inferior:");
        num1 = entrada.nextInt();
        numeros.setLimiteInferior(num1)
        ;
        System.out.println("Ingrese el limite inferior:\n");
        num2 = entrada.nextInt();
        numeros.setLimiteSuperior(num2);
        
        entrada.close();
        numeros.esPar();
        numeros.esImpar();
        
    }
}