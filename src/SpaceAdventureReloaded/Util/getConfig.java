package SpaceAdventureReloaded.Util;


import SpaceAdventureReloaded.Game.Var;
import SpaceAdventureReloaded.GlobalVars;
import SpaceAdventureReloaded.Startmenue.StartMenueWindow;
import SpaceAdventureReloaded.Startmenue.newPlayer;
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


    public static void getPlayerName() {



        File f = new File("stats/stats.txt");
        if(f.exists() && !f.isDirectory()) {

            try {
                BufferedReader br;
                br = new BufferedReader(new FileReader("stats/stats.txt"));

                String playername = br.readLine();
                Util.setPlayerNameLocal(playername);
                // StartMenueWindow.setPlayerWelcome("Willkommen " + playername);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                f.createNewFile();
                PrintWriter writer = new PrintWriter("stats/stats.txt", "UTF-8");
                writer.println("");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void setPlayerName(String playername) {

        Util.setPlayerNameLocal(playername);
        try {
            // Write name in File
            File file = new File("stats/stats.txt");
            if (file.exists() && !file.isDirectory()) {

                PrintWriter writer = new PrintWriter("stats/stats.txt", "UTF-8");
                writer.println(playername);
                writer.close();


            } else {
                file.createNewFile();
                PrintWriter writer = new PrintWriter("stats/stats.txt", "UTF-8");
                writer.println(playername);
                writer.close();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}

