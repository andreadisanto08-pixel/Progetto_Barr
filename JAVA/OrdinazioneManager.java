package JAVA;
import java.util.ArrayList;
public class OrdinazioneManager
{
    ArrayList<Prodotto> Prodotti;
    public OrdinazioneManager()
    {
        this.Prodotti = new ArrayList<>();
    }

    public ArrayList<Prodotto> getProdotti() {
        return Prodotti;
    }

    public void aggiungiOrdinazione(Utente u,Prodotto p) throws AggiuntaOrdinazioneException
    {
        if(u.getSaldo()<p.getPrezzo())
        {
            throw new AggiuntaOrdinazioneException("Errore saldo insufficiente");
        }
        else
        {
            Prodotti.add(p);
        }

        

    }
}