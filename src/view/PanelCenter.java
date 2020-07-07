package src.view;

import src.modele.*;
import src.controller.*;
import javax.swing.*;
import java.awt.*;

public class PanelCenter extends JPanel {

    private State state;

    public PanelCenter(State state) {
        this.state = state;

        this.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));

        AnswerField answField = new AnswerField(state);
		answField.setColumns(20);
        this.add(answField);

        BValider bValider = new BValider(state, answField);
        this.add(bValider);

        this.setVisible(true);
    }
    
}