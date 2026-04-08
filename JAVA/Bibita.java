package JAVA;
public class Bibita extends Prodotto
{
    public Bibita(String nome,int calorie,double prezzo,String descrizione)
    {
        super(nome, calorie, prezzo, descrizione);
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " Calorie: " + getCalorie() + " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione();
    }
}
