package UserCode.Interface;


/**
 * Interface for the iDisplayFactory used for the factory method
 *
 * @author Zaib Inamdar
 * @version V1
 */
public interface iDisplayFactory
{
    /**
     * Method createDisplay - used to create a display
     *
     * @param model A parameter passed to the model string
     * @param texture A parameter passed to the texture string
     * @param scale A parameter passed to the scale 
     * @return the iDisplay
     */
    iDisplay createDisplay(String model, String texture, double scale);
}
