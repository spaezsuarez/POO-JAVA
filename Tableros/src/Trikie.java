package src;

import java.util.Scanner;

public class Trikie {

    private boolean turno;
    private Tablero tablero;
    private Ficha ficha;

    public Trikie()
    {
        this.turno = true;
        this.tablero = new Tablero();
    }

    public void setTurno(boolean turno)
    {
        this.turno = turno;
    }

    public boolean getTurno() 
    {
        return this.turno;
    }

    
    public boolean ganador()
    {
        boolean ganar = false;

        if((tablero.tresEnFila() == true) || tablero.tresEnColumna() == true || tablero.tresEnDiagonal() == true)
        {
            ganar = true;

        }else if (tablero.verSiLlena())
        {
            ganar = true;
        }

        return ganar;


    }

    public boolean turnoEsValido()
    {
        boolean respuesta = false;

        if(this.getTurno() == true && ficha.getForma().equals("X")){
            respuesta = true;
        }
        else if(this.getTurno() == false && ficha.getForma().equals("O")){
            respuesta = true;
        }

        return respuesta;
    }

    public void startGame() 
    {
        boolean estado = true;
        Scanner entrada = new Scanner(System.in);
        int fila = 0, columna = 0;
        String tipo = "";

        System.out.println("Bienvenido al trikie el turno inicial es 0, y debe empezar la X");

        while (estado) {
            ficha = new Ficha();
            System.out.println("Ingrese el tipo de ficha O o X: ");
            tipo = entrada.next();
            ficha.setForma(tipo);

            if(this.turnoEsValido())
            {
                System.out.println("Ingrese la fila del tablero: ");
                fila = entrada.nextInt();

                System.out.println("Ingrese la columna del tablero: ");
                columna = entrada.nextInt();

                try{
                    if(tablero.getFicha(fila, columna) == null){
                        tablero.setFicha(fila, columna, ficha);
                        this.setTurno(!this.getTurno());
                        tablero.imprimir();
                    }else{
                        System.out.println("Ya hay una ficha ahi:\n");
                        tablero.imprimir();
                    }
                    
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Ingrese una posicion valida\n\n");
                }
                


            }else{
                System.out.println("Debe esperar su turno:\n");
            }

            
            if (this.ganador()) {
                estado = false;
            } else {
                estado = true;
            }
        }

        entrada.close();
    }

}