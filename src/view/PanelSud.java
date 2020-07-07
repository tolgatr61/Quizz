package src.view;

import src.modele.*;
import javax.swing.*;
import java.awt.*;

public class PanelSud extends JPanel implements EcouteurModele {

    private State state;
    private JLabel label1;

    public PanelSud(State state) {
        this.state = state;

        this.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));
        this.state.ajoutEcouteur(this);

        this.label1 = new JLabel("Score");
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        label1.setText("Score : " + String.valueOf(this.state.getUserPoint()));
        this.add(label1);


        this.setVisible(true);
    }

    public void modeleMisAJour(Object source){
        this.repaint();
        this.label1.setText("Score : " + String.valueOf(this.state.getUserPoint()));
        this.revalidate();

    }
    
}