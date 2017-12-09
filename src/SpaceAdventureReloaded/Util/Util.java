package SpaceAdventureReloaded.Util;

import javax.swing.*;


public class Util {

    public static final String GAME_WEBPAGE = "NO WEBPAGE AVIABLE";



    public static void errorMessage(String infoMessage, String titleBar, boolean killGame)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Fehler: " + titleBar, JOptionPane.WARNING_MESSAGE);
        if(killGame) {
            try {
                Thread.sleep(200l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(3);
        }
    }

}
