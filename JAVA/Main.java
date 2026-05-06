
package JAVA;
import GUI.FrameHome;
import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args) 
    {

        Caffe Cappuccino = new Caffe("Cappuccino", 0.80, "Classico con schiuma", "120 kcal, 6g proteine", true);
        Caffe Espresso = new Caffe("Espresso", 1.00, "Intenso e cremoso", "2 kcal, 0.1g proteine", true);
        Caffe CaffeMacchiato = new Caffe("Caffè Macchiato", 1.10, "Espresso con schiuma", "15 kcal, 1g proteine", true);
        Panino PaninoCotoletta = new Panino("Panino Cotoletta", 2.00, "Cotoletta e maionese", "450 kcal, 18g proteine", false);
        Panino PaninoVegetariano = new Panino("Panino Vegetariano", 3.00, "Verdure e formaggio", "320 kcal, 12g proteine", true);
        Panino PaninoWurstel = new Panino("Panino Wurstel", 2.00, "Wurstel e ketchup", "390 kcal, 14g proteine", false);
        Dolce MuffinCioccolato = new Dolce("Muffin Cioccolato", 2.20, "Muffin con gocce", "380 kcal, 5g proteine");
        Dolce BriocheCrema = new Dolce("Brioche Crema", 1.50, "Sfoglia alla crema", "290 kcal, 4.5g proteine");
        Dolce BriocheCioccolato = new Dolce("Brioche Cioccolato", 1.50, "Sfoglia al cioccolato", "310 kcal, 4.8g proteine");
        Bibita CocaCola = new Bibita("Coca Cola", 1.00, "Lattina 33cl", "140 kcal, 0g proteine");
        Bibita Acqua = new Bibita("Acqua Naturale", 0.40, "Bottiglia 50cl", "0 kcal, 0g proteine");
        Bibita Succodifrutta = new Bibita("Succo di Frutta", 2.00, "Succo alla pesca 20cl", "90 kcal, 0.6g proteine");
        ArrayList<BarManager> Bar = new ArrayList<>();
        ArrayList<OrdinazioneManager> Ordinazioni = new ArrayList<>();
        Utente utente1 = new Utente("Marco", "Gisella" ,"1", "a", "sc", true, 2,false);
        Utente utente2 = new Utente("Marcod", "Gisella" ,"2", "b", "sc", false, 200,false);
        Utente utente3 = new Utente("Marcof", "Gisella" ,"3", "c", "sc", false, 200,false);
        ArrayList<UtenteManager> ManagerUtenti = new ArrayList<>();
        ManagerUtenti.add(new UtenteManager());
        ManagerUtenti.get(0).aggiungiUtente(utente1);
        ManagerUtenti.get(0).aggiungiUtente(utente2);
        ManagerUtenti.get(0).aggiungiUtente(utente3);
        Bar.add(new BarManager());
        try
        {
            Bar.get(0).aggiungiProdotto(Cappuccino);
            Bar.get(0).aggiungiProdotto(Espresso);
            Bar.get(0).aggiungiProdotto(CaffeMacchiato);
            Bar.get(0).aggiungiProdotto(PaninoCotoletta);
            Bar.get(0).aggiungiProdotto(PaninoVegetariano);
            Bar.get(0).aggiungiProdotto(PaninoWurstel);
            Bar.get(0).aggiungiProdotto(MuffinCioccolato);
            Bar.get(0).aggiungiProdotto(BriocheCrema);
            Bar.get(0).aggiungiProdotto(BriocheCioccolato);
            Bar.get(0).aggiungiProdotto(CocaCola);
            Bar.get(0).aggiungiProdotto(Acqua);
            Bar.get(0).aggiungiProdotto(Succodifrutta);
            
            

        }
        catch(AggiuntaProdottoException e)
        {
            System.out.println(e.getMessage());
        }
        String nomeUtente = "";
        String storicoOrdini = "";
        new FrameHome(ManagerUtenti,Bar,Ordinazioni,nomeUtente,storicoOrdini);
        
        

    }
    
}
