package JAVA;
public class Caffe extends Prodotto
{
    private boolean caffeina;
    public Caffe(String nome,double prezzo,String descrizione,String valoriNutrizionali,boolean caffeina)
    {
        super(nome,prezzo,descrizione,valoriNutrizionali);
        this.caffeina=caffeina;
    }
    public boolean getCaffeina()
    {
        return this.caffeina;
        
    }
    public void setCaffeina(boolean caffeina)
    {
        this.caffeina=caffeina;
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() +  " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione() +  " Valori nutrizionali: " + getValoriNutrizionali() + " Caffeina: " + getCaffeina();
    }
    
}
