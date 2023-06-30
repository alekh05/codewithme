/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	 int[] arr={2,6,9,0};
	 Main main=new Main();
	 int ans=main.maximum(arr);
	 System.out.println(ans);
	 
	}
	int maximum(int b[]){
		
		int max=0;
		for(int i=0;i<=b.length-1;i++)
		{
		    if(b[i]>max)
		    {
		        max=b[i];
		    }
		}
		
		return max;
	}
	
	
}
