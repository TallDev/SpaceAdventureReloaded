package SpaceAdventureReloaded.Startmenue;

import java.io.IOException;

public class Startmenue {

    public Startmenue() {
        try {
            new StartMenueWindow();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
