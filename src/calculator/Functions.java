package calculator;

public class Functions {

	float a=10, b=20, c, i, j; 
    String str1= "abce", str2="abdef", str3, str4, str5;
    	
    	public void add()
    	{   c = a+b;
    	    str3 = str1 + a;
    	    str4 = b+str2;
    	    str5 = str1+str2;
    		System.out.println("Sum of integers: "+ c);
    		System.out.println("Sum of str+int: "+ str3 );
    		System.out.println("Sum of int+str: "+ str4 );
    		System.out.println("Sum of str+str: "+ str5 );
    	}
    	public void divide()
    	{
    		
    		System.out.println();
    		System.out.println();
    		System.out.println("DIVIDE:");
    		i =a/b;
    		System.out.println(i);
    		
    		try
    		{ 
    		float g = Float.parseFloat(str1);
    		c = g/b;
    		}
    		catch(NumberFormatException n1)
    		{
    			System.out.println(n1);
    		}
    
    		System.out.println();
    		try
    		{ 
    		float g = Float.parseFloat(str2);
    		c = a/g;
    		}
    		catch(NumberFormatException n1)
    		{
    			System.out.println(n1);
    		}
    		
    		System.out.println();
    		String common = str1.replaceAll("[" + str2 + "]", "");
    		common += str2.replaceAll("[" +str1 +"]", "");
    		System.out.println(common);
    	}

}
	    