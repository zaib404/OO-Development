package UserCode.Factory;

import UserCode.Interface.*;
import UserCode.Displayable.*;

/**
 * DisplayFactory used to create displays.
 *
 * @author Zaib
 * @version V1
 */
public class DisplayFactory implements iDisplayFactory
{
    // instance variables

    /**
     * Constructor for objects of class DisplayFactory
     */
    public DisplayFactory()
    {
        // initialise instance variables
    }
    
    /**
     * Method createDisplay
     *
     * @param model A parameter passed 
     * @param texture A parameter passed
     * @param scale A parameter passed
     * @return The return instant display
     */
    public iDisplay createDisplay(String model, String texture, double scale)
    {
        iDisplay _display = new Display(model, texture, scale);
        
        return _display;
    }
    
}
