package src.controller;

import src.modele.*;
import javax.swing.*;
import java.awt.event.*;

public class AnswerField extends JTextField {

    private State state;

    public AnswerField(State state) {
        super("Reponse", 20);
        this.state = state;
    }
    
}