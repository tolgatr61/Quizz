/*

package src.view;

import src.modele.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.*;

public class ViewTimeCountRunner {

    private JPanel panel;
    private JLabel label;
    private State state;
    private ViewTimerCounter timeCount;


    public ViewTimeCountRunner(JPanel panel, JLabel label, State state) {
        this.panel = panel;
        this.label = label;
        this.state = state;
        this.timeCount = new ViewTimerCounter(panel, label, state);
    }

    public void launchTimer(){
        Timer time = new Timer();
		time.schedule(this.timeCount, 0, 1000);
    }

}

*/