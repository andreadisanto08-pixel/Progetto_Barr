package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameVisualizzaOrdini {

    public FrameVisualizzaOrdini() {

        JFrame frame = new JFrame("Ordini");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("SCHERMATA ORDINI");
        label.setBounds(50,50,200,30);

        frame.add(label);

        frame.setVisible(true);
    }
}
   