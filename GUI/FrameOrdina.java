package GUI;

import JAVA.BarManager;
import JAVA.UtenteManager;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FrameOrdina 
{
    ArrayList<UtenteManager> ManagerUtenti;
    ArrayList<BarManager> Bar;
    public FrameOrdina(ArrayList<UtenteManager> ManagerUtenti) 
    {
        

        this.ManagerUtenti=ManagerUtenti;
        JFrame frame = new JFrame("Ordina");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //Ottengo dati dell'utente
        String nome="";
        double saldo=0;
        String codiceUnivoco="";
        for(int i=0;i<ManagerUtenti.get(0).getUtenti().size();i++)
        {
            if(ManagerUtenti.get(0).getUtenti().get(i).getUtenteLoggato()==true)
            {
                saldo = ManagerUtenti.get(0).getUtenti().get(i).getSaldo();
                nome = ManagerUtenti.get(0).getUtenti().get(i).getNome();
                codiceUnivoco = ManagerUtenti.get(0).getUtenti().get(i).getCodiceUnivoco();
            }
        }
        //JLabel titolo
        JLabel labelTitolo = new JLabel("Benvenuto  " + nome + " \nil tuo saldo è di " + saldo + "€");
        labelTitolo.setBounds(30, 20, 500, 30);
        //JLabel bottone + e brioche
        //JPanel scroll
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(500,1500));
        JScrollPane scrollPanel = new JScrollPane(panel);
        scrollPanel.setBounds(0,0,500,600);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(16);
        panel.add(labelTitolo);
        //frame add
        frame.add(scrollPanel);
        frame.setVisible(true);
    }
}