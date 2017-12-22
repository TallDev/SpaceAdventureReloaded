package SpaceAdventureReloaded.statsWindow;

import SpaceAdventureReloaded.Game.Var;
import SpaceAdventureReloaded.GlobalVars;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class statsWindowForm {
    private JLabel LebenText;
    private JLabel LebenValue;
    private JPanel rootPanel;
    private JLabel SchrottText;
    private JLabel SchrottValue;
    private JLabel PlayerText;
    private JLabel NameValue;

    Timer timer;
    public static JFrame statsFrame;

    public statsWindowForm() {

        ImageIcon favicon = new ImageIcon("resources/favicon.png");
        statsFrame = new JFrame("Stats:");
        statsFrame.setContentPane(rootPanel);
        statsFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // statsFrame.setSize(400, 300);
        statsFrame.setLocation(300, 300);
        statsFrame.setIconImage(favicon.getImage());
        statsFrame.setResizable(false);
        statsFrame.pack();
        statsFrame.setVisible(true);


        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                LebenValue.setText(Integer.toString(Var.leben));
                SchrottValue.setText(Integer.toString(Var.schrott));
                NameValue.setText(GlobalVars.PlayerName);

            }
        }, 0, 10);

    }



}
