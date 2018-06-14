package UserCode.Factory;

import java.util.*;
import UserCode.Interface.*;
import UserCode.Behaviour.*;

/**
 * BehaviourFactory called to create new behaviours of classes
 *
 * @author Zaib
 * @version v1
 */
public class BehaviourFactory implements iBehaviourFactory
{
    // instance variables
    
    // DECALRE a List to iBehaviour to be able to store behaviour. 
    // Call it _behaviour;
    private List<iBehaviour> _behaviour;
    
    /**
     * Constructor for objects of class BehaviourFactory
     */
    public BehaviourFactory()
    {
        // initialise instance variables
        _behaviour = new ArrayList<iBehaviour>();
    }
    
    /**
     * Method createBehaviour generic method which creates new behaviour passing in the parameters
     *
     * @param behaviourClass A parameter used to get the requireed class needed
     * @param display A parameter assign the behaviour to have a display
     * @param pos A parameter -  pass in the position 
     * @return The return the behaviour 
     */
    public <T extends iBehaviour> iBehaviour createBehaviour(Class <T> behaviourClass, 
                                                             iDisplay display, double[] pos) throws Exception
    {
        T newBehaviour = behaviourClass.getConstructor(iDisplay.class).newInstance(display);
        newBehaviour.setPosition(pos);
        _behaviour.add(newBehaviour);
        
        return newBehaviour;
    }
    
    /**
     * Method Update - used to call the update of the behaviours
     *
     */
    public void Update()
    {
        // for (int i = 0; i < _behaviour.size(); i++)
        // {
            // _behaviour.get(i).Update();
        // }
        for (iBehaviour b : _behaviour)
        {
            b.Update();
        }
    }
}
