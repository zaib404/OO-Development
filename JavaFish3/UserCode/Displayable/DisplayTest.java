package UserCode.Displayable;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DisplayTest.
 *
 * @author Zaib Inamdar
 * @version v2
 * 
 * Test conditions:
 * 
 * 1) Construction: raises exception if models string is not pointing to a valid path.
 *                  and when texture if not pointing to a valid image file
 *                  along with if its size parameter is out of range.
 */
public class DisplayTest
{
    /**
     * Default constructor for test class DisplayTest
     */
    public DisplayTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * 1) Construction: raises exception if models string is not pointing to a valid path.
     * and when texture if not pointing to a valid image file
     * along with if its size parameter is out of range.
     */
    @Test
    public void test01()
    {
        // CREATE boolean to show when test has passed, call it pass: and set to true
        boolean pass = true;
        
        // CREATE a String, to initialise it with a correct value call it testModel.
        String testModel = "models/billboard/billgfboard.obj";
        
        // CREATE a String, to initialise it with a correct value call it testTex.
        String testTex = "textures/javaFish/JavaFish.png";
        
        // CREATE a double, to initialise it with a correct value, call it testSize.
        double testSize = 5;
        
        try
        {
            // IF testModel doesnt equal "models/billboard/billboard.obj" OR testModel doesnt equal "sphere"
            if (testModel != "models/billboard/billboard.obj" || testModel != "sphere")
            {
                //THEN SET testModel to this
                testModel = "models/billboard/billboard.obj";
            }
            
            // IF testTex doesnt equal "textures/javaFish/JavaFish.png" or any other THEN 
            if(testTex != "textures/javaFish/JavaFish.png")
            {   // THEN SET testTex to "textures/javaFish/JavaFish.png"
                testTex = "textures/javaFish/JavaFish.png";
            }
            
            // IF testSize is greater than 1 or less than 0 THEN
            if (testSize > 1 || testSize < 0)
            {
                // SET testSize to 0.3;
                testSize = 0.3;
            }
            
            // Instantiate a Display, call it testDisplay, store it in an Display container:
            Display testDisplay = new Display(testModel, testTex, testSize);
        }
        
        catch(IllegalArgumentException  e)
        {
            pass = false;
        }
        
        assertEquals(true, pass);
    }
}
