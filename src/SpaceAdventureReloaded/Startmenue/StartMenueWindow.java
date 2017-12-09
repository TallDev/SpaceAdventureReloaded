package SpaceAdventureReloaded.Startmenue;

import SpaceAdventureReloaded.Game.Game;
import SpaceAdventureReloaded.GlobalVars;
import SpaceAdventureReloaded.Util.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class StartMenueWindow {
    private JButton startGameButton;
    private JButton optionsButton;
    private JButton spielBeendenButton;
    private JPanel rootPanel;
    private JLabel PlayerWelcome;
    private JLabel optionsIconLabel;
    private JLabel logo;


    static boolean a = false;
    static String s;
    boolean b = true;

    public static JFrame MainMenueFrame;

    public StartMenueWindow() {
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenueFrame.setVisible(false);
                new Game();
                GlobalVars.GameActive = true;
            }
        });


        ImageIcon favicon = new ImageIcon("resources/favicon.png");
        MainMenueFrame = new JFrame("Space Adventure");
        MainMenueFrame.setContentPane(rootPanel);
        MainMenueFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenueFrame.setSize(400, 300);
        MainMenueFrame.setLocationRelativeTo(null);
        MainMenueFrame.setIconImage(favicon.getImage());
        MainMenueFrame.pack();
        MainMenueFrame.setVisible(true);

        while (a && b) {
            PlayerWelcome.setText(s);
            b = false;
        }
        optionsIconLabel.addComponentListener(new ComponentAdapter() {
        });
        optionsIconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                // TODO: Schow Options Window

            }
        });
        logo.addComponentListener(new ComponentAdapter() {
        });
        logo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI(Util.GAME_WEBPAGE));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (URISyntaxException e1) {
                        Util.errorMessage("Ignoriere diese Meldung! Du kannst den Fehler melden, dann wird er beim nächsten mal gefixt", "Fehler", false);
                    }
                }
            }
        });
    }


    public static void setPlayerWelcome(String mess) {
        s = mess;
        a = true;
    }
}

