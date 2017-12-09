package SpaceAdventureReloaded.Util;

import javax.swing.*;


public class Util {

    public static final String GAME_WEBPAGE = "No web page found";



    public static void errorMessage(String infoMessage, String titleBar, boolean killGame)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Error:" + titleBar, JOptionPane.WARNING_MESSAGE);
        if(killGame) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(3);
        }
    }
    public static void errorDieMessage(String infoMessage, boolean killGame)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Du bist gestorben!", JOptionPane.INFORMATION_MESSAGE);

        if(killGame) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(3);
        }
    }

}
