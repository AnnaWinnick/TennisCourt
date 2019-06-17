/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

import com.sun.org.apache.bcel.internal.Constants;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.Constructor;
import java.util.Enumeration;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.plaf.FontUIResource;

public class TennisCourtApp {

    
    public static void main(String[] args) {
        MapView map = new MapView();
        //HomeView homeView = new HomeView();
        JFrame mainFrame = new JFrame();
//        mainFrame.setContentPane(homeView.getHomeView());
        map.createMapView(mainFrame);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(DisplaySize.HOME_VIEW_WIDTH, DisplaySize.HOME_VIEW_HEIGHT);
        mainFrame.setVisible(true);
                   
    }
    
}
