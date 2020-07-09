package src.modele;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import src.parsing.*;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Timer.*;

public class State extends AbstractModeleEcoutable {

    private LinkedHashMap<String, String> allStates;
    private Parser pars;
    private int numQuestion;
    private ArrayList<String> state;
    private ArrayList<Integer> points;
    private Integer userPoint;
    private TimeCountRunner timeCounter;

    public State() throws ParserConfigurationException,
    SAXException, IOException {
        super();
        pars = new Parser();
        pars.Parse();
        allStates = saveStates();
        state = generateNextState();
        points = setPoints();
        userPoint = 0;
        timeCounter = new TimeCountRunner(this);
        this.ecouteurs= new ArrayList<>();
    }

    public ArrayList<String> generateNextState() {
        ArrayList<String> state = new ArrayList<String>();

        if (this.numQuestion >= 9) {
            state.add(this.getQuestions().get(9));
            state.add(this.getAnswers().get(9));
            return state;
        }

        state.add(this.getQuestions().get(this.numQuestion));
        state.add(this.getAnswers().get(this.numQuestion));
        return state;
    }

    public void setNextState() {
        this.numQuestion += 1;
        this.setState(this.generateNextState());
        this.getTimeCounter().setQuestionTime(0);
        fireChangement();
    }

    public ArrayList<Integer> setPoints() {
        ArrayList<Integer> points = new ArrayList<Integer>();
        for (Integer i = 0; i <= 9; i++) {
            points.add(this.pars.getThematics().get(i).getPoint());
        }
        return points;
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public Integer getPoint() {
        if (this.numQuestion >= 9) {
            return this.points.get(9);
        }
        return this.points.get(this.numQuestion);
    }

    public void setUserPoint(Integer userPoint) {
        this.userPoint = userPoint;
        fireChangement();
    }

    public Integer getUserPoint() {
        return this.userPoint;
    }

    public void setState(ArrayList<String> state) {
        this.state = state;
        fireChangement();
    }

    public ArrayList<String> getState() {
        return this.state;
    }

    public LinkedHashMap<String, String> saveStates() {
        
        LinkedHashMap<String, String> states = new LinkedHashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            states.put(this.pars.getThematics().get(i).getQuestion(), pars.getThematics().get(i).getReponse());
        }

        return states;
    }

    public LinkedHashMap<String, String> getStates() {
        return this.allStates;
    }

    public void setStates(LinkedHashMap<String, String> allStates) {
        this.allStates = allStates;
    }

    public ArrayList<String> getQuestions() {
        ArrayList<String> questions = new ArrayList<String>();
        for ( String key : this.allStates.keySet() ) {
            questions.add(key);
        }
        return questions;
    }

    public ArrayList<String> getAnswers() {
        ArrayList<String> answers = new ArrayList<String>();
        for ( String value : this.allStates.values()) {
            answers.add(value);
        }
        return answers;
    }

    public String getQuestion() {
        return this.state.get(0);
    }

    public String getAnswer() {
        return this.state.get(1);
    }

    public int getNumQuestion() {
        return this.numQuestion;
    }

    public void generateCountTimer() {
        this.timeCounter.launchTimer();
    }

    public TimeCounter getTimeCounter() {
        return this.timeCounter.getTimeCount();
    }

}