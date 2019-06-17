/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

/**
 *
 * @author tanishagarg
 */
public class PlayerView {
    private static PlayerView playerView;
    PlayerProfile playerProfile = PlayerProfile.getPlayerProfileViewObject();
    MakeRequest makeRequest = MakeRequest.getMakeRequestObject();
    
    
    public static PlayerView getPlayerViewObject()
    {
        if(playerView == null)
        {
            playerView = new PlayerView();
        }
        
        return playerView;
    }
    
    public JPanel getPlayerView(){
        JPanel panel = new JPanel(new BorderLayout());
        JTabbedPane tab = new JTabbedPane();
        tab.add("My Profile", playerProfile.getPlayerProfileView());
        tab.add("Make Request", makeRequest.getMakeRequestView());
        
        panel.add(tab);
        return panel;
    }
    
    
    
    
}
