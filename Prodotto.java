public class Prodotto
{
    private String nome;
    private int calorie;
    private double prezzo;
    private String descrizione;
    public Prodotto(String nome,int calorie,double prezzo,String descrizione)
    {
        this.nome=nome;
        this.calorie=calorie;
        this.prezzo=prezzo;
        this.descrizione=descrizione;
    }
    public String getNome()
    {
        return this.nome;
    }
    public int getCalorie()
    {
        return this.calorie;
    }
    public double getPrezzo()
    {
        return this.prezzo;
    }
    public String getDescrizione()
    {
        return this.descrizione;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public void setCalorie(int calorie)
    {
        this.calorie=calorie;

    }
    public void setPrezzo(double prezzo)
    {
        this.prezzo=prezzo;
    }
    public void setDescrizione(String descrizione)
    {
        this.descrizione=descrizione;
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " Calorie: " + getCalorie() + " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione();
    }


}