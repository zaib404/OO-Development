package UserCode.Behaviour;


import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SeaHorseTest.
 *
 * @author  Zaib Inamdar
 * @version v2
 * 
 * Test conditions:
 * 
 * 1) Ensuring that the SeaHorse has a speed between the range of 0.05 - 0.005
 * 2) Ensuring the SeaHorse class is able to have random x and y positions
 */
public class SeaHorseTest
{
    // DECLARE a SeaHorse, call it _seahorse:
    private SeaHorse _seahorse;
    
    /**
     * Default constructor for test class SeaHorseTest
     */
    public SeaHorseTest()
    {
        // initialise instance variables
        _seahorse = new SeaHorse();
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
     * 1) Ensuring that the SeaHorse has a speed between the range of 0.05 - 0.005
     */
    @Test
    public void testSpeed()
    {
        // DECALRE boolean with a return value called pass SET to TRUE
        boolean pass = true;
        
        // DECALRE float, call it _minRange. Which holds the value 0.005f; 
        float _minRange = 0.005f;
        
        // DECALRE float, call it _maxRange. Which holds the value 0.05f;
        float _maxRange = 0.05f;
        
        // DECALRE float, call it _testSpeed. Which stores the result of _seahorse.setSpeed();
        float _testSpeedX = _seahorse._xSpeed;
        float _testSpeedY = _seahorse._ySpeed;
        
        // IF _testSpeed[0] is less than _minRange or _testSpeed[1] is less than _minRange
        // OR _testSpeed[0] is greater than _maxRange or _testSpeed[1] is greater than _maxRange THEN
        if(_testSpeedX < _minRange || _testSpeedY < _minRange || 
           _testSpeedX > _maxRange || _testSpeedY > _maxRange)
        {
            // pass = FALSE
            pass = false;
        }
        
        // TEST to see if pass equals to true
        assertEquals(true, pass);
        
    }
    
    /**
     * 2) Ensuring the SeaHorse class is able to have random x and y positions
     */
    @Test
    public void testPosition()
    {
        // DECALRE boolean with a return value called rtnVal SET to TRUE
        boolean rtnVal = true;
        
        // DECALRE double, call it _testXPos. Which stores the result of _seahorse._xPos();
        double _testXPos = _seahorse._xPos;
        
        // DECALRE double, call it _testYPos. Which stores the result of _seahorse._yPos;
        double _testYPos = _seahorse._yPos;
        
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
