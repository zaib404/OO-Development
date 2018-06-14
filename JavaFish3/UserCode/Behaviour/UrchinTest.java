package UserCode.Behaviour;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UrchinTest.
 *
 * @author  Zaib Inamdar
 * @version v2
 * 
 * Test conditions:
 * 
 * 1) Ensuring that the Urchin has a speed between the range of 0.05 - 0.005
 */
public class UrchinTest
{
    // instance variables
    
    // DECLARE a Urchin, call it _urchin:
    private Urchin _urchin;
    
    /**
     * Default constructor for test class UrchinTest
     */
    public UrchinTest()
    {
        // initialise instance variables
        _urchin = new Urchin();
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
     * 1) Ensuring that the Urchin has a speed between the range of 0.05 - 0.005
     */
    @Test
    public void testSpeed()
    {
        // DECALRE float, call it _minRange. Which holds the value 0.005f;        
        float _minRange = 0.005f;
        
        // DECALRE float, call it _maxRange. Which holds the value 0.05f;
        float _maxRange = 0.05f;
        
        // DECALRE float, call it _testSpeed. Which stores the result of _urchin.setSpeed();  
        float _testSpeed = _urchin._xSpeed;
        
        // TEST to check to see if _testSpeed is greater than _minRange or _testSpeed is less than _maxRange
        assertTrue(_testSpeed >= _minRange || _testSpeed <= _maxRange);
        
    }
}
