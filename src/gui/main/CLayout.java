package gui.main;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import gui.panels.PanelPlayers;
import gui.panels.PanelPregame;

/**
 * 
 * Panel of the Pregame.
 * 
 * 
 * @author taftan@usi.ch & sardoa@usiu.ch
 * @version 24/05/2022
 */
public class CLayout extends JPanel implements ActionListener {

    private CardLayout mainFrame = new CardLayout();

    private GameMain main;

    public CLayout(GameMain game) {
        super();
        main = game;

        this.setLayout(mainFrame);
        JPanel panelPregame = new PanelPregame(this);

        this.add(panelPregame, "1");
        mainFrame.show(this, "1");

    }

    /**
     * Switch the card to the panel Players.
     */
    public void switchCard() {

        JPanel panelPlayers = new PanelPlayers(this);
        this.add(panelPlayers, "2");

        mainFrame.next(this);

    }

    /**
     * Method to finish the pregame.
     */
    public void endPreGame() {

        this.setVisible(false);

        main.mainGame();

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

    }

}
