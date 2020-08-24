package src;

public class Ficha {

    private String color;
    private String forma;
 
    public Ficha(String color,String forma)
    {
        this.color=color;
        this.forma = forma;
    }

    public Ficha()
    {
        this.forma = "";
    }

    public String getForma(){
        return this.forma;
    }
 
    public String getColor()
    {
        return this.color;
    }

    public void setForma(String forma){
        this.forma = forma;
    }


    
}