package JAVA;
public class Dolce extends Prodotto
{
    public Dolce(String nome,int calorie,double prezzo,String descrizione,String valoriNutrizionali)
    {
        super(nome, calorie, prezzo, descrizione,valoriNutrizionali);
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " Calorie: " + getCalorie() + " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione()  + " Valori nutrizionali: " + getValoriNutrizionali() ;
    }
    
}
