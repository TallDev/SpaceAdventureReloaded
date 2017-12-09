package SpaceAdventureReloaded.Util;

import SpaceAdventureReloaded.Game.Var;
import SpaceAdventureReloaded.GlobalVars;

import java.io.*;

public class SaveGameStats {

    public static void saveGameStats() {
        System.out.println("adasd");
        File f = new File("stats/" + GlobalVars.PlayerName + ".txt");
        if(f.exists() && !f.isDirectory()) {

            System.out.println("vllt");
            PrintWriter writer;
            try {
                writer = new PrintWriter("stats/" + GlobalVars.PlayerName + ".txt", "UTF-8");
                writer.println(Integer.toString(Var.schrott));
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            try {
                boolean fNew = f.createNewFile();
                if(fNew) {
                    System.out.println("ja");
                } else {
                    System.out.println("nein");
                }
                PrintWriter writer = new PrintWriter("stats/" + GlobalVars.PlayerName + ".txt", "UTF-8");
                writer.println(Integer.toString(Var.schrott));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
