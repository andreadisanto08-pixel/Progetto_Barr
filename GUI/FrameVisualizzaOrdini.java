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
    JFrame frame;
    ArrayList<UtenteManager> ManagerUtenti;
    ArrayList<BarManager> Bar;
    ArrayList<OrdinazioneManager> Ordinazioni;
    public FrameVisualizzaOrdini(ArrayList<UtenteManager> ManagerUtenti,ArrayList<BarManager> Bar ,ArrayList<OrdinazioneManager> Ordinazioni)
    {

        this.ManagerUtenti = ManagerUtenti;
        this.Bar = Bar;
        this.Ordinazioni = Ordinazioni;
        String s="";
        frame = new JFrame("Ordini");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        for(int i=0;i<Ordinazioni.size();i++)
        {
            for(int j=0;j<Ordinazioni.get(i).getProdotti().size();j++)
            s=s+ Ordinazioni.get(i).getProdotti().get(j).getNome() + "<br>";
            
        }
        JLabel label = new JLabel("<html>" + s + "</html>");
        label.setBounds(0,0,300,200);
        JButton cancella = new JButton("Ordini svolti");
        cancella.setBounds(0,300,150,100);
        JButton tornaHome = new JButton("Torna alla home");
        tornaHome.setBounds(150,300,150,100);
        tornaHome.addActionListener(e->tornaHome());
       
        cancella.addActionListener(e->azzera(label));
        frame.add(tornaHome);
        frame.add(label);
        frame.add(cancella);
        frame.setVisible(true);

    }
    public void azzera(JLabel label)
    {
        for(int i=0;i<Ordinazioni.size();i++)
        {
            Ordinazioni.clear();
            label.setText("");

        }
        
    }
    public void tornaHome()
    {
        frame.dispose();
        new FrameHome(ManagerUtenti, Bar, Ordinazioni);
        
    }
}
   