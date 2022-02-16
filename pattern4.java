package workingjava;

public class pattern3
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		/*  
		    
*
**
***
****
*****
******
*******
********
*******
******
*****
****
***
**
*



 */
		
		
		for(int j=1;j<9;j++)
		{	
			
			for(int i = 0;i<j;i++)
			{
				System.out.print("*");
			}
			
		
		System.out.println();
		}
		
		
		
		
		for(int j=7;j>0;j--)
		{
		
			for(int i=0;i<j;i++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		
		}
	
		
	}
}
