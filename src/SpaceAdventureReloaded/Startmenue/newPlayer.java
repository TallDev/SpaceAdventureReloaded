package SpaceAdventureReloaded.Startmenue;

import javax.swing.*;

public class newPlayer {



    public static String showNewPlayerDialogue() {
        // a jframe here isn't strictly necessary, but it makes the example a little more real
        JFrame frame = new JFrame("Gebe deinen Neuen Spielernamen ein.", null);

        // prompt the user to enter their name
        String name = JOptionPane.showInputDialog(frame, "Wenn unter dem eingegebenen Namen, ein Name eines anderen Spielers eingegeben wird, werden dem seine Spielstände abgerufen!");

        return name;
    }

}
