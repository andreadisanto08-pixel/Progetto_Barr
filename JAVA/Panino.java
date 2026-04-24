package JAVA;
public class Panino extends Prodotto
{
    private boolean vegetariano;
    public Panino(String nome,double prezzo,String descrizione,String valoriNutrizionali,boolean vegetariano)
    {
        super(nome,prezzo,descrizione,valoriNutrizionali);
        this.vegetariano=vegetariano;
    }
    public boolean getVegetariano()
    {
        return this.vegetariano;
        
    }
    public void setVegetariano(boolean vegetariano)
    {
        this.vegetariano=vegetariano;
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione() + " Valori nutrizionali: " + getValoriNutrizionali() + " Vegetariano: " + getVegetariano();
    }


}
