/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

/**
 *
 * @author tanishagarg
 */
public class Player {
    private String name;
    private int age;
    private String level;
    private String location;
    private String cellNumber;
    
    public Player(String name, int age, String level, String location, String cellNumber) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.location = location;
        this.cellNumber = cellNumber;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getLevel(){
        return level;
    }
    
    public String getLocation(){
        return location;
    }
    
}
