package workingjava;

public class triangle
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		System.out.println();
		/*  
		    
           * 
          * *
         *   *
        *     *
       *       *
      *         *
     *           *
    *             *
   *               *
  *                 *
 *                   *
* * * * * * * * * * * * 



 */
		
	     
		System.out.println("           * ");
		int r=10;
		int k=0;
		for(int i = 0;i<10;i++)
		{
		
			for(int j=r;j>0;j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=-1;j<k;j++)
			{
				System.out.print(" ");
			}
			
			
			System.out.print("*");
			System.out.println();
			r--;
			k=k+2;
			
			
		}
		for(int j=0;j<12;j++)
		{
			System.out.print("* ");
		}
	
		
	}
}
