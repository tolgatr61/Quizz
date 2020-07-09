package src.controller;

import src.modele.*;
import javax.swing.*;
import java.awt.event.*;

public class BValider extends JButton implements ActionListener {
    
    private State state;
    private AnswerField answerField;

	public BValider(State state, AnswerField answerField){
		super("Valider");
        this.state=state;
        this.answerField = answerField;
		this.addActionListener(this);

	}

    public void actionPerformed(ActionEvent e){

        if (answerField.getText().equals(state.getAnswer())){
            
            answerField.setText("");
            state.setUserPoint(state.getUserPoint() + state.getPoint());
            state.setNextState();

            if (state.getNumQuestion() >= 10) {
                this.setVisible(false);
            }
        }
        else {
            state.setNextState();

            if (state.getNumQuestion() >= 10) {
                this.setVisible(false);
            }
        }
        }
        
}