/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import java.io.Serializable;


public class Question implements Serializable{
    private String name;
    private String type;
    private double weighting;
    
    public Question(){
        name = new String();
        type = new String();
        weighting = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeighting() {
        return weighting;
    }

    public void setWeighting(double weighting) {
        this.weighting = weighting;
    }
    
    
}
