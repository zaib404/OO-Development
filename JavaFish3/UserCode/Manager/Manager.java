package UserCode.Manager;

import env3d.Env;
import Framework.Core;

import java.util.*;
import UserCode.Displayable.*;
import UserCode.Interface.*;
import UserCode.Factory.*;
import UserCode.Behaviour.*;
import UserCode.Input.*;

/**
 * Write a description of class BehaviourManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manager implements iManager
{
    // instance variables
    
    // DECLARE a reference to the instance of the 'Env' (environment) class, call it '_world':
    private Env _world;
    
    // DECALRE a reference to iDisplayFactory to be able to store DisplayFactory. 
    // Call it _displayFactory;
    private iDisplayFactory _displayFactory;
    
    // DECALRE a List to iDisplay to be able to store display. 
    // Call it _display;
    private List<iDisplay> _display;
    
    // DECALRE a reference to iBehaviourFactory to be able to store BehaviourFactory. 
    // Call it _behaviourFactory;
    private iBehaviourFactory _behaviourFactory;
    
    // DECALRE a List to iBehaviour to be able to store behaviour. 
    // Call it _behaviour;
    private List<iBehaviour> _behaviour;
    
    // DECALRE a reference to iMousePublisher to be able to store iMousePublisher. 
    // Call it _mouse;
    private iMousePublisher _mouse;
    
    // DECALRE a reference to iFoodManager to be able to store iFoodManager. 
    // Call it _food;
    private iFoodManager _food;
    
    // DECALRE a double to be able to store the position. 
    // Call it _position;
    private double[] position = {1,1};
    
    // DECALRE a Random to be a random gen. 
    // Call it _rnd;
    private Random _rnd = new Random();
    
    /**
     * Constructor for objects of class BehaviourManager
     */
    public Manager() throws Exception
    {
        // initialise instance variables
        _food = new FoodManager();
        _mouse = new MouseHandler();
        _displayFactory = new DisplayFactory();
        _display = new ArrayList<iDisplay>();
        
        _behaviourFactory = new BehaviourFactory();
        _behaviour = new ArrayList<iBehaviour>();
        
        _mouse.Register((iMouseListener) _food);
    }
    
    /**
     * Method Populate add the display and behaviour
     *
     * @param world A parameter env3D pass it to simulation
     */
    public void Populate(Env world) throws Exception
    {
        for (int i = 0; i < 10; i++)
        {
            // Random Pos
            position[0] = _rnd.nextDouble() * (8 - 1) + 1;
            position[1] = _rnd.nextDouble() * (6 - 1) + 1;
            
            // JavaFish
            _display.add(_displayFactory.createDisplay
            ("models/billboard/billboard.obj","textures/javaFish/JavaFish.png",0.15));
            
            _behaviour.add(_behaviourFactory.createBehaviour
            (JavaFish.class, _display.get(i), position));
                        
            // Add display
            world.addObject(_display.get(i));
        }
        
        for (int i = 10; i < 11; i++)
        {
            // Random Pos
            position[0] = _rnd.nextDouble() * (8 - 1) + 1;
            position[1] = _rnd.nextDouble() * (6 - 1) + 1;
            
            // Piranha
            _display.add(_displayFactory.createDisplay
            ("models/billboard/billboard.obj","textures/javaFish/PiranhaRed.png",0.15));
            
            _behaviour.add(_behaviourFactory.createBehaviour
            (Piranha.class, _display.get(i), position));
            
            // ADD
            world.addObject(_display.get(i));
        }
        
        for (int i = 11; i < 12; i++)
        {
            // Random Pos
            position[0] = _rnd.nextDouble() * (8 - 1) + 1;
            position[1] = _rnd.nextDouble() * (6 - 1) + 1;
            
            // Piranha Green
            _display.add(_displayFactory.createDisplay
            ("models/billboard/billboard.obj","textures/javaFish/PiranhaGreen.png",0.15));
            
            _behaviour.add(_behaviourFactory.createBehaviour
            (Piranha.class, _display.get(i), position));
            
            // Add
            world.addObject(_display.get(i));
        }
        
        for (int i = 12; i < 13; i++)
        {
            // Random Pos
            position[0] = _rnd.nextDouble() * (8 - 1) + 1;
            position[1] = _rnd.nextDouble() * (6 - 1) + 1;
            
            // SEAHORSE
            _display.add(_displayFactory.createDisplay
            ("models/billboard/billboard.obj","textures/javaFish/Seahorse.png",0.15));
            
            _behaviour.add(_behaviourFactory.createBehaviour
            (SeaHorse.class, _display.get(i), position));
            
            // Add
            world.addObject(_display.get(i));
        }
        
        for (int i = 13; i < 14; i++)
        {
            _display.add(_displayFactory.createDisplay
            ("models/billboard/billboard.obj","textures/javaFish/Urchin.png",0.15));
            
            _behaviour.add(_behaviourFactory.createBehaviour
            (Urchin.class, _display.get(i), position));
            
            world.addObject(_display.get(i));
        }
        
        for (int i = 14; i < 30; i++)
        {
            // Random Pos
            position[0] = _rnd.nextDouble() * (8 - 1) + 1;
            position[1] = _rnd.nextDouble() * (6 - 1) + 1;
            
            // Bubbles
            _display.add(_displayFactory.createDisplay
            ("sphere","textures/javaFish/Bubble.png",0.05));
            
            _behaviour.add(_behaviourFactory.createBehaviour
            (Bubble.class, _display.get(i), position));
            
            // Add
            world.addObject(_display.get(i));
        }
    }
    
    /**
     * Method Update -- used to call in simuation update loop
     *
     * @param world A parameter passes a env3d
     */
    public void Update(Env world) throws Exception
    {
        _behaviourFactory.Update();
        _mouse.Update(world);
        _food.Update(world);
    }
    
}
