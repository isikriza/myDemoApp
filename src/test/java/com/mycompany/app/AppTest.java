package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testIsFound1() {
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("ali", "ayse", "mehmetcan", "fatma")); // i < j icin
      assertEquals(new App().findStrings(strings, 3, 5), "ali, ayse, fatma");
    }

    public void testIsFound2() {
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("ali", "ayse", "mehmetcan", "fatma")); // i > j icin
      assertEquals(new App().findStrings(strings, 5, 3), "ali, ayse, fatma");
    }

    public void testNotFound() {
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("ali", "ayse", "mehmetcan", "fatma"));
      assertEquals(new App().findStrings(strings, 0, 2), "");
    }

    public void testNotPositiveParam() {
      ArrayList<String> strings = new ArrayList<>(Arrays.asList("ali", "ayse", "mehmetcan", "fatma"));
      assertEquals(new App().findStrings(strings, 0, -2), null);
    }

    public void testEmptyArray() {
      ArrayList<String> strings = new ArrayList<>();
      assertEquals(new App().findStrings(strings, 0, 3), "");
    }

    public void testNull() {
      assertEquals(new App().findStrings(null, 0, 3), null);
    }

}
