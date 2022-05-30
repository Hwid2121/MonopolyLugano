package gui;

import java.awt.ComponentOrientation;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import gui.main.GameMain;
import gui.panels.PanelPregame;
import model.Card;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class PopUpPickCardPanel extends JPanel implements ActionListener  {

    // private JTextField textField;
    private JLabel desc;
    final private PopUpPickCardFrame framea;
    final private MonopolyCommandsPanel frameb;
    private JButton button;
    private Font s = new Font("SansSerif", Font.BOLD, 14);
    public PopUpPickCardPanel(MonopolyCommandsPanel frameB, PopUpPickCardFrame frameA, Card card)  {

        super();
        this.frameb = frameB;
        this.framea = frameA;
        
        BoxLayout lay = new BoxLayout(this, BoxLayout.Y_AXIS);
        // FlowLayout lay = new FlowLayout();
        
        setLayout(lay);
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setBackground(GameMain.SFONDO);

        // desc.setBounds(x, y, width, height);
 
        button = new JButton("CONTINUE");
        // button.setUI(GameMain.BUTTON_STYLE);
        button.setForeground(GameMain.CREMISI);
        button.setFont(s);
        button.setMinimumSize(new Dimension(120, 40));
        button.setPreferredSize(new Dimension(120, 40));

        desc = new JLabel(card.getDescription());
        desc.setFont(s);
        desc.setAlignmentX(Component.CENTER_ALIGNMENT);
        // button.setAlignmentX(Component.CENTER_ALIGNMENT);
        // desc.
        add(desc);
        add(Box.createRigidArea(new Dimension(0, 70)));
        add(button);
        setVisible(true);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
                // String s = textField.getText();

                    framea.dispose();
                    // frameb.swapPanel();

                    




            }
        });






    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
      
        
    }

}