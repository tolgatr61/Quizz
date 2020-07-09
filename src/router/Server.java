package src.router;

import java.net.*;
import java.util.*;
import java.io.*;

import javax.sound.sampled.Port;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Server {
    
    public static void main(String[] args) throws ParserConfigurationException,
    SAXException, IOException {
        ServerSocket ss = new ServerSocket(4999);
        System.out.println("Server succesfuly online with Port : 4999.\nWaiting for client connections...");
        Boolean run = true;

        ArrayList<Socket> lSocket = new ArrayList<Socket>();

        Integer clientNumber = 0;

        while (run == true){
            Socket s = ss.accept();

            lSocket.add(s);

            clientNumber += 1;
            System.out.println("Client : " + String.valueOf(clientNumber) + " succesfuly connected.");

            System.out.println(lSocket);
        }
    }
}