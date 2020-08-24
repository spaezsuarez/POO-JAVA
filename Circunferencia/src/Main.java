import Mundo.*;

import javax.swing.*;


public class Main
{
    public static void main(String[] args)
    {
        Circunferencia circulo = new Circunferencia();
        JFrame menu = new JFrame("Menu");
        
        circulo.init();
            
        menu.getContentPane().add(circulo);
        menu.setSize(500, 200);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);

        

        

        
    }
}
