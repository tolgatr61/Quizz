package src.modele;

import java.util.*;

public class TimeCounter extends TimerTask {

    private State state;
    private Integer questionTime;

    public TimeCounter(State state) {
        this.state = state;
        this.questionTime = 0;
    }

    public void run() {

        if (this.state.getNumQuestion() > 9) {
            return;
        }

        if (this.questionTime == 30) {
            this.questionTime = 0;
            this.state.setNextState();
        }
        else {
            this.questionTime += 1;
        }
    }

    public Integer getQuestionTime() {
        return this.questionTime;
    }

    public void setQuestionTime(Integer questionTime) {
        this.questionTime = questionTime;
    }
}