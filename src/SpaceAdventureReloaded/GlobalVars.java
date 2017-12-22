package SpaceAdventureReloaded;

import org.jetbrains.annotations.Contract;

public class GlobalVars {

    public static boolean GameActive = false;
    public static String PlayerName;


    public static int startLeben = 2;


    @Contract(" -> fail")
    public static void killComplete() {
        System.exit(2);
    }
}
