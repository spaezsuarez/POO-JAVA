package src;

import java.applet.*;
import java.awt.*;


public class Casa extends Applet
{

    private static final long serialVersionUID = 1L;
    private int x;
    private int y;
    private int base;
    private int altura;

    public void setX(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return this.x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getY()
    {
        return this.y;
    }
    
    public void setBase(int base)
    {
        this.base = base;
    }

    public int getBase()
    {
        return this.base;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    public int getAltura()
    {
        return this.altura;
    }

    public void triangulo(Graphics g)
    {
        int altura = this.getAltura() / 2;
        int base = this.getBase();

        g.drawLine(getX(), getY(), getX()+base, getY());
        g.drawLine(getX()+base, getY(), getX()+base/2, getY()-altura);
        g.drawLine(getX()+base/2, getY()-altura, getX(), getY());
    }

    public void casa(Graphics g)
    {
        g.drawRect(this.getX(), this.getY(), this.getBase(), this.getAltura());
        //Dibujo de la ventana
        g.drawRect(this.getX()+(this.getBase() / 20), this.getY()+ 20, this.getBase()/5, this.getAltura()/5);
        //Dibujo de la puerta
        g.drawRect(this.getX() + (this.getBase() / 2), this.getY()+15, this.getBase()/4, this.getAltura()-25);
        this.triangulo(g);
    }

    public void paint(Graphics g)
    {
        this.casa(g);
    }
}