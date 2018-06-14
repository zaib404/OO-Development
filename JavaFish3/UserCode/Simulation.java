package UserCode;

///////////////////////////////////////////////////////////////////////////////////////////////////
// Notes:
// * Add code to this as necessary to produce your simulation.
// * Use comments to clearly highlight your code that has been added.
// * Acknowledge/cite appropriately any added code that is not your own.
///////////////////////////////////////////////////////////////////////////////////////////////////
import env3d.Env;
import Framework.Core;
import java.util.*;

import UserCode.Displayable.*;
import UserCode.Interface.*;
import UserCode.Factory.*;
import UserCode.Behaviour.*;
import UserCode.Input.*;
import UserCode.Manager.*;

/**
 * Simulation is the top-level class for the Aquarium simulation.
 * 
 * @author Zaib Inamdar & Marc Price
 * @version 0.5
 */
public class Simulation
{
    // instance variables:
    // DECLARE a reference to the instance of the Core class, call it '_core':
    private Core _core;
    
    // DECLARE a reference to the instance of the 'Env' (environment) class, call it '_world':
    private Env _world;
    
    // DECLARE a boolean that signals when the simulation loop should be exited:
    private boolean endSim = false;
    
    // DECLARE a reference to iManager call it _Manager
    private iManager _Manager;
    
    /**
     * Author Marc Price 
     * 
     * Static Main method used for creating standalone apps
     *
     * @param       args the command-line arguments
     */
    public static void main(String[] args) throws Exception
    {
        Simulation sim = new Simulation();
        sim.run();
    }
    
    /**
     * Constructor for objects of class Simulation
     */
    public Simulation() throws Exception
    {
        // INITIALISE instance variables:
        // _core:, _Manager
        _core = new Core();
        
        _Manager = new Manager();
        
    }
    
    /**
     * METHOD: Run the simulation loop.  User presses escape to exit.
     *
     */
    public void run() throws Exception
    {
        // CREATE the environment:
        _world = _core.createWorld();
        
        //ADD Tokens to 3D world:
        _Manager.Populate(_world);
        
        // Start simulation loop:
        while (!endSim)
        {
            // UPDATE STAGE:
            // IF: user has requested simulation loop exit (ie escape pressed):
            if (_world.getKey() == 1)
            {
                // SET: render loop exit condition
                endSim = true;
            }
            
            // UPDATE Objects in 3D world:
            _Manager.Update(_world);
            
            // RENDER STAGE
            // UPDATE: the environment
            _core.updateWorld();
        }
        
        // EXIT: cleanly by closing-down the environment:
        _core.destroyWorld();
        
    }
    
}
