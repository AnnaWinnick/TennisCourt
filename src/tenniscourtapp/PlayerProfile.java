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
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
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
        
        JFrame errorFrame = new JFrame();
        errorFrame.setTitle("Error");
        errorFrame.setSize(20, 20);
        errorFrame.add(new JLabel("Please fill all fields"));
        errorFrame.setVisible(false);
        
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
        
        
        btnAdd.addActionListener((ActionEvent e) -> {
        String name1 = nametxt.getText();
        int age1 = NumUtility.tryParseInt(agetxt.getText(), "age");
        String level1 = leveltxt.getText();
        String location1 = locationtxt.getText();
        String cellphone = cellPhonetxt.getText();
        
        Scanner namescan = new Scanner(name1);
        Scanner agescan = new Scanner(agetxt.getText());
        Scanner levelscan = new Scanner(level1);
        Scanner locationscan = new Scanner(location1);
        Scanner cellscan = new Scanner(cellphone);
        if (namescan.hasNext() && agescan.hasNext() && levelscan.hasNext() && locationscan.hasNext() && cellscan.hasNext()){
            Player createdPlayer = new Player(name1, age1, level1, location1, cellphone);
            playerService.savePlayer(createdPlayer);
        }else{
            errorFrame.setVisible(true);
            errorFrame.setAlwaysOnTop(true);
        }

                      
        
       });
      
        
        
        
        
        return panel;
    }
}
