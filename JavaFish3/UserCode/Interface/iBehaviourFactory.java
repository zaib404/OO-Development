package UserCode.Interface;


/**
 * iBehaviourFactory used to create the behaviour and pass in the required class to make the behaviour and assign to display
 *
 * @author Zaib Inamdar
 * @version V2
 */
public interface iBehaviourFactory
{
    /**
     * Method Update - used for the update
     *
     */
    void Update();
    
    /**
     * Method createBehaviour used to create the behaviour
     *
     * @param bClass A parameter which creates a new instance of the class passed from the parameter
     * @param display A parameter asign display to behaviour
     * @param pos A parameter pass a position to set the position of the behaviour
     * @return The return behaviour created
     */
    <T extends iBehaviour> iBehaviour createBehaviour(Class <T> bClass, iDisplay display, 
                                                      double[] pos) throws Exception;
}
