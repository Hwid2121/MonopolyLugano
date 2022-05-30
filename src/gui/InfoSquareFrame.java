package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.BoxLayout;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;


import javax.swing.JPanel;


import gui.main.GameMain;

import model.Card;
import model.Monopoly;
import model.Player;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class InfoSquareFrame extends JFrame implements ActionListener {

    private JPanel panel;

    public InfoSquareFrame(MonopolyCommandsPanel parentPanel, Player player, Monopoly monopolya){

        super();
        Monopoly monopoly = monopolya;
        MonopolyCommandsPanel parentPan = parentPanel;
        panel  = new InfoSquarePanel(player, this, monopoly);
        


        setVisible(false);
        setPreferredSize(new Dimension(900, 350));
        setResizable(false);
        
        setLocationRelativeTo(null);
        // setLocationRelativeTo(null);
        this.getContentPane().setBackground( GameMain.SFONDO   );
        BoxLayout laymain = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(laymain);
        setUndecorated(true);

        JLabel label = new JLabel("INFO SQUARE: ");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("SansSerif", Font.BOLD, 14));
        label.setSize(new Dimension(20, 20));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        

        
        add(label);
        // add(Box.createRigidArea(new Dimension(5, 20)));
        add(panel);


        pack();
        // setVisible(false);






    }
















    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }




}