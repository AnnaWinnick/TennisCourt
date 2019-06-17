/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanishagarg
 */
public class PlayerService {
    private static PlayerService playerService;
    private List<Player> players = new ArrayList<>();
    
    public static PlayerService getPlayerServiceObject()
    {
        if(playerService== null)
        {
           playerService = new PlayerService();
        }
        
        return playerService;
    }
    
    public PlayerService(){
        Player demo1 = new Player("Dan", 25, "intermediate", "Sammamish", "425-878");
        Player demo2 = new Player("Sarah", 22, "beginner", "Sammamish", "315-876");
        savePlayer(demo1);
        savePlayer(demo2);
    }
    
    
    public void savePlayer(Player c1)
    {
        players.add(c1);
        
    }
    
    public List<Player> getPlayers(){
        return players;
    }
    

    
}
