package SpaceAdventureReloaded.Util;


import SpaceAdventureReloaded.Startmenue.StartMenueWindow;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class getConfig {



   public getConfig() {

       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

       try {
           DocumentBuilder builder = factory.newDocumentBuilder();

           Document doc = builder.parse("config/config.xml");

           NodeList playerList = doc.getElementsByTagName("name");
           if(playerList.getLength() > 1 || playerList.getLength() == 0) {
                Util.errorMessage("Config Fehler", "Fehler in der Config bitte überprüfen!", true);
           }

            String playerName = playerList.item(0).getTextContent();
           StartMenueWindow.setPlayerWelcome("Willkommen " + playerName);


       } catch (ParserConfigurationException e) {
           e.printStackTrace();
       } catch (SAXException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }



   }




    }


