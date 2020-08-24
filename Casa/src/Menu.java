package src;

import javax.swing.*;

public class Menu extends JFrame 
{
   
    private static final long serialVersionUID = 1L;

    public Menu(String text) {
        super(text);
    }

    public void showApp(Casa casa)
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el punto x","X",JOptionPane.DEFAULT_OPTION));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el punto y","Y",JOptionPane.DEFAULT_OPTION));
        int base = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la base","Base",JOptionPane.DEFAULT_OPTION));
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura ","Altura",JOptionPane.DEFAULT_OPTION));

        casa.setAltura(altura);
        casa.setX(x);
        casa.setY(y);
        casa.setBase(base);
        casa.init();

        this.getContentPane().add(casa);
        this.setSize(2000,1000);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}