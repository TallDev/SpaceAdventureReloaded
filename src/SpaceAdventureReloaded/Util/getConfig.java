package SpaceAdventureReloaded.Util;


import SpaceAdventureReloaded.Game.Var;
import SpaceAdventureReloaded.GlobalVars;
import SpaceAdventureReloaded.Startmenue.StartMenueWindow;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class getConfig {



    public getConfig() {
        getPlayerName();
        getPlayerStats();



    }

    public void getPlayerStats() {

        File f = new File("stats/" + GlobalVars.PlayerName + ".txt");
        if(f.exists() && !f.isDirectory()) {

            try {
                BufferedReader br;
                br = new BufferedReader(new FileReader("stats/" + GlobalVars.PlayerName + ".txt"));

                String sCurrentLine;
                //if(br.readLine().length() == 1) {
                    String currLine = br.readLine();
                   // System.out.println(currLine);
                        Var.schrott = Integer.parseInt(currLine);

               /* } else {
                    Util.errorMessage("Stats Lese Fehler", "ERROR", false);
                }
*/

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                f.createNewFile();
                PrintWriter writer = new PrintWriter("stats/" + GlobalVars.PlayerName + ".txt", "UTF-8");
                writer.println("0");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void getPlayerName() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse("stats/stats.xml");

            NodeList playerList = doc.getElementsByTagName("name");
            if(playerList.getLength() > 1 || playerList.getLength() == 0) {
                Util.errorMessage("Config Fehler", "Fehler in der Config bitte überprüfen!", true);
            }

            String playerName = playerList.item(0).getTextContent();
            StartMenueWindow.setPlayerWelcome("Willkommen " + playerName);


            GlobalVars.PlayerName = playerName;



        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

