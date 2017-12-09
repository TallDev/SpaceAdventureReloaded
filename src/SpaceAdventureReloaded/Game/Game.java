package SpaceAdventureReloaded.Game;

import SpaceAdventureReloaded.statsWindow.statsWindow;

public class Game {

    public Game() {
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
        new Var();

        new statsWindow();
    }

}
