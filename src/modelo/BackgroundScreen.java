/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sofia
 */
public class BackgroundScreen extends Background
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private String colorLetterResultLight;
    private String colorLetterResultDark;
    private String colorLetterLight;
    private String colorLetterDark;
    
    //---------------------------------------------------------------------------------- METODOS
    public BackgroundScreen(String lightModeColor, String darkModeColor, 
                            String colorLetterResultLight, String colorLetterResultDark,
                            String colorLetterLight, String colorLetterDark)
    {
        super(lightModeColor,darkModeColor);
        this.colorLetterResultLight = colorLetterResultLight;
        this.colorLetterResultDark = colorLetterResultDark;
        this.colorLetterLight = colorLetterLight;
        this.colorLetterDark = colorLetterDark;
    }
    
    public String getColorLetterResult()
    {
        String color;
        
        if(super.getDarkMode())
            color = colorLetterResultDark;
        else
            color = colorLetterResultLight;
        
        return color;
    }
    
    public String getColorLetter()
    {
        String color;
        
        if(super.getDarkMode())
            color = colorLetterDark;
        else
            color = colorLetterLight;
        
        return color;
    }
    
}
