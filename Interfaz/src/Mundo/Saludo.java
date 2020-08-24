package Mundo;

import java.awt.*;
import java.applet.*;

public class Saludo extends Applet {;


    private static final long serialVersionUID = 1L;

    private String name;
    private int x;
    private int y;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

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

    public void paint(Graphics g)
    {
        g.drawString("Hola "  + this.getName()  , this.getX(), this.getY());

    }
    
}