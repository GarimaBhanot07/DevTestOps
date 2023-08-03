package TestCases;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helper.ReadFromTextFile;

/**
 * This test class
 * has 3 test methods
 * @author garimabhanot
 *
 */

public class TestClass {

	int sum=0, diff=0, quotient=0;
	ReadFromTextFile read;
	String lineFromFile;
	int a,b;
	
	@BeforeClass
	public void initialize() {
		read=new ReadFromTextFile();
		String lineFromFile=read.readRandomLineFromFile();
		a = Integer.parseInt(lineFromFile.split(",")[0]);
		System.out.println("a is "+a);
		b = Integer.parseInt(lineFromFile.split(",")[1]);
		System.out.println("b is "+b);
	}	
	
	/**
	 * This test method 
	 * checks whether sum of given 
	 * numbers is more than 0 or not
	 */
	@Test
	public void Test01_VerifySumAmountIsMoreThanZero() {
	
		sum= a + b;
		System.out.println("sum is "+sum);
		Assert.assertTrue(sum>0);
	}
	
	/**
	 * This test method 
	 * checks whether difference
	 *  of given numbers is 
	 *  more than 0 or not
	 */
	@Test
	public void Test02_VerifyDiffereneAmountIsMoreThanZero() {
		diff=a-b;
		System.out.println("diff is "+diff);
		Assert.assertTrue(diff>0);
	}
	
	/**
	 * This test method 
	 * checks whether quotient
	 *  of given numbers is 
	 *  more than 0 or not
	 */
	@Test
	public void Test03_VerifyRemainderAmountIsMoreThanZero() {
		
		quotient=a/b;
		System.out.println("quotient is "+quotient);
		Assert.assertTrue(quotient>0);
	}
	
}
