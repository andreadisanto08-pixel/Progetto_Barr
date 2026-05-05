package JAVA;

public class Utente 
{
    private String nome;
    private String cognome;
    private String codiceUnivoco;
    private String password;
    private String email;
    private double saldo;
    private boolean permessoGestione;
    private boolean utenteLoggato;
    public Utente(String nome,String cognome,String codiceUnivoco,String password,String email,boolean permessoGestione,double saldo,boolean utenteLoggato)

    {
        this.nome=nome;
        this.cognome=cognome;
        this.codiceUnivoco=codiceUnivoco;
        this.password=password;
        this.email=email;
        this.permessoGestione=permessoGestione;
        this.saldo=saldo;
        this.utenteLoggato=false;
    }

    public String getNome() {
        return nome;
    }

    public String getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public boolean getPermessoGestione()
    {
        return permessoGestione;
    }

    public double getSaldo() {
        return saldo;
    }
    public boolean getUtenteLoggato()
    {
        return utenteLoggato;
    }
    public void setCodiceUnivoco(String codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermessoGestione(boolean permessoGestione) {
        this.permessoGestione = permessoGestione;
    }

    public void setUtenteLoggato(boolean utenteLoggato) {
        this.utenteLoggato = utenteLoggato;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString()
    {
        return "Nome: " + getNome() + " Cognome: " + getCognome() + " Codice utente: " + getCodiceUnivoco() + " Saldo: " + getSaldo();
    }

    
}
