package src.modele;

import java.util.*;

public class TimeCountRunner {

    private State state;
    private TimeCounter timeCount;

    public TimeCountRunner(State state) {
        this.state = state;
        this.timeCount = new TimeCounter(state);
    }

    public void launchTimer(){
        Timer time = new Timer();
		time.schedule(timeCount, 0, 1000);
    }

    public TimeCounter getTimeCount() {
        return this.timeCount;
    }
    
}