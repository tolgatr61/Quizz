package src.view;

import src.modele.*;
import javax.swing.*;
import java.awt.*;

public class PanelEast extends JPanel implements EcouteurModele {

    private State state;
    private JLabel label1;

    public PanelEast(State state) {
        this.state = state;
        state.generateCountTimer();

        this.setLayout(new FlowLayout(FlowLayout.LEFT,100,50));
        this.state.ajoutEcouteur(this);

        this.label1 = new JLabel("Timer");
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        label1.setText("Temps restant : " + String.valueOf(this.state.getTimeCounter().getQuestionTime()));
        this.add(label1);
        this.setVisible(true);

    }

    public void modeleMisAJour(Object source){
        this.repaint();
        this.state.getTimeCounter().setQuestionTime(0);
        this.revalidate();

    }

}