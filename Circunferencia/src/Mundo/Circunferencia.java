package Mundo;

import java.awt.*;
import java.applet.*;

public class Circunferencia extends Applet{

    private int x;
    private int y;

    private static final long serialVersionUID = 1L;

    public int getX(int x)
    {
        double conversion = Math.cos(Math.toRadians(x));
        this.x =(int)(conversion *= 40);
        this.x +=250;
        return this.x;
    }

    public int getY(int y){
        double conversion = Math.sin(Math.toRadians(y));
        this.y = (int)(conversion *= 40);
        this.y += 100;
        return this.y;
    }

    public void paint(Graphics lapiz)
    {
        for (int x = 0; x <= 360; x++ )
        {
            
            lapiz.drawString("*", this.getX(x), this.getY(x));
        }
        
    }
    
} 