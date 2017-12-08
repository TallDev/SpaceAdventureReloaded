package SpaceAdventureReloaded.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class Var {

    // Window
    static JFrame jf1;

    static int screenWith = 800;
    static int screenHeight = 600;
    static boolean gameResizable = false;

    static String gameTitle = "Space Adventure";

    // Moving
    static boolean moveUp = false, moveDown = false, moveLeft = false, moveRight = false;


    // Keys

    static int goUp = KeyEvent.VK_UP;
    static int goDown = KeyEvent.VK_DOWN;
    static int goLeft = KeyEvent.VK_LEFT;
    static int goRight = KeyEvent.VK_RIGHT;



    // img
    static BufferedImage ib1, ib2;
    static BufferedImage irakete;
    static BufferedImage iflamme1, iflamme2;
    static BufferedImage igegner1;

    static BufferedImage ischrott1, ischrott2, ischrott3;

    static int backgroundY1 = 0, backgroundY2 = -600, backgroundSpeed = 9;


    // Flugobjekt
    static int x = 400, y = 400;
    static int speedUp = 3, speedDown = 2, speedLeft = 2, speedRight = 2;
    static boolean kollidiert = false, verloren = false;

    // Flamme
    static int flammeAnimation;

    // Gegner
    static int gegnerCount = 10;
    static int gegnerx[] = new int[gegnerCount], gegnery[] = new int[gegnerCount];
    static int gegnerspeed[] = new int[gegnerCount];

    // Schrott
    static int schrott = 0;
    static int schrottx1[] = new int[5], schrotty1[] = new int[5];
    static int schrottx2[] = new int[5], schrotty2[] = new int[5];
    static int schrottx3, schrotty3;
    // static int schrottSpeed[] = new int[5];
    static int schrottSpeed1[] = new int[5], schrottSpeed2[] = new int[2], schrottSpeed3;


    // Player
    static boolean life = true;
    static int leben = 2;



    // Label
    static Label lbl1;

    public Var() {

        try {
            // Favicons
//            favicon = new ImageIcon(faviconUrl);
            // Background
            ib1 = ImageIO.read(new File("resources/bg1.png"));
            ib2 = ImageIO.read(new File("resources/bg1.png"));
            // Rakete
            irakete = ImageIO.read(new File("resources/rakete.png"));
            // Flamme
            iflamme1 = ImageIO.read(new File("resources/flamme1.1.png"));
            iflamme2 = ImageIO.read(new File("resources/flamme1.2.png"));
            // Gegner
            igegner1 = ImageIO.read(new File("resources/gegner1.png"));
            // Schrott
            ischrott1 = ImageIO.read(new File("resources/schrott1.png"));
            ischrott2 = ImageIO.read(new File("resources/schrott2.png"));
            ischrott3 = ImageIO.read(new File("resources/schrott3.png"));



        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("[ERROR] -> Bilder konnten nicht geladen werden: " + e.getMessage());
        }





        gegnerspeed[0] = 2;
        gegnerspeed[1] = 1;
        gegnerspeed[2] = 5;
        gegnerspeed[3] = 3;
        gegnerspeed[4] = 2;


        schrottSpeed1[0] = 2;
        schrottSpeed1[1] = 1;
        schrottSpeed1[2] = 5;
        schrottSpeed1[3] = 3;
        schrottSpeed1[4] = 2;

        schrottSpeed2[0] = 4;
        schrottSpeed2[1] = 3;

        schrottSpeed3 = 8;


    }

}
