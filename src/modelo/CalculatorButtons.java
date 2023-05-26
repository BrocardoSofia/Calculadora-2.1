/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sofia
 */
public class CalculatorButtons 
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private Button numberButton;
    private Button equalButton;
    private Button operationButton;
    
    //---------------------------------------------------------------------------------- METODOS
    public CalculatorButtons()
    {
        operationButton= makeButton("/imagenes/boton1Dark.png","/imagenes/boton1Dark.png",
                                     "/imagenes/boton1MouseDark.png", "#c3c3c3",
                                     "/imagenes/boton1.png","/imagenes/boton1.png",
                                     "/imagenes/boton1Mouse.png", "#101103");
        equalButton = makeButton("/imagenes/boton2Dark.png","/imagenes/boton2Dark.png",
                                     "/imagenes/boton2MouseDark.png", "#c3c3c3",
                                     "/imagenes/boton2.png","/imagenes/boton2.png",
                                     "/imagenes/boton2Mouse.png", "#101103");
        numberButton = makeButton("/imagenes/boton3Dark.png","/imagenes/boton3Dark.png",
                                     "/imagenes/boton3MouseDark.png", "#daedc6",
                                     "/imagenes/boton3.png","/imagenes/boton3.png",
                                     "/imagenes/boton3Mouse.png", "#101103");
    }
    
    private Button makeButton(String iconDark, String pressedIconDark, String rolloverIconDark, String foregroundDark,
                              String icon, String pressedIcon, String rolloverIcon, String foreground)
    {
        ButtonImage lightMode= new ButtonImage(icon,pressedIcon,rolloverIcon, foreground);
        ButtonImage darkMode = new ButtonImage(iconDark,pressedIconDark,
                                     rolloverIconDark, foregroundDark);
        
        Button rta = new Button(darkMode, lightMode);
        return rta;
    }
    
    public Button getNumberButton()
    {
        return numberButton;
    }
    
    public Button getEqualButton()
    {
        return equalButton;
    }
    
    public Button getOperationButton()
    {
        return operationButton;
    }
    
    public void changeMode()
    {
        numberButton.changeMode();
        operationButton.changeMode();
        equalButton.changeMode();
    }
    
   
}
