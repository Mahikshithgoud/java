package Day4;

public class prog1 {

	
	public static void main(String[] args) {
		int max=20;
for(int r=1;r<=5;r++)
{ 
	for(int i=1;i<=max;i++) 
{
	System.out.print(" ");
}	for(int c=1;c<=r;c++)
	{
		System.out.print("*"+"  ");
	}
	
	System.out.println();
max=max-3;
}      
	}
}	
