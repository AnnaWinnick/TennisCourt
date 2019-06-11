/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tanishagarg
 */
public class PlayerProfile {
    private static PlayerProfile playerProfile;
    PlayerService playerService = PlayerService.getPlayerServiceObject();
    public static PlayerProfile getPlayerProfileViewObject()
    {
        if(playerProfile== null)
        {
           playerProfile = new PlayerProfile();
        }
        
        return playerProfile;
    }
    
    public JPanel getPlayerProfileView(){
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JPanel contentPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        
        JLabel name = new JLabel("Name");
        JTextField nametxt = new JTextField();
        JLabel age = new JLabel("Age");
        JTextField agetxt = new JTextField();
        JLabel level = new JLabel("Level");
        JTextField leveltxt = new JTextField();
        JLabel location = new JLabel("Location");
        JTextField locationtxt = new JTextField();
        JLabel cellPhone = new JLabel("CellPhone");
        JTextField cellPhonetxt = new JTextField();
        contentPanel.add(name);
        contentPanel.add(nametxt);
        contentPanel.add(age);
        contentPanel.add(agetxt);
        contentPanel.add(level);
        contentPanel.add(leveltxt);
        contentPanel.add(location);
        contentPanel.add(locationtxt);
        contentPanel.add(cellPhone);
        contentPanel.add(cellPhonetxt);
        JPanel cmdPanel = new JPanel(new GridLayout(1,0,5,5));
        JButton btnAdd = new JButton("Add");
        cmdPanel.add(btnAdd);
        panel.add(cmdPanel,BorderLayout.SOUTH);
        panel.add(contentPanel, BorderLayout.CENTER);
        
        
         btnAdd.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
         
             String name = nametxt.getText();
             int age = NumUtility.tryParseInt(agetxt.getText(), "age");
             String level = leveltxt.getText();
             String location = locationtxt.getText();
             String cellphone = cellPhonetxt.getText();
             Player createdPlayer = new Player (name, age, level, location, cellphone);
             playerService.savePlayer(createdPlayer);
        } 
    } );

        
        
        
        
        return panel;
    }
}
