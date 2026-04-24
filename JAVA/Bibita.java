package JAVA;
public class Bibita extends Prodotto
{
    public Bibita(String nome,double prezzo,String descrizione,String valoriNutrizionali)
    {
        super(nome,prezzo, descrizione,valoriNutrizionali);
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione()  + " Valori nutrizionali: " + getValoriNutrizionali() ;
    }
}
