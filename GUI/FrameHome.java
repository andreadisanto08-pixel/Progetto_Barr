package GUI;
import JAVA.UtenteManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class FrameHome 
{
    JFrame frame;
    ArrayList<UtenteManager> ManagerUtenti;
    public FrameHome(ArrayList<UtenteManager> ManagerUtenti)
    {
        this.ManagerUtenti=ManagerUtenti;
        //Frame
        frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("daBeppe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);
        ImageIcon imageLogo = new ImageIcon("Progetto_Barr/img/logo.png");
        frame.setIconImage(imageLogo.getImage());
        //LabelImmagineLogo
        JLabel immagineLabel = new JLabel();
        Image newImage = imageLogo.getImage().getScaledInstance(500,250,Image.SCALE_SMOOTH);
        ImageIcon immagineLogo = new ImageIcon(newImage);
        immagineLabel.setBounds(0, 25, 500, 250);
        immagineLabel.setIcon(immagineLogo);
        //LabelTesto
        JLabel labelTesto = new JLabel();
        labelTesto.setText("<html><p style='font-size:20px;font-weight:bold'>Benvenuto al DaBeppe bar</p><p style='font-size:11px'>Concediti una colazione o un panino a un prezzo imperdibile!</p></html>");
        labelTesto.setBounds(25,300,500,150);
        //Label ImmaginePanini
        JLabel immaginePanini = new JLabel();
        ImageIcon iconPanini = new ImageIcon("Progetto_Barr/img/ImmaginePanini.png");
        Image scaled = iconPanini.getImage().getScaledInstance(300, 400,Image.SCALE_SMOOTH);
        ImageIcon finalIconPanini = new ImageIcon(scaled);
        immaginePanini.setIcon(finalIconPanini);
        immaginePanini.setBounds(100,240,500,800);
        //Label ImmagineColazione
        JLabel immagineColazione = new JLabel();
        ImageIcon iconColazione = new ImageIcon("Progetto_Barr/img/ColazioneImmagine.png");
        Image scaledColazione = iconColazione.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        ImageIcon finalColazione = new ImageIcon(scaledColazione);
        immagineColazione.setIcon(finalColazione);
        immagineColazione.setBounds(100,700,500,800);
        //Bottoni
        JButton bottoneOrdina = new JButton("Ordina");
        bottoneOrdina.setBounds(0,1350,250,150);
        JButton bottoneVisualizzaOrdini = new JButton("Visualizza ordini");
        bottoneVisualizzaOrdini.setBounds(250,1350,250,150);
        //Panel scroll
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(500,1500));
        JScrollPane scrollPanel = new JScrollPane(panel);
        scrollPanel.setBounds(0,0,500,600);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(16);
        panel.add(immagineLabel);
        panel.add(labelTesto);
        panel.add(immaginePanini);
        panel.add(immagineColazione);
        panel.add(bottoneVisualizzaOrdini);
        panel.add(bottoneOrdina);
        //FrameAdd
        frame.add(scrollPanel);
        //action listeners
        bottoneOrdina.addActionListener(e->portaLogin("Ordina"));
        bottoneVisualizzaOrdini.addActionListener(e->portaLogin("Visualizza ordini"));
        //Frame setVisibile
        frame.setVisible(true);
    }
    public void portaLogin(String destinazione)
    {
        
        new FrameLogin(ManagerUtenti,destinazione);
        frame.dispose();
    }
    
}
