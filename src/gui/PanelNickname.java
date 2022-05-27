package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.colorchooser.*;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.ScrollBarUI;

import model.Monopoly;
import model.Player;

import java.awt.Color;
import javax.swing.SwingUtilities;

import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.io.*;
import java.util.ArrayList;
import java.util.prefs.BackingStoreException;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.imageio.ImageIO;
import javax.swing.Box;
import java.awt.image.BufferedImage;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.Scrollable;

import java.awt.TextField;


public class PanelNickname  extends JPanel{



    private final int num;
    private ArrayList<NicknameForm> playersList = new ArrayList<>();

    public PanelNickname (){

        //  num = GameMain.monopoly.getNumOfplayer();
        num = 3;
        BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        setLayout(layout);
        


        for(int i=0; i< num; i++){
            NicknameForm temp = new NicknameForm(i);
            add(temp);
            playersList.add(temp);
            add(Box.createRigidArea(new Dimension(10, 30)));
        }


        


        
            
   

        JButton button = new JButton("Confirm");
        add(Box.createRigidArea(new Dimension(50, 50)));
        add(button);
        button.setUI(GameMain.BUTTON_STYLE);
        setBackground(GameMain.SFONDO);
        button.setPreferredSize(new Dimension(120,60));
        button.setMinimumSize(new Dimension(120,60));
        // button.setBackground(GameMain.);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int i=0;
                for(NicknameForm x: playersList){
                    GameMain.monopoly.addPlayer(new Player(x.getFieldText()));
                    System.out.println(GameMain.monopoly.getPLayer(i).getNickname());
                    i++;
                }

                  
            }
        });

        
        
    }

    

}