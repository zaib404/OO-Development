package UserCode.Interface;

import env3d.Env;

/**
 * interface iMousePublisher using a observer pattern publishes mouse events to all the listeners
 *
 * @author Zaib Inamdar
 * @version v1
 */
public interface iMousePublisher
{
    /**
     * Method Register a new listener for mouse revents
     *
     * @param listen A refereence to the listener for all mouse events
     */
    void Register(iMouseListener listen);
    
    /**
     * Method Unregister listener for mouse events
     *
     * @param listen A refereence to the listener for all mouse events
     */
    void Unregister(iMouseListener listen);
    
    /**
     * Method Update mouse state called on each update loop
     *
     * @param world A reference to env3D
     */
    void Update(Env world);
}
