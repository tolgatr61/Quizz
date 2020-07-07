package src.router;

import src.view.*;
import src.modele.*;
import java.net.*;
import java.io.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Client {

    public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException {
        Socket s = new Socket("localhost", 4999);

        State state = new State();
        new GenerateView(state);

    }
}