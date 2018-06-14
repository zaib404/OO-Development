package UserCode.Input;

import env3d.Env;
import java.util.*;
import UserCode.Interface.*;

/**
 * Handles Mouse Events
 * 
 * @author Zaib Inamdarr
 * @version 1
 */
public class MouseHandler implements iMousePublisher
{    
    // instance variables:
    
    // DECALRE a List to iMouseListener to be able to store mouse listeners. 
    // Call it _listeners;
    private List<iMouseListener> _listeners;
    
    /**
     * Constructor for objects of class MouseHandler
     *
     */
    public MouseHandler()
    {
        // initialise instance variables:
        _listeners = new ArrayList<iMouseListener>();
    }
    
    public void Register(iMouseListener listen)
    {
        // add
        _listeners.add(listen);
    }
    
    public void Unregister(iMouseListener listen)
    {
        // remove
        _listeners.remove(listen);
    }
    
    public void Update(Env world)
    {
        // local variables:
        // DECLARE an int[] array for the mouse pointer value
        // INITIALISE: to -1,-1
        int[] mouseVal = {-1,-1};
        
        // IF: the left mouse button has been clicked
        if (world.getMouseButtonClicked() == 0)
        {
            mouseVal[0] = world.getMouseX();
            mouseVal[1] = world.getMouseY();
            
            // Advanced four loop
            for (iMouseListener l : _listeners)
            {
                l.onMouse(mouseVal);
            }
        }
    }
    
}