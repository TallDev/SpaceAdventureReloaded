package SpaceAdventureReloaded.Startmenue;


import SpaceAdventureReloaded.GlobalVars;
import SpaceAdventureReloaded.Util.Util;

import javax.swing.*;

public class newPlayer {



    public static String showNewPlayerDialogue(boolean schleife) {
        // a jframe here isn't strictly necessary, but it makes the example a little more real
        JFrame frame = new JFrame("Gebe deinen Neuen Spielernamen ein.", null);
        if (schleife) {
            boolean a = false;

            String name = JOptionPane.showInputDialog(frame, "Wenn unter dem eingegebenen Namen, ein Name eines anderen Spielers eingegeben wird, werden dem seine Spielstände abgerufen!", "Gebe deinen Neuen Spielernamen ein.", JOptionPane.INFORMATION_MESSAGE);


            a = true;
            Util.errorMessage("Spieler Gesetzt!", "OK!", false);
            return name;


        } else {
            String name = JOptionPane.showInputDialog(frame, "Wenn unter dem eingegebenen Namen, ein Name eines anderen Spielers eingegeben wird, werden dem seine Spielstände abgerufen!", "Gebe deinen Neuen Spielernamen ein.", JOptionPane.INFORMATION_MESSAGE);
            if (!name.equals(null)) {
                Util.errorMessage("Spieler Gesetzt!", "OK!", false);
                return name;
            } else {
                Util.errorMessage("Spieler konnte nicht gesetzt werden!", "Fehler", false);
                return GlobalVars.PlayerName;
            }
        }

    }
}
