/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sofia
 */
public class ButtonImage 
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private String icon;
    private String pressedIcon;
    private String rolloverIcon;
    private String foreground;
    
    //---------------------------------------------------------------------------------- METODOS
    public ButtonImage(String icon, String pressedIcon, String rolloverIcon, String foreground)
    {
        this.icon = icon;
        this.pressedIcon = pressedIcon;
        this.rolloverIcon = rolloverIcon;
        this.foreground = foreground;
    }
    
    public String getIcon()
    {
        return icon;
    }
    
    public String getPressedIcon()
    {
        return pressedIcon;
    }
    
    public String getRolloverIcon()
    {
        return rolloverIcon;
    }
    
    public String getForeground()
    {
        return foreground;
    }
}
