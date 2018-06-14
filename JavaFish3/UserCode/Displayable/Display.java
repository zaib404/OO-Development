package UserCode.Displayable;

import  Framework.Core;
import  env3d.Env;
import UserCode.Interface.*;

/**
 * Display Class has all the properties needed to make it displayable in the simulation
 *
 * @author Zaib Inamdar
 * @version 26/2/18
 */
public class Display implements iDisplay
{
    // instance variables
    
    // DECLARE STRING which will be a reference to the 3D model, called 'model'.
    protected String model;// = "models/billboard/billboard.obj";
    
    // DECLARE STRING which will be a reference to texture-map, called 'texture'.
    protected String texture;// = "textures/javaFish/JavaFish.png";
    
    // DECLARE BOOLEAN which will SET transparency to TRUE, called 'transparent'.
    protected boolean transparent = true;
   
    // DECLARE DOUBLE which will be the position in 3D world (x,y,z coordinates).
    protected double x = 1, y = 1, z = 1;
   
    // DECLARE DOUBLE for the orientation (about x,y,z).
    protected double rotateX = 0, rotateY = -90, rotateZ = 0;
    
    // DECLARE DOUBLE which will be the scale factor applied to model, called 'scale'.
    protected double scale = 0.15;

    /**
     * Constructor for objects of class Display
     */
    public Display(String pModel, String pTex, double pScale)
    {
        // initialise instance variables
        this.model = pModel;
        this.texture = pTex;
        this.scale = pScale;
    }
    
    /**
     * getX - Getter property for the x value. Get the X value
     *
     * @return    the x value
     */
    public double getX()
    {
        // RETURN X
        return x;
    }
    
    /**
     * setX - Setter property for the x value. Set the x value to the parameter
     *
     * @param   pX  setting the x value to be the same as the parameter.
     */
    public void setX(double pX)
    {
        // X = PX
        x = pX;
    }
    
    /**
     * getY - Getter property for the y value. Get the Y value
     *
     * @return    the y value
     */
    public double getY()
    {
        // RETURN Y
        return y;
    }
    
    /**
     * setY - Setter property for the y value. Set the y value to the parameter
     *
     * @param   pY  setting the y value to be the same as the parameter.
     */
    public void setY(double pY)
    {
        // Y = PY
        y = pY;
    }
    
    /**
     * getRotateY - Getter property for the rotateY value. Get the rotateY value
     *
     * @return    the rotateY value
     */
    public double getRotateY()
    {
        // RETURN rotateY
        return rotateY;
    }
    
    /**
     * setRotateY - Setter property for the rotateY value. Set the rotateY value to the parameter
     *
     * @param   pRotateY  setting the rotateY value to be the same as the parameter.
     */
    public void setRotateY(double pRotateY)
    {
        // rotateY = pRotateY
        rotateY = pRotateY;
    }
    
    /**
     * getRotateX - Getter property for the rotateX value. Get the rotateX value
     *
     * @return    the rotateX value
     */
    public double getRotateX()
    {
        // RETURN rotateX
        return rotateX;
    }
    
    /**
     * setRotateX - Setter property for the rotateX value. Set the rotateX value to the parameter
     *
     * @param   pRotateX  setting the rotateX value to be the same as the parameter.
     */
    public void setRotateX(double pRotateX)
    {
        // rotateX = pRotateX
        rotateX = pRotateX;
    }
    
    /**
     * getScale - Getter property for the Scale value. Get the Scale value
     *
     * @return    the Scale value
     */
    public double getScale()
    {
        // RETURN scale
        return scale;
    }
    
    /**
     * setScale - Setter property for the setScale value. Set the setScale value to the parameter
     *
     * @param   pScale  setting the setScale value to be the same as the parameter.
     */
    public void setScale(double pScale)
    {
        // scale = pScale
        scale = pScale;
    }
    
}
