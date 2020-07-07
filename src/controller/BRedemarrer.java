package src.controller;

import src.modele.*;
import javax.swing.*;
import java.awt.event.*;

public class BRedemarrer extends JButton implements ActionListener {
    
    private State state;
    private AnswerField answerField;

	public BRedemarrer(State state){
		super("Redemarrer");
        this.state=state;
		this.addActionListener(this);

	}

    public void actionPerformed(ActionEvent e){
        System.out.println("test");
        }
        
}