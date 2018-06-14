package UserCode.Interface;


/**
 * iBehaviour defines the interface for all behaviour objects to have behaviours within the simulation.
 *
 * @author Zaib Inamdar
 * @version 26/2/18
 */
public interface iBehaviour
{
    /**
     * Method Update - Objects which implement iBehaviour. 
     * Will have a update method enabling it to move in the aquarium.
     */
    void Update();
    
    /**
     * Method setPosition all displayable objects need to have the object of setting its position
     *
     * @param pos pass a double array
     */
    void setPosition(double[] pos);
}
