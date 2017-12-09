package SpaceAdventureReloaded.Game;

import SpaceAdventureReloaded.GlobalVars;
import SpaceAdventureReloaded.Startmenue.StartMenueWindow;
import SpaceAdventureReloaded.Startmenue.Startmenue;
import SpaceAdventureReloaded.Util.Util;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class Var {

    public static boolean debugMode = false;
    public static boolean gameStarted = true;


    // Window
    public static JFrame jf1;

    public static int screenWith = 800;
    public static int screenHeight = 600;
    public static boolean gameResizable = false;

    public static String gameTitle = "Space Adventure";

    // Moving
    public static boolean moveUp = false, moveDown = false, moveLeft = false, moveRight = false;


    // Keys

    public static int goUp = KeyEvent.VK_UP;
    public static int goDown = KeyEvent.VK_DOWN;
    public static int goLeft = KeyEvent.VK_LEFT;
    public static int goRight = KeyEvent.VK_RIGHT;



    // img
    public static BufferedImage ib1, ib2;
    public static BufferedImage irakete;
    public static BufferedImage iflamme1, iflamme2;
    public static BufferedImage igegner1;

    public static BufferedImage ischrott1, ischrott2, ischrott3;

    public static int backgroundY1 = 0, backgroundY2 = -600, backgroundSpeed = 9;


    // Flugobjekt
    public static int x = 400, y = 400;
    public static int speedUp = 3, speedDown = 2, speedLeft = 2, speedRight = 2;
    public static boolean kollidiert = false, verloren = false;

    // Flamme
    public static int flammeAnimation;

    // Gegner
    public static int gegnerCount = 10;
    public static int gegnerx[] = new int[gegnerCount], gegnery[] = new int[gegnerCount];
    public static int gegnerspeed[] = new int[gegnerCount];

    // Schrott
    public static int schrott = 0;
    public static int schrottx1[] = new int[5], schrotty1[] = new int[5];
    public static int schrottx2[] = new int[5], schrotty2[] = new int[5];
    public static int schrottx3, schrotty3;
    // public static int schrottSpeed[] = new int[5];
    public static int schrottSpeed1[] = new int[5], schrottSpeed2[] = new int[2], schrottSpeed3;


    // Player
    public static boolean life = true;
    public static int leben = 2;



    // Label
    public static Label lbl1;


    public static void kill(String reason) {
        Var.jf1.setVisible(false);
        StartMenueWindow.MainMenueFrame.setVisible(true);
        Util.errorMessage(reason, "Du bist gestorben", false);
    }


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
            System.exit(2);
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
