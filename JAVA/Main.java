package JAVA;
import GUI.FrameOrdina;
import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args) 
    {
        Caffe Cappuccino = new Caffe("Cappuccino", 0.80, "s", "s", false);
        /*togliere le calorie Caffe Espresso = new Caffe("Espresso", 2, 1.00, "Nero", "Proteine: 0 g  Carboidrati: 0 g Grassi: 0 g", false);
        Caffe Cappuccino = new Caffe("Cappuccino", 80, 0.80, "Latte + caffè", "Proteine: 4 g  Carboidrati: 8 g Grassi: 4 g", true);
        Caffe LatteMacchiato =new Caffe("Latte macchiato", 120, 1.50, "Latte + caffè", "Proteine: 6 g  Carboidrati: 12 g Grassi: 5 g", false);
        Caffe CaffeAmericano = new Caffe("Caffè Americano", 5, 1.50, "Caffè Lungo", "Proteine: 0 g  Carboidrati: 1 g Grassi: 0 g", false);
        Dolce CornettoSemplice = new Dolce("Cornetto Semplice", 200, 1.00, "Sfoglia", "Proteine: 4 g  Carboidrati: 25 g Grassi: 10 g");
        Dolce CornettoFarcito = new Dolce("Cornetto Farcito", 200, 1.50, "Dolce", "Proteine: 5 g  Carboidrati: 28 g Grassi: 12 g");
        Dolce Crostata = new Dolce("Crostata", 300, 3.00, "Marmellata", "Proteine: 4 g  Carboidrati: 40 g Grassi: 12 g");
        Dolce Muffin = new Dolce("Muffin", 300, 1.80, "Dolce", "Proteine: 3 g  Carboidrati: 25 g Grassi: 10 g");
        Dolce Biscotti = new Dolce("Biscotti", 100, 0, "Frollini", "Proteine: 2 g  Carboidrati: 15 g Grassi: 4 g");
        Panino PaninoClassico = new Panino("Panino Classico", 350, 3.00, "Prosciutto & formaggio", "Proteine: 18 g  Carboidrati: 35 g Grassi: 15 g", false);
        Panino PaninoVegetariano = new Panino("Panino Vegetariano", 320, 4.00, "Verdure + pane", "Proteine: 10 g  Carboidrati: 45 g Grassi: 10 g", false);
        Panino Toast = new Panino(" Toast", 300, 2.00, "Pane + formaggio", "Proteine: 12 g  Carboidrati: 30 g Grassi: 15 g", false);
        Panino ToastFarcito = new Panino("Tosat Farcito", 400, 3.00, "Pane + ripieno", "Proteine: 20 g  Carboidrati: 40 g Grassi: 18 g", false);
        Panino Tramezzino = new Panino("Tramezzino", 300, 3.00, "Pane + ripeno", "Proteine: 12 g  Carboidrati: 35 g Grassi: 12 g", false);
        Panino InsalataMista = new Panino("Insalata Mista", 320, 4.00, "Verdure ", "Proteine: 5 g  Carboidrati: 15 g Grassi: 8 g", false);
        Bibita Acqua = new Bibita("Acqua", 0, 1.00, "Naturale / frizzante", "Proteine: 0 g  Carboidrati: 0 g Grassi: 0 g");
        Bibita Bibite = new Bibita("Bibite", 120, 1.20, "Zuccherate", "Proteine: 0 g  Carboidrati: 30 g Grassi: 0 g");
        Bibita SuccoDiFrutta = new Bibita("Succo di frutta", 80, 1.50, "Frutta", "Proteine: 0 g  Carboidrati: 20 g Grassi: 0 g");
        Bibita TeFreddo = new Bibita("Tè Freddo", 60, 1.50, "Zuccherato", "Proteine: 0 g  Carboidrati: 15 g Grassi: 0 g");
        Bibita SpremutaArancia = new Bibita("Spremuta D'Arancia", 100, 2.00, "Fresca", "Proteine: 2 g  Carboidrati: 22 g Grassi: 0 g"); togliere le calorie*/
        ArrayList<BarManager> Bar = new ArrayList<>();
        Utente utente1 = new Utente("Marco", "Gisella" ,"1", "a", "sc", false, 200,false);
        Utente utente2 = new Utente("Marcod", "Gisella" ,"2", "b", "sc", false, 200,false);
        Utente utente3 = new Utente("Marcof", "Gisella" ,"3", "c", "sc", false, 200,false);
        ArrayList<UtenteManager> ManagerUtenti = new ArrayList<>();
        ManagerUtenti.add(new UtenteManager());
        ManagerUtenti.get(0).aggiungiUtente(utente1);
        ManagerUtenti.get(0).aggiungiUtente(utente2);
        ManagerUtenti.get(0).aggiungiUtente(utente3);
        new FrameOrdina(ManagerUtenti);
        Bar.add(new BarManager());
        try
        {
            Bar.get(0).aggiungiProdotto(Cappuccino);
            System.out.println(Bar.get(0).getProdotti());
            

        }
        catch(AggiuntaProdottoException e)
        {
            System.out.println(e.getMessage());
        }

    }
    
}
