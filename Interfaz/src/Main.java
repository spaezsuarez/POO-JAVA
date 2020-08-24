import Mundo.*;

public class Main
{
    public static void main(String[] args)
    {
        
        Menu menu = new Menu("Saludo");
        Saludo saludo = new Saludo();

        menu.showMenu(saludo);
        
        

    
    }
}