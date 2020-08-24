package Logica;

public class Main{

    public static void main(String[] args)
	{
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
    }
    
    public static int diagonal(int[][] matriz){
        int respuesta = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    respuesta += matriz[i][j];
                    System.out.println(matriz[i][j]);
                }
            }
        }
        return respuesta;
    }

    public static int diagonalSecundaria(int[][] matriz){
        int respuesta = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i+j == matriz.length+1){
                    respuesta += matriz[i][j];
                    System.out.println(matriz[i][j]);
                }
            }
        }
        return respuesta;
    }

    public static int[][] filasYColumnas(int[][] array){
        int[][] respuesta = new int[2][array.length];
        int[] sumasFila = new int[array.length];
        int[] sumasColumna = new int[array[0].length];
        int contador = 0,sumatoriaFila = 0,sumatoriaColumna = 0,contadorArreglo = 0;
        
        while(contador < array[0].length){
            for(int i = 0; i < array.length; i++){
                try{
                    sumatoriaFila += array[contador][i];
                    sumatoriaColumna += array[i][contador];
                    sumasFila[contadorArreglo] = sumatoriaFila;
                    sumasColumna[contadorArreglo] = sumatoriaColumna;
                }catch(ArrayIndexOutOfBoundsException e){}
                
            }
            
            sumatoriaFila = 0;
            sumatoriaColumna = 0;
            contadorArreglo++;
            contador++;
        }

        return respuesta;
    }

    public static boolean veryfy(int[][] matriz){
        boolean filas_y_columnas = false;
        for(int i = 0;i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[0][0] == matriz[i][j]){
                    filas_y_columnas = true;
                }else{
                    filas_y_columnas = false;
                }
            }
        }
        return filas_y_columnas;
    }

	public static boolean isMagic(int[][] array)
	{
        int[][] matriz = filasYColumnas(array);
        boolean filas_columnas = veryfy(matriz);
        if(filas_columnas == true && array.length == array[0].length && diagonal(array) == diagonalSecundaria(array)){
            return true;
        }
		return false;
	}
}