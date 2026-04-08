package JAVA;
import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args) 
    {
        Caffe Cappuccino = new Caffe("Cappuccino", 0, 0, "Buono", true);
        ArrayList<BarManager> Bar = new ArrayList<>();
        Bar.add(new BarManager());
        try
        {
            Bar.get(0).aggiungiProdotto(Cappuccino);

        }
        catch(AggiuntaProdottoException e)
        {
            System.out.println(e.getMessage());
        }

    }
    
}
