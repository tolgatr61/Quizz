package src.modele;

import java.util.*;

public class TimerRunner {

    private State state;

    public TimerRunner(State state) {
        this.state = state;
    }

    public void launchTimer(){
        Timer time = new Timer();
		time.schedule(new TimerSetter(state), 0, 30000);
    }
    
}