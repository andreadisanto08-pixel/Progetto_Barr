package JAVA;

import java.util.ArrayList;
import javax.swing.JLabel;

public class UtenteManager 
{
    private ArrayList<Utente> Utenti;
    
    public UtenteManager()
    {
        this.Utenti = new ArrayList<>();
    }
    public ArrayList<Utente> getUtenti() {
        return Utenti;
    }

    public void setUtenti(ArrayList<Utente> Utenti) {
        this.Utenti = Utenti;
    }

    public void aggiungiUtente(Utente p)
    {
        Utenti.add(p);

    }
    public boolean login(String email,String password,JLabel labelMessaggio)
    {
        int i;
        boolean trovato=false;
        for(i=0;i<Utenti.size();i++)
        {
            if(email.equals(Utenti.get(i).getEmail()) && password.equals(Utenti.get(i).getPassword()))
            {
                trovato=true;
                Utenti.get(i).setUtenteLoggato(true);
                break;
            }
            else
            {
                Utenti.get(i).setUtenteLoggato(false);
            }
            
        }
        if(trovato==true)
        {
            labelMessaggio.setText("Login eseguito con successo");
        }
        else
        {
            labelMessaggio.setText("Errore , password o email incorretti");
        }
        return trovato;
    }
    
}
