package UserCode.Behaviour;

import UserCode.Displayable.*;
import UserCode.Interface.*;
import java.util.*;

/**
 * Write a description of class j here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeaHorse extends Behaviour implements iMoveX, iMoveY
{
    // instance variables

    /**
     * Constructor for objects of class SeaHorse
     */
    public SeaHorse(iDisplay pDisplay)
    {
        // initialise instance variables
        this._display = pDisplay;
        
        setSpeed();
    }
    
    /**
     * Constructor for objects of class SeaHorse used for test class
     * 
     */
    public SeaHorse()
    {
        // Assign '_xPos' randomly between 1 - 8 and '_yPos' between 1 - 6.
        _xPos = _rnd.nextDouble() * (8 - 1) + 1;
        _yPos = _rnd.nextDouble() * (6 - 1) + 1;
        
        // Call setSpeed method to set the speed of the SeaHorse randomly in the aquarium
        setSpeed();
    }
    
    public void setPosition(double[] pos)
    {
        // Assign '_xPos' randomly between 1 - 8 and '_yPos' between 1 - 6.
        _xPos = pos[0];
        _yPos = pos[1];
        
        // Assign 'pToken.x' to equal _xPos
        _display.setX(_xPos);
        
        // Assign 'pToken.y' to equal _yPos
        _display.setY(_yPos);
        //pos[0] = _xPos;
        //pos[1] = _yPos;
    }
    
    public void setSpeed()
    {
        // Assign '_xSpeed' randomly between 0.005 - 0.05;
        _xSpeed = _rnd.nextFloat() * (0.05f - 0.005f) + 0.005f;
        
        // Assign '_xSpeed' randomly between 0.005 - 0.05;
        _ySpeed = _rnd.nextFloat() * (0.05f - 0.005f) + 0.005f;
    }
    
    /**
     * Method swimX
     *
     */
    public void swimX()
    {
        _xPos += _xSpeed;
        
        _display.setX(_xPos);
    }
    
    public void swimY()
    {
        _yPos += _ySpeed;
        
        _display.setY(_yPos);
    }
    
    /**
     * Method Update
     *
     */
    public void Update()
    {
        swimX();
        swimY();
        boundaryDetection();
    }
}
