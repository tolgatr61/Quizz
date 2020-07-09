package src.view;

import src.modele.*;
import javax.swing.*;
import java.awt.*;

public class ViewTimerCounter extends JPanel {

    private JPanel panel;
    private JLabel label;
    private State state;

    public ViewTimerCounter(JPanel panel, JLabel label, State state) {
        this.panel = panel;
        this.label = label;
        this.state = state;
    }

    public void run() {
        this.panel.repaint();
        this.label.setText("Temps restant : " + String.valueOf(this.state.getTimeCounter().getQuestionTime()));
        this.panel.revalidate();
    }
    
}