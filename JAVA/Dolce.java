package JAVA;
public class Dolce extends Prodotto
{
    public Dolce(String nome,double prezzo,String descrizione,String valoriNutrizionali)
    {
        super(nome,prezzo,descrizione,valoriNutrizionali);
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione()  + " Valori nutrizionali: " + getValoriNutrizionali() ;
    }
    
}
