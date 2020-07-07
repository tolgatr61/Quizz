package src.router;

import java.net.*;
import java.io.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Server {
    
    public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException {
        ServerSocket ss = new ServerSocket(4999);
        Boolean run = true;
        while (run = true){
        Socket s = ss.accept();

        System.out.println("Client connected");
        }
    }
}