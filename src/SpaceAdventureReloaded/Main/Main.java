package SpaceAdventureReloaded.Main;

import SpaceAdventureReloaded.Game.Game;
import SpaceAdventureReloaded.GlobalVars;
import SpaceAdventureReloaded.Startmenue.Startmenue;
import SpaceAdventureReloaded.Startmenue.newPlayer;
import SpaceAdventureReloaded.Util.SaveGameStats;
import SpaceAdventureReloaded.Util.Util;
import SpaceAdventureReloaded.Util.getConfig;

public class Main {



    /*
    new SaveGameStats(); must be OVER  new Startmenue();

     */
    public static void main(String[] args) {

        //new getConfig();
        new Startmenue();
        new getConfig();
        Util.errorMessage("Willkommen " + GlobalVars.PlayerName + "! Du bist nicht " + GlobalVars.PlayerName + "? Dann kannst du den Spieler auf dem Personenknopf ändern", "Willkommen", false);

        //new Game();  //Can now start via Startmenü


    }

}
