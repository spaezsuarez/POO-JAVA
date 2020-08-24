package Mundo;

import javax.swing.*;

public class Menu extends JFrame{

    private static final long serialVersionUID = 1L;

    public Menu(String text)
    {
        super(text);
    }

    public void showMenu(Saludo saludo)
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "X:", "coordenada x", JOptionPane.INFORMATION_MESSAGE));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Y:","coordenada y",JOptionPane.INFORMATION_MESSAGE));
        String name = JOptionPane.showInputDialog(null, "Ingresa tu nombre",JOptionPane.INFORMATION_MESSAGE);

        
        saludo.setX(x);
        saludo.setY(y);
        saludo.setName(name);
        saludo.init();

        this.setSize(1000, 1000);
        this.getContentPane().add(saludo);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    
}