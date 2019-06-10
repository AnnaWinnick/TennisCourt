/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenniscourtapp;

import java.awt.Point;
/**
 *
 * @author winnann20
 */
public class Court {
    private String name;
    private Point location;
    private int numCourts;
    private boolean available;
    private String cost;
    private String[] amenities;

    public Court(String name, Point location, int numCourts, boolean available, String cost, String[] amenities) {
        this.name = name;
        this.location = location;
        this.numCourts = numCourts;
        this.cost = cost;
        this.amenities = amenities;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public int getNumCourts() {
        return numCourts;
    }

    public void setNumCourts(int numCourts) {
        this.numCourts = numCourts;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String[] getAmenities() {
        return amenities;
    }

    public void setAmenities(String[] amenities) {
        this.amenities = amenities;
    }
    
    public void book(Player p, String time, String skill){
        
    }
}
