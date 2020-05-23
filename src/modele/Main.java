package src.modele;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
//import src.parsing.*;

public class Main {
	
	public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException {
	
		//Parser pars = new Parser();
        //pars.Parse();
        //System.out.println(pars.getThematics().get(9).getQuestion());
		//System.out.println(pars.getThematics().get(9).getReponse());
		//System.out.println(pars.getThematics().get(9).getPoint());

		Game g = new Game();
		g.Play();
		
	}
}
