package GUI;
import JAVA.BarManager;
import JAVA.OrdinazioneManager;
import JAVA.UtenteManager;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrameLogin 
{
    JFrame frame;
    JTextField campoEmail;
    JPasswordField campoPassword;
    JLabel labelErrore;
    ArrayList<UtenteManager> ManagerUtenti;
    String destinazione;
    ArrayList<BarManager> Bar;
    ArrayList<OrdinazioneManager> Ordinazioni;
    public FrameLogin(ArrayList<UtenteManager> ManagerUtenti,String destinazione,ArrayList<BarManager> Bar,ArrayList<OrdinazioneManager> Ordinazioni)
    {
        this.Ordinazioni=Ordinazioni;
        this.Bar=Bar;
        this.destinazione=destinazione;
        this.ManagerUtenti= ManagerUtenti;
        //Frame base
        frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("daBeppe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);
        //Label email e campo email
        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(30,30,80,25);
        campoEmail = new JTextField();
        campoEmail.setBounds(120,30,100,25);
        //Label password e campo password
        JLabel labelPassword = new JLabel("Password: ");
        labelPassword.setBounds(30,70,80,25);
        campoPassword = new JPasswordField();
        campoPassword.setBounds(120,70,100,25);
        //Label errore
        labelErrore = new JLabel("");
        labelErrore.setBounds(30,150,250,25);
        //Bottone login
        JButton bottoneLogin= new JButton("Login");
        bottoneLogin.setBounds(120,120,100,30);
        bottoneLogin.addActionListener(e->loginGui());
        //frame add
        frame.add(labelEmail);
        frame.add(campoEmail);
        frame.add(campoPassword);
        frame.add(labelPassword);
        frame.add(bottoneLogin);
        frame.add(labelErrore);
        //Frame set visible
        frame.setVisible(true);

    }
    //metodo login per actionlistener
    public void loginGui()
    {
        boolean gestionePermesso=false;
        String email = campoEmail.getText();
        String password = new String(campoPassword.getPassword());
        boolean trovato = ManagerUtenti.get(0).login(email, password, labelErrore);
        if(trovato)
        {
            
            if(destinazione.equals("Ordina"))
            {
                frame.dispose();
                new FrameOrdina(ManagerUtenti,Bar,Ordinazioni);
            }
            else if(destinazione.equals("Visualizza ordini"))
            {
                for(int i=0;i<ManagerUtenti.get(0).getUtenti().size();i++)
                {
                    if(ManagerUtenti.get(0).getUtenti().get(i).getUtenteLoggato()==true && ManagerUtenti.get(0).getUtenti().get(i).getPermessoGestione()==true)
                    {
                        gestionePermesso=true;
                        labelErrore.setText("Permesso concesso");
                        frame.dispose();
                        new FrameVisualizzaOrdini(ManagerUtenti,Bar,Ordinazioni);
                    }

                    
                }
                if(gestionePermesso==false)
                {
                    labelErrore.setText("Permesso negato");
                }
            }
        }
        

    }

    

    
}
