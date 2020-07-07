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

        //TODO: Récuperer les sockets connecter au serveur et en récuperer leur état.
        // Idées : On renvoie qui a gagné avec quel score lorsque les deux ont finis.
        // On rend visible la fenêtre quand il y'a 2 clients connectés.
        // -> setVisible(true) la vue lorsque les deux appuient sur un bouton Start.
    }
}