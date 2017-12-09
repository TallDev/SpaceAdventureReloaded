package SpaceAdventureReloaded.Game;

import SpaceAdventureReloaded.Util.getConfig;
import SpaceAdventureReloaded.statsWindow.statsWindow;

public class Game {

    public Game() {
        new Var();

        new getConfig();

        new Background();
        new FlammeAnimation();
        new GegnerKollision();
        new GegnerMovement();
        new Gui();
        new KeyHandler();
        new Label();
        new PlayerMovement();
        new SchrottKollision();
        new SchrottMovement();


        new statsWindow();
    }

}
