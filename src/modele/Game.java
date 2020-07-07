package src.modele;

import java.util.Scanner;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Game {

    private int userPoint = 0;
    
    public void Play() throws ParserConfigurationException,
    SAXException, IOException {

        State state = new State();

        System.out.println("Bienvenue sur le Quizz ! : \n");

        System.out.println("----------------------------------- Questions -----------------------------------");

        for (int numQuestion = 0; numQuestion < 10; numQuestion++ ){

            System.out.println(state.getQuestion());
            System.out.println("Ecrivez votre reponse : \n");
            
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            if (state.getAnswer().equals(answer)) {
                this.userPoint += state.getPoint();
                System.out.println("Vrai , vous avez " + String.valueOf(this.userPoint) + " points ! \n ");
                state.setNextState();
            }
            else if (!(state.getAnswer().equals(answer))){
                System.out.println("Faux , la bonne réponse est : " + state.getAnswer() + " , vous avez " + String.valueOf(this.userPoint) + " points ! \n ");
                state.setNextState();
            }

            if (numQuestion == 9) {
                sc.close();
                System.out.println("\n Jeu termine");
                System.out.println("\n Vous avez obtenu " + String.valueOf(this.userPoint) + " points ! ");
            }
        }

    }
}