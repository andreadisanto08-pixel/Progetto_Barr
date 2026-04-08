package JAVA;
import java.util.ArrayList;
public class BarManager 
{
    private ArrayList<Prodotto> Prodotti;
    public BarManager()
    {
        this.Prodotti=new ArrayList<>();

    }
    public ArrayList<Prodotto> getProdotti()
    {
        return this.Prodotti;
    }
    public void aggiungiProdotto(Prodotto p) throws AggiuntaProdottoException
    {
        if(p.getCalorie()<0 || p.getPrezzo()<0 || p.getDescrizione()==null || p.getNome()==null)
        {
            throw new AggiuntaProdottoException("Errore riscontrato , riprova");
        }
        else
        {
            Prodotti.add(p);
        }        

    }

    
}
