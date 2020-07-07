package src.modele;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
//import src.parsing.*;

public class Main {
	
	public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException {
	
		/*
		State state = new State();
		//System.out.println(state.getStates());
		//System.out.println(state.getQuestions());
		//System.out.println(state.getAnswers());
		state.setNextState();
		System.out.println(state.getPoints());
		System.out.println(state.getQuestions());
		System.out.println(state.getQuestion());
		System.out.println(state.getAnswer());
		System.out.println(state.getPoint());
		*/

		Game g = new Game();
		g.Play();
		
	}
}