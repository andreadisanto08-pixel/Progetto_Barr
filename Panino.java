public class Panino extends Prodotto
{
    private boolean vegetariano;
    public Panino(String nome,int calorie,double prezzo,String descrizione,boolean vegetariano)
    {
        super(nome, calorie, prezzo,descrizione);
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
        return "Nome: " + getNome() + " Calorie: " + getCalorie() + " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione() + "Vegetariano: " + getVegetariano();
    }


}
