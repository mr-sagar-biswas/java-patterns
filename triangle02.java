package workingjava;

public class triangle02
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		System.out.println();
		/*  
		    
* * * * * * * * * * * * 
 *                   *
  *                 *
   *               *
    *             *
     *           *
      *         *
       *       *
        *     *
         *   *
          * *
           *



 */
		
			
		
		for(int j=0;j<12;j++)
		{
			System.out.print("* ");
		}
	
		System.out.println();
		
		
		
		int x=1;
		int y=19;
		for(int i =0;i<10;i++)
		{
			
			for(int j=0;j<x;j++)
			{
				System.out.print(" ");
			}
			
			
			
			
			System.out.print("*");
			
			for(int j=y;j>0;j--)
			{
				System.out.print(" ");
			}
			
			
			
			System.out.print("*");
			System.out.println();
			x++;
			y-=2;
		}
		
		
		
		
		
		System.out.println("           * ");
		
	}
}
