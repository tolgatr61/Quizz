package src.modele;

import java.util.Scanner;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import src.parsing.*;

public class Game {

    private int userPoint = 0;
    
    public void Play() throws ParserConfigurationException,
    SAXException, IOException {

        Parser pars = new Parser();
        pars.Parse();

        System.out.println("Bienvenue sur le Quizz ! : \n");

        System.out.println("----------------------------------- Questions -----------------------------------");

        for (int numQuestion = 0; numQuestion < 10; numQuestion++ ){

            System.out.println(pars.getThematics().get(numQuestion).getQuestion());
            System.out.println("Ecrivez votre reponse : \n");
            
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            if (pars.getThematics().get(numQuestion).getReponse().equals(answer)) {
                this.userPoint += pars.getThematics().get(numQuestion).getPoint();
                System.out.println("Vrai , vous avez " + String.valueOf(this.userPoint) + " points ! \n ");
            }
            else if (!(pars.getThematics().get(numQuestion).getReponse().equals(answer))){
                System.out.println("Faux , la bonne réponse est : " + pars.getThematics().get(numQuestion).getReponse() + " , vous avez " + String.valueOf(this.userPoint) + " points ! \n ");
            }

            if (numQuestion == 9) {
                sc.close();
                System.out.println("\n Jeu termine");
                System.out.println("\n Vous avez obtenu " + String.valueOf(this.userPoint) + " points ! ");
            }
        }

    }
}
