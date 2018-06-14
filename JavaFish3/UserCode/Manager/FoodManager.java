package UserCode.Manager;

import env3d.Env;
import UserCode.Interface.*;
import UserCode.Factory.*;
import UserCode.Displayable.*;
import UserCode.Behaviour.*;

/**
 * Write a description of class BehaviourManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FoodManager implements iFoodManager, iMouseListener
{
    // instance variables
    
    // DECALRE a reference to iDisplayFactory to be able to store DisplayFactory. 
    // Call it _displayFactory;
    private iDisplayFactory _displayFactory;
    
    // DECALRE a reference to iBehaviourFactory to be able to store BehaviourFactory. 
    // Call it _behaviourFactory;
    private iBehaviourFactory _behaviourFactory;
    
    // DECLARE bool called _newFood, spawn new food when left mouse button clicked
    private boolean _newFood = false;
    
    // DECALRE int array called _mousePos with the value of -1,-1
    private int[] _mousePos = {-1, -1};
    
    /**
     * Constructor for objects of class BehaviourManager
     */
    public FoodManager()
    {
        // initialise instance variables
        _displayFactory = new DisplayFactory();
        
        _behaviourFactory = new BehaviourFactory();
    }
    
    public void onMouse(int[] mouseVal)
    {
        if((mouseVal[0]>=0.0)&&(mouseVal[1]>= 0.0))
        {
            _newFood = true;
            
            _mousePos = mouseVal;
        }
    }
    
    public void Update(Env world) throws Exception
    {
        if(_newFood)
        {
            _newFood = false;
            
            double[] pos = {_mousePos[0]*0.0077, _mousePos[1]*0.0077, 1.0};
            Display food = new Display("sphere", "textures/javaFish/FishFood.png", 0.08);
            food.setX(pos[0]);
            food.setY(pos[1]);
            
            world.addObject(food);
            
            _behaviourFactory.createBehaviour(FishFood.class, food, pos);
        }
        _behaviourFactory.Update();
    }
    
    
}
