/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stoffer
 */
public class BLLFileSearchManagerTest
{
    
    public BLLFileSearchManagerTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getInstance method, of class BLLFileSearchManager.
     */
    @Test
    public void testGetInstance() throws Exception
    {
        System.out.println("getInstance");
        BLLFileSearchManager expResult = null;
        BLLFileSearchManager result = BLLFileSearchManager.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWords method, of class BLLFileSearchManager.
     */
    @Test
    public void testGetWords() throws Exception
    {
        System.out.println("getWords");
        BLLFileSearchManager instance = new BLLFileSearchManager();
        ArrayList expResult = null;
        ArrayList result = instance.getWords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beginsWith method, of class BLLFileSearchManager.
     */
    @Test
    public void testBeginsWith() throws Exception
    {
        System.out.println("beginsWith");
        String text = "";
        BLLFileSearchManager instance = new BLLFileSearchManager();
        ArrayList expResult = null;
        ArrayList result = instance.beginsWith(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endsWith method, of class BLLFileSearchManager.
     */
    @Test
    public void testEndsWith() throws Exception
    {
        System.out.println("endsWith");
        String text = "";
        BLLFileSearchManager instance = new BLLFileSearchManager();
        ArrayList expResult = null;
        ArrayList result = instance.endsWith(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exactWith method, of class BLLFileSearchManager.
     */
    @Test
    public void testExactWith() throws Exception
    {
        System.out.println("exactWith");
        String text = "";
        BLLFileSearchManager instance = new BLLFileSearchManager();
        ArrayList expResult = null;
        ArrayList result = instance.exactWith(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsWith method, of class BLLFileSearchManager.
     */
    @Test
    public void testContainsWith() throws Exception
    {
        System.out.println("containsWith");
        String text = "";
        BLLFileSearchManager instance = new BLLFileSearchManager();
        ArrayList expResult = null;
        ArrayList result = instance.containsWith(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
