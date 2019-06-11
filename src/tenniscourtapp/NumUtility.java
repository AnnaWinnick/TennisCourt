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
public class NumUtility {
    
    
    public static int tryParseInt(String input, String fieldName) {
        int retVal;
        try {
          retVal = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
          throw new NumberFormatException(String.format("Please enter valid numeric value for field %s", fieldName));
        }
        return retVal;
      }
    
     public static double tryParseDouble(String input, String fieldName) {
        double retVal;
        try {
          retVal = Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
          throw new NumberFormatException(String.format("Please enter valid numeric value for field %s", fieldName));
        }
        return retVal;
      }
    
    
    
    
    
    
    
    
    
    
    
    
}
