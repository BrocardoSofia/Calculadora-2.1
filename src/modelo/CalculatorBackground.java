/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sofia
 */
public class CalculatorBackground 
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private BackgroundScreen screenBackground;
    private Background buttonsBackground;
    
    
    //---------------------------------------------------------------------------------- METODOS
    public CalculatorBackground()
    {
        //String colorLetterResultLight, String colorLetterResultDark,String colorLetterLight, String colorLetterDark
        screenBackground = new BackgroundScreen("#dcf4f4","#15283f",
                                    "#616261","#a9abaa",
                                    "#181818","#f2f4f3");
        buttonsBackground = new Background("#f2f4f3","#1e3858");
    }
    
    public String getLetterResult()
    {
        return screenBackground.getColorLetterResult();
    }
    
    public String getLetter()
    {
        return screenBackground.getColorLetter();
    }
    
    public String getScreenBackground()
    {
        return screenBackground.getColor();
    }
    
    public String getButtonsBackground()
    {
        return buttonsBackground.getColor();
    }
    
    public void changeMode()
    {
        screenBackground.changeMode();
        buttonsBackground.changeMode();
    }
}
