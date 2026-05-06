package GUI;

import JAVA.BarManager;
import JAVA.OrdinazioneManager;
import JAVA.UtenteManager;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameVisualizzaOrdini 
{
    String nomeUtente;
    String storico;
    JFrame frame;
    ArrayList<UtenteManager> ManagerUtenti;
    ArrayList<BarManager> Bar;
    ArrayList<OrdinazioneManager> Ordinazioni;
    public FrameVisualizzaOrdini(String nomeUtente, String storico,ArrayList<UtenteManager> ManagerUtenti,ArrayList<BarManager> Bar ,ArrayList<OrdinazioneManager> Ordinazioni)
    {

        this.ManagerUtenti = ManagerUtenti;
        this.Bar = Bar;
        this.Ordinazioni = Ordinazioni;
        this.nomeUtente = nomeUtente;
        this.storico = storico;
        frame = new JFrame("Ordini");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JButton cancella = new JButton("Ordini svolti");
        cancella.setBounds(0,300,150,100);
        
        JButton tornaHome = new JButton("Torna alla home");
        tornaHome.setBounds(150,300,150,100);
        tornaHome.addActionListener(e->tornaHome());
        JLabel label = new JLabel("<html><b>" + nomeUtente + "</b> ha ordinato:<br>" + storico + "</html>");
        label.setBounds(20, 20, 250, 200);
        cancella.addActionListener(e->azzera(label));
        frame.add(tornaHome);
        frame.add(label);
        frame.add(cancella);
        frame.setVisible(true);

    }
    public void azzera(JLabel label)
    {
        nomeUtente="";
        label.setText("");
        storico="";
    }
    public void tornaHome()
    {
        frame.dispose();
        new FrameHome(ManagerUtenti, Bar, Ordinazioni, nomeUtente, storico);
    }
}
   