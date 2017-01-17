package calculator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainClass {

	@Before
	public void initialization()
	{
		System.out.println("Calculator Started: ");
		System.out.println();
		
	}
	@Test
	public void call()
	{
		Functions fun = new Functions();
		fun.add();
		fun.divide();
		
	}
	@After
	public void close()
	{
		
		System.out.println();
		System.out.println("Calculation Done. Calculator Closed");
	}
	
	
}
