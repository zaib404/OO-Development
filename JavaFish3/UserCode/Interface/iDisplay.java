package UserCode.Interface;


/**
 * iDisplay defines the interface for all displayable objects within the aquarium
 *
 * @author Zaib
 * @version 05/03/18
 */
public interface iDisplay
{
    // Insert Code
    
    // DECLARE STRING which will be a reference to the 3D model, called 'model'.
    String model = "";
    
    // DECLARE STRING which will be a reference to texture-map, called 'texture'.
    String texture = "";
    
    // DECLARE BOOLEAN which will SET transparency to TRUE, called 'transparent'.
    boolean transparent = true;
   
    // DECLARE DOUBLE which will be the position in 3D world (x,y,z coordinates).
    double x = 1, y = 1, z = 1;
   
    // DECLARE DOUBLE for the orientation (about x,y,z).
    double rotateX = 0, rotateY = -90, rotateZ = 0;
    
    // DECLARE DOUBLE which will be the scale factor applied to model, called 'scale'.
    double scale = 0.15;
    
    /**
     * getX - Getter property for the x value. Get the X value
     *
     * @return    the x value
     */
    double getX();
    
    /**
     * setX - Setter property for the x value. Set the x value to the parameter
     *
     * @param   pX  setting the x value to be the same as the parameter.
     */
    void setX(double pX);
    
    /**
     * getY - Getter property for the y value. Get the Y value
     *
     * @return    the y value
     */
    double getY();
    
    /**
     * setY - Setter property for the y value. Set the y value to the parameter
     *
     * @param   pY  setting the y value to be the same as the parameter.
     */
    void setY(double pY);
    
    /**
     * getRotateY - Getter property for the rotateY value. Get the rotateY value
     *
     * @return    the rotateY value
     */
    double getRotateY();
    
    /**
     * setRotateY - Setter property for the rotateY value. Set the rotateY value to the parameter
     *
     * @param   pRotateY  setting the rotateY value to be the same as the parameter.
     */
    void setRotateY(double pRotateY);
    
    /**
     * getRotateX - Getter property for the rotateX value. Get the rotateX value
     *
     * @return    the rotateX value
     */
    double getRotateX();
    
    /**
     * setRotateX - Setter property for the rotateX value. Set the rotateX value to the parameter
     *
     * @param   pRotateX  setting the rotateX value to be the same as the parameter.
     */
    void setRotateX(double pRotateX);
    
    /**
     * getScale - Getter property for the Scale value. Get the Scale value
     *
     * @return    the Scale value
     */
    double getScale();
    
    /**
     * setScale - Setter property for the setScale value. Set the setScale value to the parameter
     *
     * @param   pScale  setting the setScale value to be the same as the parameter.
     */
    void setScale(double pScale);
}
