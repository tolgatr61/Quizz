package src.parsing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
  
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
  
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser {

    private List<Themes> thematics;

    public Parser() {
        this.thematics = null;
    }
    
    public void Parse() throws ParserConfigurationException,
    SAXException, IOException {

        //Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Load the input XML document, parse it and return an instance of the
        // Document class.

        Document document = builder.parse(new File("src/parsing/XML/ThemeSimpson.xml"));

        List<Themes> themes = new ArrayList<Themes>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
             Node node = nodeList.item(i);

             if (node.getNodeType() == Node.ELEMENT_NODE) {
                  Element elem = (Element) node;

                  // Get the value of the ID attribute.
                  String ID = node.getAttributes().getNamedItem("ID").getNodeValue();

                  // Get the value of all sub-elements.
                  String question = elem.getElementsByTagName("Question")
                                      .item(0).getChildNodes().item(0).getNodeValue();

                  String reponse = elem.getElementsByTagName("Reponse").item(0)
                                      .getChildNodes().item(0).getNodeValue();

                  Integer point = Integer.parseInt(elem.getElementsByTagName("Point")
                                      .item(0).getChildNodes().item(0).getNodeValue());

                  themes.add(new Themes(ID, question, reponse, point));
             }
        }

        this.thematics = themes;

    }

    public void setThematics(List<Themes> th) {
        this.thematics = th;
    }

    public List<Themes> getThematics() {
        return this.thematics;
    }

}