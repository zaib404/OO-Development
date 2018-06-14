package UserCode.Interface;

import env3d.Env;

/**
 * iManager acts as the interface for the Manager which enables it to populate the world
 *
 * @author Zaib
 * @version v1
 */
public interface iManager
{
    /**
     * Method Update - Update method to be called in the simuation 
     *
     * @param world A parameter of the env3D
     */
    void Update(Env world)throws Exception;
    
    /**
     * Method Populate - adds all the display and behaviours and displays it on to screen
     *
     * @param world A parameter of the env3D
     */
    void Populate(Env world) throws Exception;
}
