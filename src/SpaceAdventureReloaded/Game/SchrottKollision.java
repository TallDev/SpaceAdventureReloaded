package SpaceAdventureReloaded.Game;

import java.util.Timer;
import java.util.TimerTask;

public class SchrottKollision {

    public SchrottKollision() {
        Timer timer;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                // Bronze
                for(int i = 0; i < 4; i++) {
                    if(Var.x >= Var.schrottx1[i] - 50 && Var.x <= Var.schrottx1[i] + 70 && Var.y >=Var.schrotty1[i] - 70 && Var.y <= Var.schrotty1[i] + 50) {

                        Var.schrott += 5;
                        Var.schrotty1[i] =-200;

                    }
                }
                // Silber
                for(int i = 0; i < 4; i++) {
                    if(Var.x >= Var.schrottx2[i] - 50 && Var.x <= Var.schrottx2[i] + 70 && Var.y >=Var.schrotty2[i] - 70 && Var.y <= Var.schrotty2[i] + 50) {

                        Var.schrott += 1;
                        Var.schrotty2[i] =-1500;

                    }
                }

                // Gold
                if(Var.x >= Var.schrottx3 - 50 && Var.x <= Var.schrottx3 + 70 && Var.y >=Var.schrotty3 - 70 && Var.y <= Var.schrotty3 + 50) {

                    Var.schrott += 10;
                    Var.schrotty3 =-4000;

                }



            }
        }, 0, 10);
    }

}
