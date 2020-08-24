package Mundo;

public class Lista {

    private int limiteSuperior;
    private int limiteInferior;

    public void setLimiteSuperior(int limiteSuperior){
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteSuperior()
    {
        return this.limiteSuperior;
    }

    public void setLimiteInferior(int limiteInferior)
    {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteInferior()
    {
        return this.limiteInferior;
    }

    public void esPar()
    {
        for(int i = this.getLimiteInferior(); i <= this.getLimiteSuperior(); i++)
        {
            if( i % 2 == 0)
            {
                System.out.println(i + " es par \n");
            }
        }
    }

    public void esImpar()
    {
        int indice = this.getLimiteInferior();

        while(indice <= this.getLimiteSuperior())
        {
            if(indice % 2 != 0)
            {
                System.out.println(indice + " es impar \n");
                
            }
            indice += 1;
        }
    }
}