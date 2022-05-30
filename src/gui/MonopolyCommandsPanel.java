
package gui;

import javax.swing.JButton;
import javax.swing.JPanel;
import gui.main.CLayoutForGame;
import gui.main.GameMain;
import gui.panels.PanelMonopoly;
import model.Monopoly;
import model.Player;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.ComponentOrientation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;

public class MonopolyCommandsPanel extends JPanel implements ActionListener {

    private Dimension dim = new Dimension(130, 80);

    private PopUpPickCardFrame pop;
    private InfoSquareFrame infoFrame;
    private JButton buy = new JButton("BUY");
    private JButton pass = new JButton("PASS");
    private JButton sell = new JButton("SELL");
    private JButton build = new JButton("BUILD");
    private JButton pay = new JButton("PAY FINE");
    private JButton dice = new JButton("TROW DICE");
    private JButton card = new JButton("USE CARD");
    private JButton info = new JButton("INFO SQUARE");

    private BonusSquareFrame bonusFrame;

    private JButton cont = new JButton("CONTINUE...");

    private JButton pick = new JButton("PICK CARD");
    private Player player;

    private Monopoly monopoly = GameMain.monopoly;

    private CLayoutForGame main;

    public MonopolyCommandsPanel(Player playerx, CLayoutForGame mainb, PanelMonopoly panell) {
        super();
        this.player = playerx;
        main = mainb;

        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 50, 20);
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        setBackground(GameMain.SFONDO);

        setBorder(GameMain.BLACKLINE);
        setLayout(layout);
        setFont(GameMain.COURIER);

        switch (main.getFase()) {

            case 0:
                trowDice();
                System.out.println(main.getFase());
                main.setFase(1);
                break;

            case 1:

                switch (monopoly.getTable().getSquare(player.getPosition()).getColor()) {

                    case "cards":
                        pickCard();
                        break;

                    case "jail":
                        jailSquare();
                        break;

                    case "empty":
                        emptySquare();
                        break;

                    // case "goto":
                    // goToJailSquare();
                    // break;

                    case "bonus":
                        bonusSquare();
                        // break;
                        // case "malus":
                        // bonusSquare();
                        break;

                    default:
                        if (monopoly.getTable().getPropertySquare(player.getPosition()).getOwner() == null) {
                            propertySquareEMPTY();
                        } else
                            propertySquareOwned();
                        System.out.println(monopoly.getTable().getSquare(player.getPosition()).getName());
                        // jailSquare();
                        // // emptySquare();
                        // // bonusSquare();
                        break;

                }

        }

        buy.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                if (player.getMoney() >= monopoly.getTable().getSquarePrice(player.getPosition())
                        && monopoly.getTable().getSquareOwner(player.getPosition()) == null) {

                    monopoly.getTable().setSquareOwner(player);
                    player.buyPropertySquare(monopoly.getTable().getPropertySquare(player.getPosition()));
                    player.decreaseMoney(monopoly.getTable().getSquarePrice(player.getPosition()));

                    // main.refreshPAGE();

                } else {
                    System.out.println("non abbastanza soldi");
                }

            }

        });

        info.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                // cardsDeck deck = new cardsDeck();
                // Card card = deck.randomCard();
                // System.out.println("CARD: " + card.getDescription());

                // deck.playCard(deck.getIndex(), player);

                // pop = new PopUpPickCardFrame(card, (MonopolyCommandsPanel) pick.getParent());

                // pop.setVisible(true);

                // main.nextPage();

                infoFrame = new InfoSquareFrame((MonopolyCommandsPanel) pick.getParent(), player, monopoly);
                infoFrame.setVisible(true);

            }

        });

        sell.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                if (monopoly.getTable().getSquareOwner(player.getPosition()) == player) {

                    player.increaseMoney(monopoly.getTable().getPropertySquare(player.getPosition()).getPriceSell());
                    player.removePropertySquare(monopoly.getTable().getPropertySquare(player.getPosition()));

                    monopoly.getTable().resetOwner(player.getPosition());
                    refresh();

                } else {
                    // TO D
                    System.out.println("NONTUA");
                }

            }

        });

        pass.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                main.passTurn();

            }

        });

        build.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

            }

        });

        pay.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                JailSquare.payFine(player);
                JailSquare.freeFromJail(player);

            }

        });

        cont.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                bonusFrame = new BonusSquareFrame((MonopolyCommandsPanel) pick.getParent(), player);
                bonusFrame.setVisible(true);
                main.passTurn();

            }

        });

        pick.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                cardsDeck deck = new cardsDeck();
                Card card = deck.randomCard();
                System.out.println("CARD: " + card.getDescription());

                deck.playCard(deck.getIndex(), player);

                pop = new PopUpPickCardFrame(card, (MonopolyCommandsPanel) pick.getParent());

                pop.setVisible(true);

                main.passTurn();

            }

        });

        dice.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                monopoly.throwDice();
                monopoly.setPositionPlayer(player);

                System.out.println("SI FUNZ " + monopoly.getListOfPlayer().get(0).getPosition());

                if (monopoly.getTable().getColor(player.getPosition()) == "jail") {
                    player.setJail(JailSquare.getDays());
                }

                main.nextPage();
                main.incrementFase();

            }

        });

        card.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg) {

                if (JailSquare.checkFreeJailCard(player)) {
                    JailSquare.freeFromJail(player);
                } else {

                }

            }

        });

        setVisible(true);

    }

    public void trowDice() {

        dice.setPreferredSize(dim);

        this.add(dice);

    }

    public void bonusSquare() {

        pass.setPreferredSize(dim);
        cont.setPreferredSize(dim);

        this.add(cont);

    }

    public void propertySquareEMPTY() {

        info.setPreferredSize(dim);
        buy.setPreferredSize(dim);
        pass.setPreferredSize(dim);

        // this.add(infoFrame);

        this.add(info);
        this.add(buy);

        this.add(pass);

    }

    public void propertySquareOwned() {

        sell.setPreferredSize(dim);

        build.setPreferredSize(dim);

        pass.setPreferredSize(dim);

        this.add(sell);
        this.add(build);
        this.add(pass);

    }

    public void emptySquare() {

        pass.setPreferredSize(dim);
        this.add(pass);

    }

    public void jailSquare() {

        pay.setPreferredSize(dim);

        dice.setPreferredSize(dim);

        card.setPreferredSize(dim);

        pass.setPreferredSize(dim);

        this.add(pay);
        this.add(dice);
        this.add(card);
        this.add(pass);

    }

    public void goToJailSquare() {

        pass.setPreferredSize(dim);

        this.add(pass);

    }

    public void pickCard() {

        pick.setPreferredSize(dim);
        pass.setPreferredSize(dim);

        this.add(pass);
        this.add(pick);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void refresh() {
        main.nextPage();
    }

}
