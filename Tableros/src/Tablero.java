package src;

public class Tablero {

    private Ficha estadoTablero[][];

    public Tablero() {
        this.estadoTablero = new Ficha[3][3];
    }

    public Ficha getFicha(int fila, int columna) {
        return this.estadoTablero[fila][columna];
    }

    public void setFicha(int fila, int columna, Ficha ficha) {
        try {
            this.estadoTablero[fila][columna] = ficha;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ingrese una posicion valida");
        }

    }

    public void imprimir() {
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    System.out.print(this.estadoTablero[i][j].getForma());
                } catch (NullPointerException e) {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }

        System.out.println("");

    }

    public boolean verSiLlena() {

        boolean estado = true;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (this.estadoTablero[i][j] == null) {
                    estado = false;
                }

            }
        }
        return estado;
    }

    public boolean tresEnFila() {

        boolean respuesta = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    boolean condicionUno = this.getFicha(i, j).getForma().equals(this.getFicha(i, j + 1).getForma());

                    boolean condicionDos = this.getFicha(i, j).getForma().equals(this.getFicha(i, j + 2).getForma());

                    if (condicionUno && condicionDos) {
                        System.out.println("EL ganador es: " + this.getFicha(i, j).getForma());
                        respuesta = true;
                    }

                } catch (NullPointerException e) {
                } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
        }

        return respuesta;
    }

    public boolean tresEnColumna() {

        boolean respuesta = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    boolean condicionUno = this.getFicha(i, j).getForma().equals(this.getFicha(i + 1, j).getForma());

                    boolean condicionDos = this.getFicha(i, j).getForma().equals(this.getFicha(i + 2, j).getForma());

                    if (condicionUno && condicionDos) {
                        System.out.println("EL ganador es: " + this.getFicha(i, j).getForma());
                        respuesta = true;
                    }

                } catch (NullPointerException e) {
                } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
        }

        return respuesta;
    }

    public boolean tresEnDiagonal() {

        boolean respuesta = false, diagonalPrincipal = false, diagonalSecundaria = false;

        try {

            diagonalPrincipal = (this.getFicha(1, 1).getForma().equals(this.getFicha(0, 0).getForma()))
                    && (this.getFicha(1, 1).getForma().equals(this.getFicha(2,2).getForma()));

            diagonalSecundaria = (this.getFicha(1, 1).getForma().equals(this.getFicha(0,2).getForma()))
                    && (this.getFicha(1, 1).getForma().equals(this.getFicha(2, 0).getForma()));

            if(diagonalPrincipal || diagonalSecundaria){
                respuesta = true;
                System.out.println("El ganador es: " + this.getFicha(1, 1).getForma());
            }        

        } catch (NullPointerException a) {}

        return respuesta;
    }

}
