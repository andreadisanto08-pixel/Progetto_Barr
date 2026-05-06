package GUI;
import JAVA.AggiuntaOrdinazioneException;
import JAVA.BarManager;
import JAVA.OrdinazioneManager;
import JAVA.Prodotto;
import JAVA.Utente;
import JAVA.UtenteManager;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FrameOrdina 
{
    JFrame frame;
    ArrayList<UtenteManager> ManagerUtenti;
    ArrayList<BarManager> Bar;
    ArrayList<OrdinazioneManager> Ordinazioni;
    String storicoOrdini = "";
    String nomeUtente=""; 
    int n;
    double saldo;
    Utente u;
    public FrameOrdina(ArrayList<UtenteManager> ManagerUtenti,ArrayList<BarManager> Bar,ArrayList<OrdinazioneManager> Ordinazioni) 
    {
        this.Ordinazioni=Ordinazioni;
        this.Bar=Bar;
        this.saldo=saldo;
        this.ManagerUtenti=ManagerUtenti;
        Ordinazioni.add(new OrdinazioneManager());
        n++;
        frame = new JFrame("Ordina");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        //Ottengo dati dell'utente
        String nome="";
        String codiceUnivoco="";
        
        for(int i=0;i<ManagerUtenti.get(0).getUtenti().size();i++)
        {
            if(ManagerUtenti.get(0).getUtenti().get(i).getUtenteLoggato()==true)
            {
                saldo = ManagerUtenti.get(0).getUtenti().get(i).getSaldo();
                nome = ManagerUtenti.get(0).getUtenti().get(i).getNome();
                nomeUtente = nome;
                codiceUnivoco = ManagerUtenti.get(0).getUtenti().get(i).getCodiceUnivoco();
                u = ManagerUtenti.get(0).getUtenti().get(i);
            }
        }
        //JLabel titolo
        JLabel labelTitolo = new JLabel("Benvenuto  " + nome + " \nil tuo saldo è di " + saldo + "€");
        labelTitolo.setBounds(30, 20, 500, 30);
        //JLabel bottone + e cappuccino
        JLabel labelCappuccino = new JLabel(Bar.get(0).getProdotti().get(0).getNome() + " " + Bar.get(0).getProdotti().get(0).getDescrizione());
        JLabel image1 = new JLabel();
        ImageIcon imagei1 = new ImageIcon("img/imgCappuccino.jpg");
        Image scaled = imagei1.getImage().getScaledInstance(80,80,Image.SCALE_SMOOTH);
        ImageIcon imagefinal1 = new ImageIcon(scaled);
        image1.setIcon(imagefinal1);
        JButton cappuccinoButton = new JButton("+");
        
        cappuccinoButton.setBounds(380, 90, 50, 40);
        labelCappuccino.setBounds(130,70,230,80);
        image1.setBounds(30, 70, 80, 80);
        //label espresso
        JLabel labelEspresso = new JLabel(Bar.get(0).getProdotti().get(1).getNome() + " " + Bar.get(0).getProdotti().get(1).getDescrizione());
        JLabel image2 = new JLabel();
        ImageIcon imagei2 = new ImageIcon("img/CaffeEspresso.webp");
        Image scaled2 = imagei2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image2.setIcon(new ImageIcon(scaled2));
        JButton espressoButton = new JButton("+");
        image2.setBounds(30, 170, 80, 80);
        labelEspresso.setBounds(130, 170, 230, 80);
        espressoButton.setBounds(380, 190, 50, 40);
        //label macchiato
        JLabel labelMacchiato = new JLabel(Bar.get(0).getProdotti().get(2).getNome() + " " + Bar.get(0).getProdotti().get(2).getDescrizione());
        JLabel image3 = new JLabel();
        ImageIcon imagei3 = new ImageIcon("img/imgCaffeMacchiat0.jfif");
        Image scaled3 = imagei3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image3.setIcon(new ImageIcon(scaled3));
        JButton macchiatoButton = new JButton("+");
        image3.setBounds(30, 270, 80, 80);
        labelMacchiato.setBounds(130, 270, 230, 80);
        macchiatoButton.setBounds(380, 290, 50, 40);
        //label cotoletta
        JLabel labelCotoletta = new JLabel(Bar.get(0).getProdotti().get(3).getNome() + " " + Bar.get(0).getProdotti().get(3).getDescrizione());
        JLabel image4 = new JLabel();
        ImageIcon imagei4 = new ImageIcon("img/PaninoConLaCotoletta.jpg");
        Image scaled4 = imagei4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image4.setIcon(new ImageIcon(scaled4));
        JButton cotolettaButton = new JButton("+");
        image4.setBounds(30, 370, 80, 80);
        labelCotoletta.setBounds(130, 370, 230, 80);
        cotolettaButton.setBounds(380, 390, 50, 40);
        //label vegetariano
        JLabel labelVegetariano = new JLabel(Bar.get(0).getProdotti().get(4).getNome() + " " + Bar.get(0).getProdotti().get(4).getDescrizione());
        JLabel image5 = new JLabel();
        ImageIcon imagei5 = new ImageIcon("img/PaninoVegetariano.jfif");
        Image scaled5 = imagei5.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image5.setIcon(new ImageIcon(scaled5));
        JButton vegetarianoButton = new JButton("+");
        image5.setBounds(30, 470, 80, 80);
        labelVegetariano.setBounds(130, 470, 230, 80);
        vegetarianoButton.setBounds(380, 490, 50, 40);
        //label wurstel
        JLabel labelWurstel = new JLabel(Bar.get(0).getProdotti().get(5).getNome() + " " + Bar.get(0).getProdotti().get(5).getDescrizione());
        JLabel image6 = new JLabel();
        ImageIcon imagei6 = new ImageIcon("img/PaninoWurstel.jpg");
        Image scaled6 = imagei6.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image6.setIcon(new ImageIcon(scaled6));
        JButton wurstelButton = new JButton("+");
        image6.setBounds(30, 570, 80, 80);
        labelWurstel.setBounds(130, 570, 230, 80);
        wurstelButton.setBounds(380, 590, 50, 40);
        // label muffin
        JLabel labelMuffin = new JLabel(Bar.get(0).getProdotti().get(6).getNome() + " " + Bar.get(0).getProdotti().get(6).getDescrizione());
        JLabel image7 = new JLabel();
        ImageIcon imagei7 = new ImageIcon("img/MuffinCioccolato.jfif");
        Image scaled7 = imagei7.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image7.setIcon(new ImageIcon(scaled7));
        JButton muffinButton = new JButton("+");
        image7.setBounds(30, 670, 80, 80);
        labelMuffin.setBounds(130, 670, 230, 80);
        muffinButton.setBounds(380, 690, 50, 40);
        // label crema
        JLabel labelCrema = new JLabel(Bar.get(0).getProdotti().get(7).getNome() + " " + Bar.get(0).getProdotti().get(7).getDescrizione());
        JLabel image8 = new JLabel();
        ImageIcon imagei8 = new ImageIcon("img/BriocheCrema.jfif");
        Image scaled8 = imagei8.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image8.setIcon(new ImageIcon(scaled8));
        JButton cremaButton = new JButton("+");
        image8.setBounds(30, 770, 80, 80);
        labelCrema.setBounds(130, 770, 230, 80);
        cremaButton.setBounds(380, 790, 50, 40);
        // label brioche
        JLabel labelBriocheCioccolato = new JLabel(Bar.get(0).getProdotti().get(8).getNome() + " " + Bar.get(0).getProdotti().get(8).getDescrizione());
        JLabel image9 = new JLabel();
        ImageIcon imagei9 = new ImageIcon("img/BriocheCioccolato.jfif");
        Image scaled9 = imagei9.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image9.setIcon(new ImageIcon(scaled9));
        JButton briocheCioccolatoButton = new JButton("+");
        image9.setBounds(30, 870, 80, 80);
        labelBriocheCioccolato.setBounds(130, 870, 230, 80);
        briocheCioccolatoButton.setBounds(380, 890, 50, 40);
        // label cocacola
        JLabel labelCoca = new JLabel(Bar.get(0).getProdotti().get(9).getNome() + " " + Bar.get(0).getProdotti().get(9).getDescrizione());
        JLabel image10 = new JLabel();
        ImageIcon imagei10 = new ImageIcon("img/Cocacola.jfif");
        Image scaled10 = imagei10.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image10.setIcon(new ImageIcon(scaled10));
        JButton cocaButton = new JButton("+");
        image10.setBounds(30, 970, 80, 80);
        labelCoca.setBounds(130, 970, 230, 80);
        cocaButton.setBounds(380, 990, 50, 40);
        // label acqua
        JLabel labelAcqua = new JLabel(Bar.get(0).getProdotti().get(10).getNome() + " " + Bar.get(0).getProdotti().get(10).getDescrizione());
        JLabel image11 = new JLabel();
        ImageIcon imagei11 = new ImageIcon("img/acqua.jfif");
        Image scaled11 = imagei11.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image11.setIcon(new ImageIcon(scaled11));
        JButton acquaButton = new JButton("+");
        image11.setBounds(30, 1070, 80, 80);
        labelAcqua.setBounds(130, 1070, 230, 80);
        acquaButton.setBounds(380, 1090, 50, 40);
        //label succo di frutta
        JLabel labelSucco = new JLabel(Bar.get(0).getProdotti().get(11).getNome() + " " + Bar.get(0).getProdotti().get(11).getDescrizione());
        JLabel image12 = new JLabel();
        ImageIcon imagei12 = new ImageIcon("img/Succo.jfif");
        Image scaled12 = imagei12.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image12.setIcon(new ImageIcon(scaled12));
        JButton succoButton = new JButton("+");
        image12.setBounds(30, 1170, 80, 80);
        labelSucco.setBounds(130, 1170, 230, 80);
        succoButton.setBounds(380, 1190, 50, 40);
        //
        JLabel messaggioOrdinazione = new JLabel("");
        //JButton addaction linstener
        cappuccinoButton.addActionListener(e->ordinazione(messaggioOrdinazione,Bar.get(0).getProdotti().get(0),u));
        macchiatoButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(2), u));
        cotolettaButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(3), u));
        vegetarianoButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(4), u));
        wurstelButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(5), u));
        muffinButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(6), u));
        cremaButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(7), u));
        briocheCioccolatoButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(8), u));
        cocaButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(9), u));
        acquaButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(10), u));
        succoButton.addActionListener(e -> ordinazione(messaggioOrdinazione, Bar.get(0).getProdotti().get(11), u));
        //Jlabel messaggio finale
        messaggioOrdinazione.setBounds(10,1250,400,100);
        //bottoni finali
        JButton bottoneAzzera = new JButton("Resetta");
        bottoneAzzera.setBounds(250,1700,250,100);
        bottoneAzzera.addActionListener(e->eliminazione(messaggioOrdinazione,u,saldo));
        JButton tornaHome = new JButton("Concludi e torna alla home");
        tornaHome.setBounds(0,1700,250,100);
        tornaHome.addActionListener(e->tornaallaHome());
        //JPanel scroll
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(500,2000));
        JScrollPane scrollPanel = new JScrollPane(panel);
        scrollPanel.setBounds(0,0,500,600);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(16);
        panel.add(tornaHome);
        panel.add(bottoneAzzera);
        panel.add(labelTitolo);
        panel.add(image1);
        panel.add(labelCappuccino);
        panel.add(cappuccinoButton);
        panel.add(image2);
        panel.add(labelEspresso);
        panel.add(espressoButton);
        panel.add(image3);
        panel.add(labelMacchiato);
        panel.add(macchiatoButton);
        panel.add(image4);
        panel.add(labelCotoletta);
        panel.add(cotolettaButton);
        panel.add(image5);
        panel.add(labelVegetariano);
        panel.add(vegetarianoButton);
        panel.add(image6);
        panel.add(labelWurstel);
        panel.add(wurstelButton);
        panel.add(image7);
        panel.add(labelMuffin);
        panel.add(muffinButton);
        panel.add(image8);
        panel.add(labelCrema);
        panel.add(cremaButton);
        panel.add(image9);
        panel.add(labelBriocheCioccolato);
        panel.add(briocheCioccolatoButton);
        panel.add(image10);
        panel.add(labelCoca);
        panel.add(cocaButton);
        panel.add(image11);
        panel.add(labelAcqua);
        panel.add(acquaButton);
        panel.add(image12);
        panel.add(labelSucco);
        panel.add(succoButton);
        panel.add(messaggioOrdinazione);
        //frame add
        frame.add(scrollPanel);
        frame.setVisible(true);
    }
    public void eliminazione(JLabel labelMessaggioFinale,Utente u,double saldo)
    {
         u.setSaldo(saldo);
         labelMessaggioFinale.setText("");  
         Ordinazioni.get(0).getProdotti().clear();

    }
    public void tornaallaHome()
    {
        frame.dispose();
        new FrameHome(ManagerUtenti, Bar, Ordinazioni,nomeUtente,storicoOrdini);
    }
    public void ordinazione(JLabel labelMessaggioFinale,Prodotto p,Utente u)
    {
        String s="";

        try
        {
            Ordinazioni.get(0).aggiungiOrdinazione(u, p);
            u.setSaldo(u.getSaldo()-p.getPrezzo());
            storicoOrdini += nomeUtente + " ha ordinato: " + p.getNome() + " - " + p.getPrezzo() + "€\n";
            for(int i=0;i<Ordinazioni.get(0).getProdotti().size();i++)
            {
                Prodotto pe = Ordinazioni.get(0).getProdotti().get(i);
                s = s + "Hai ordinato: " + pe.getNome() + " al costo di " + pe.getPrezzo() + " € " + "<br>";
                

            }
            labelMessaggioFinale.setText("<html>" + s + "</html>");
            
        }
        catch(AggiuntaOrdinazioneException e)
        {
            System.out.println(e.getMessage());
            
        }
       

    }
}