package UserCode.Interface;

import env3d.Env;

/**
 * iFoodManager - food manager to manage the food.
 *
 * @author Zaib
 * @version v1
 */
public interface iFoodManager
{
    /**
     * Method Update update to update the food so it is able to fall down
     *
     * @param world A parameter of the env3D
     */
    void Update(Env world)throws Exception;
}
