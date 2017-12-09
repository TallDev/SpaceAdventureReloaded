package SpaceAdventureReloaded.Main;

import SpaceAdventureReloaded.Game.Game;
import SpaceAdventureReloaded.Startmenue.Startmenue;
import SpaceAdventureReloaded.Util.SaveGameStats;
import SpaceAdventureReloaded.Util.Util;
import SpaceAdventureReloaded.Util.getConfig;

public class Main {



    /*
    new SaveGameStats(); must be OVER  new Startmenue();

     */
    public static void main(String[] args) {

        new getConfig();
        new Startmenue();
         //new Game();  //Can now start via Startmenü


    }

}
