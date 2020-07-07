package src.modele;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import src.parsing.*;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class State {

    private LinkedHashMap<String, String> allStates;
    private Parser pars;
    private int numQuestion;
    private ArrayList<String> state;
    private ArrayList<Integer> points;

    public State() throws ParserConfigurationException,
    SAXException, IOException {
        pars = new Parser();
        pars.Parse();
        allStates = saveStates();
        state = generateNextState();
        points = setPoints();
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

    public void setState(ArrayList<String> state) {
        this.state = state;
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

}