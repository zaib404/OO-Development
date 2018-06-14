package UserCode.Behaviour;

import java.util.*;
import UserCode.Interface.*;

/**
 * Abstract class Behaviour - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Behaviour implements iBehaviour
{
    // instance variables
    
    protected iDisplay _display;
    
    protected double _xPos, _yPos;
    
    protected float _xSpeed, _ySpeed;
    
    protected Random _rnd = new Random();
    
    /**
     * getX - Getter property for the x value. Get the X value
     *
     * @return    the x value
     */
    public double getXPos()
    {
        // RETURN X
        return _xPos;
    }
    
    /**
     * Method setSpeed - All behaviours will have a given speed.
     *
     */
    public abstract void setSpeed();
    
    /**
     * Method boundaryDetection - All Fishes will have a boundary detection
     *
     */
    public void boundaryDetection()
    {
        // IF _xPos is greater than 9 or less than 1 THEN flip its speed and direction
        // Note: Right Side is 9; Left Side is 1
        if (_xPos >= 9 || _xPos <= 1)
        {
            // SET rotateY to times -1
            // -90 * -1 = 90
            double rY = _display.getRotateY();
            rY *= -1;
            _display.setRotateY(rY);
            
            // SET _xSpeed to times -1
            // _xSpeed * -1 = -_xSpeed
            _xSpeed *= -1;
        }
        
        // IF _yPos is greater than 6 or less than 1 THEN flip its speed
        // Note: Top is 7, Bottom is 1
        if(_yPos >= 7 || _yPos <= 1)
        {
            // SET _xSpeed to times -1
            // _xSpeed * -1 = -_xSpeed
            _ySpeed *= -1;
        }
    }
    
    /**
     * Method Update - All behaviours which inherit must have a update method, which will allow fishes to move
     *
     */
    public abstract void Update();
}
