/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sofia
 */
public class Background {
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private String lightModeColor;
    private String darkModeColor;
    private boolean darkMode;
    
    //---------------------------------------------------------------------------------- METODOS
    public Background(String lightModeColor, String darkModeColor)
    {
        this.lightModeColor = lightModeColor;
        this.darkModeColor = darkModeColor;
        darkMode = false;
    }
    
    public boolean getDarkMode()
    {
        return darkMode;
    }
    
    public String getColor()
    {
        String color;
        
        if(darkMode)
            color = darkModeColor;
        else
            color = lightModeColor;
        
        return color;
    }
    
    public void changeMode()
    {
        if(darkMode)
            darkMode = false;
        else
            darkMode = true;
    }
   
}
