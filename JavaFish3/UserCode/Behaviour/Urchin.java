package UserCode.Behaviour;

import java.util.*;
import UserCode.Interface.*;

/**
 * Write a description of class PiranhaRed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Urchin extends Behaviour implements iMoveX
{
    // instance variables
    
    /**
     * Constructor for objects of class PiranhaRed
     */
    public Urchin(iDisplay pDisplay)
    {
        // initialise instance variables
        this._display = pDisplay;
        
        setSpeed();
    }
    
    /**
     * Constructor for objects of class Urchin
     */
    public Urchin()
    {
        // initialise instance variables
        
        //Call setSpeed method to set the speed of the Urchin randomly in the aquarium
        setSpeed();
    }
    
    public void setPosition(double[] pos)
    {
        // Assign '_xPos' randomly between 1 - 8 and '_yPos' between 1 - 6.
        _xPos = _rnd.nextDouble() * (8 - 1) + 1;
        _yPos = 1;
        
        // Assign 'pToken.x' to equal _xPos
        _display.setX(_xPos);
        
        // Assign 'pToken.y' to equal _yPos
        _display.setY(_yPos);
        
        pos[0] = _xPos;
        pos[1] = _yPos;
    }
    
    public void setSpeed()
    {
        // Assign '_xSpeed' randomly between 0.005 - 0.05;
        _xSpeed = _rnd.nextFloat() * (0.05f - 0.005f) + 0.005f;
    }
    
    public void swimX()
    {
        _xPos += _xSpeed;
        
        _display.setX(_xPos);
    }
    
    public void Update()
    {
        swimX();        
        boundaryDetection();
    }
}
