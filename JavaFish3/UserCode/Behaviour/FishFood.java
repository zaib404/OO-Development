package UserCode.Behaviour;

import java.util.*;
import UserCode.Interface.*;

/**
 * Write a description of class FishFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FishFood extends Behaviour
{
    // instance variables 
    
    /**
     * Constructor for objects of class FishFood
     */
    public FishFood(iDisplay pDisplay)
    {
        // initialise instance variables
        this._display = pDisplay;
        
        setSpeed();
    }
    
    public void setPosition(double[] pos)
    {
        // Null
        _xPos = pos[0];
        _yPos = pos[1];
    }
    
    public void setSpeed()
    {
        _xSpeed = 0.025f;
        _ySpeed = 0.025f;
    }
    
    public void swimX()
    {
        /* Reference:
         * Pazos, A. (no date) A function that generates sine waves. 
         * Available at: http://funprogramming.org/41-A-function-that-generates-sine-waves.html 
         * (Accessed: 25 January 2018).
         */
        
        /* Using Sin making the bubbles make a wave motion.
         * Sin is between 1 and -1
         * X + 0.05 is making buble move 0.05 pixels side to side
         * Y / 0.015 is changing the frequency of the wave
         * the higher number makes the wave go slower 
         */
        _xPos -= 0.005 * (float)Math.sin(_display.getY() / 0.25);
        
        _display.setX(_xPos);
    }
    
    public void swimY()
    {
        _yPos -= _ySpeed;
        
        _display.setY(_yPos);
    }
    
    public void respawn()
    {
        if(_yPos < -1)
        {
            _yPos = 0;
            _xPos = 0;
        }
    }
    
    public void Update()
    {
        swimX();
        swimY();
        respawn();
    }
    
}
