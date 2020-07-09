package src.view;

import src.modele.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEast extends JPanel implements ActionListener {

    private State state;
    private JLabel label1;
    private Timer timer=new Timer(1000, this);

    public PanelEast(State state) {
        this.state = state;
        state.generateCountTimer();
        timer.start();

        this.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        //this.state.ajoutEcouteur(this);

        this.label1 = new JLabel("Timer");
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        label1.setText("Temps restant : " + String.valueOf(this.state.getTimeCounter().getQuestionTime()) + "/30");
        this.add(label1);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getSource()==timer){
            this.repaint();
            label1.setText("Temps restant : " + String.valueOf(this.state.getTimeCounter().getQuestionTime()) + "/30");
            this.revalidate();

            if (this.state.getNumQuestion() > 9) {
                this.timer.stop();
            }
        }
    }
        
}