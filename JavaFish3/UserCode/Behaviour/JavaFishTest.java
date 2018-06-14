package UserCode.Behaviour;


import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JavaFishTest.
 *
 * @author  Zaib
 * @version V1
 * 
 *  * Test conditions:
 * 
 * 1) Ensuring that the JavaFish has a speed between the range of 0.05 - 0.005
 * 2) Ensuring the JavaFish class is able to have random x and y positions
 * 
 */
public class JavaFishTest
{
    // DECLARE a JavaFish, call it _javafish:
    private JavaFish _javafish;
    
    /**
     * Default constructor for test class JavaFishTest
     */
    public JavaFishTest()
    {
        _javafish = new JavaFish();
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
     * 1) Ensuring that the JavaFish has a speed between the range of 0.05 - 0.005
     */
    @Test
    public void testSpeed()
    {
        Random _rnd = new Random();
        
        // DECALRE float, call it _minRange. Which holds the value 0.005f;        
        float _minRange = 0.005f;
        
        // DECALRE float, call it _maxRange. Which holds the value 0.05f;
        float _maxRange = 0.05f;
        
        // DECALRE float, call it _testSpeed. Which stores the result of _javafish.setSpeed();  
        float _testSpeed = _javafish._xSpeed;
        
        // TEST to check to see if _testSpeed is greater than _minRange or _testSpeed is less than _maxRange
        assertTrue(_testSpeed >= _minRange || _testSpeed <= _maxRange);
        
    }
    
    /**
     * 2) Ensuring the JavaFish class is able to have random x and y positions
     */
    @Test
    public void testPosition()
    {
        // DECALRE boolean with a return value called rtnVal SET to TRUE
        boolean rtnVal = true;
        
        // DECALRE double, call it _testXPos. Which stores the result of _javafish._xPos();
        double _testXPos = _javafish._xPos;
        
        // DECALRE double, call it _testYPos. Which stores the result of _javafish._yPos;
        double _testYPos = _javafish._yPos;
        
        // IF _testXPos is greater than 8 or less than 1 OR _testYPos is less than 1 or greater than 6 THEN
        if(_testXPos > 8 || _testXPos < 1 || _testYPos < 1 || _testYPos > 6)
        {
            // rtnVal = FALSE;
            rtnVal = false;
        }
        
        // TEST to see if pass equals to rtnVal
        assertEquals(true, rtnVal);
        
    }
}
