package src.modele;

import java.util.*;

class TimerSetter extends TimerTask {

    private State state;

    public TimerSetter(State state){
        this.state = state;
    }
    public void run() {
        this.state.setNextState();
    }
}