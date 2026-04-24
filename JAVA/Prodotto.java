package JAVA;
public class Prodotto
{
    private String nome;
    private double prezzo;
    private String descrizione;
    private String valoriNutrizionali;
    public Prodotto(String nome,double prezzo,String descrizione,String valoriNutrizionali)
    {
        this.nome=nome;
        this.prezzo=prezzo;
        this.descrizione=descrizione;
        this.valoriNutrizionali=valoriNutrizionali;
        
    }
    public String getNome()
    {
        return this.nome;
    }
    public double getPrezzo()
    {
        return this.prezzo;
    }
    public String getDescrizione()
    {
        return this.descrizione;
    }
    public String getValoriNutrizionali()
    {
        return this.valoriNutrizionali;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public void setPrezzo(double prezzo)
    {
        this.prezzo=prezzo;
    }
    public void setDescrizione(String descrizione)
    {
        this.descrizione=descrizione;
    }
    public void setValoriNutrizionali(String valoriNutrizionali) 
    {
        this.valoriNutrizionali=valoriNutrizionali;
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() +  " Prezzo: " + getPrezzo() + " Descrizione: " + getDescrizione() + "Valori nutrizionali: " + getValoriNutrizionali();
    }


}