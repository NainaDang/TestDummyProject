package test;

	import org.junit.Test;

import allpackage.Multiplication;
import junit.framework.Assert;
	import junit.framework.TestCase;


	public class UnitTestCases {
	     
	    @SuppressWarnings("deprecation")
		@Test
	    public void multiplicationOfZeroIntegersShouldReturnZero() {
	        Multiplication tester = new Multiplication(); // MyClass is tested
	    System.out.println("in Unit testcases for the mutilplication ");
	        // assert statements
	        
	        Assert.assertEquals(0, tester.multiply(10, 0));
	        Assert.assertEquals(0, tester.multiply(0, 10));
	        Assert.assertEquals(0, tester.multiply(0, 0));
	        System.out.println(tester.multiply(10, 2));
	    }
	}






