/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
public class HomeView {
    PlayerView playerView = PlayerView.getPlayerViewObject();
    
    
    public JPanel getHomeView(){
        JTabbedPane tabView = new JTabbedPane();
        tabView.add("Player", playerView.getPlayerView());
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new Label("TennisCourt App"), BorderLayout.NORTH);
        panel.add(tabView, BorderLayout.CENTER);
        
        return panel;
    }
    
}
