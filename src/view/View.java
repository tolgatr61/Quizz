package src.view;

import src.modele.*;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class View {
    public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException {

        State state = new State();
        new GenerateView(state);

        }
}