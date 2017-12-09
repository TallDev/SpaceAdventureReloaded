package SpaceAdventureReloaded.Game;

import SpaceAdventureReloaded.GlobalVars;
import SpaceAdventureReloaded.Startmenue.StartMenueWindow;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Gui {

    public Gui() {
        Var.jf1 = new JFrame();

        Var.jf1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Var.jf1.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

                GlobalVars.GameActive = false;
                StartMenueWindow.MainMenueFrame.setVisible(true);

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        // Size
        Var.jf1.setSize(Var.screenWith, Var.screenHeight);
        Var.jf1.setResizable(Var.gameResizable);

        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.setLayout(null);


        // Label
        Var.lbl1 = new Label();
        Var.lbl1.setBounds(0, 0, Var.screenWith, Var.screenHeight);
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.add(Var.lbl1);
        Var.lbl1.setVisible(true);

        // JLabel NameLabel = new JLabel(Var.gameTitle);
        // NameLabel.setBounds(90, 0, Var.screenWith, Var.screenHeight);
        // NameLabel.setVisible(true);

        //Var.jf1.add(NameLabel);


        /*
        Var.jf1.add(MainMenue.MainText);
        MainMenue.MainText.setVisible(true);
        */

        Var.jf1.setTitle(Var.gameTitle);

        Var.jf1.requestFocus();

        // Var.jf1.setIconImage(setIconImage(ImageIO.read(new File("resources/favicon.png"))));

        ImageIcon img = new ImageIcon("resources/favicon.png");

        Var.jf1.setIconImage(img.getImage());



        Var.jf1.setVisible(true);
    }

}
