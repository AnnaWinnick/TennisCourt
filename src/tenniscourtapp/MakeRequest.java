/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

import java.awt.BorderLayout;
import java.awt.Label;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tanishaga
 */
public class MakeRequest {
    private static MakeRequest makeRequest;
    JTable table = null;
    PlayerService playerService = PlayerService.getPlayerServiceObject();
    public static MakeRequest getMakeRequestObject()
    {
        if(makeRequest== null)
        {
           makeRequest = new MakeRequest();
        }
        
        return makeRequest;
    }
    
    
    public JPanel getMakeRequestView(){
        JPanel panel = new JPanel(new BorderLayout());
        List<Player> players = playerService.getPlayers();
        MakeRequestTableModel makeRequestTableModel = new MakeRequestTableModel(players);
        table = new JTable(makeRequestTableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(table);
        //scrollPane.getViewport().setBackground(java.awt.Color.PINK);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new Label("Make Requests"), BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
       
        return panel;
        
    }
    
    
     private class MakeRequestTableModel extends AbstractTableModel {

        List<Player> players;

        public MakeRequestTableModel(List<Player> players) {
            this.players = players;
        }
      

        @Override
        public int getRowCount() {
            return players.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public String getColumnName(int col) {
            String value = "";
            if(col == 0){
                value = "Name";
            }
            
            if(col == 1){
               value = "Age";
            }
            
            if(col == 2){
               value = "Level";
            }
            if(col == 3){
                value = "Cell Phone";
            }
            return value;
        }
        

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Object result = null;
            if(columnIndex == 0 ){   
               result = players.get(rowIndex).getName();
            }
            else if(columnIndex == 1 ){
                result = players.get(rowIndex).getAge();
            }
            else if(columnIndex == 2 ){
                result = players.get(rowIndex).getLevel();
            }
            else if(columnIndex == 3 ){
                result = players.get(rowIndex).getCellNumber();
            }

         
            return result;
            
            
            
          
        }
        
        @Override
        public Class<?> getColumnClass(int col) {
            return String.class;
        }
        
        
        }
        
        
    }  
    
    
    
    
    
    
    
    

