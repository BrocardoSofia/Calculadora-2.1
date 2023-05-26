/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sofia
 */
public class Button 
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private ButtonImage darkModeButton;
    private ButtonImage lightModeButton;
    private boolean darkMode;
    
    //---------------------------------------------------------------------------------- METODOS
    public Button(ButtonImage darkModeButton, ButtonImage lightModeButton)
    {
        this.darkModeButton = darkModeButton;
        this.lightModeButton = lightModeButton;
        darkMode = false;//se inicializa en light mode
    }
    
    //para obtener las caracteristicas del boton
    public ButtonImage getButton()
    {
        ButtonImage rta;
        if(darkMode)
            rta = darkModeButton;
        else
            rta = lightModeButton;
        
        return rta;
    }
    
    public void changeMode()
    {
        //cambio el modo 
        if(darkMode)
        {
            darkMode = false;
            
        }
        else
        {
            darkMode = true;
            
        }

    }
}
